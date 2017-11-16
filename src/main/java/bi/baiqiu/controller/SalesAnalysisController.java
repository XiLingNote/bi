package bi.baiqiu.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;

import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.PromotionDetailShowPojo;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.management.StoreManagerPojo;
import bi.baiqiu.service.StoreSaleService;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;
import bi.baiqiu.utils.KeyUtils;
import bi.baiqiu.utils.UtilTool;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
@RequestMapping("salesAnalysis")
public class SalesAnalysisController extends BaseController {
	Logger logger = Logger.getLogger(SalesAnalysisController.class);
	@Autowired
	private StoreSaleService storeSaleService;
	@Autowired
	private JedisPool jedisPool;
	/**
	 * @Function: storeSale
	 * @Description:店铺销售业绩
	 * @param beginStr
	 * @param endStr
	 * @param dateType
	 * @param department
	 * @return
	 * @return String
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年11月1日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "storeSale", produces = "text/html;charset=UTF-8")
	public String storeSale(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr) {
		User user = getLoginUser();
		if (user == null || user.getName() == null || "".equals(user.getName())) {
			return LOGIN;
		}
		Map<String, Object> map = null;
		Date begin = null;
		Date end = null;
		Integer beginYear = null;
		Integer endYear = null;

		if (StringUtils.isNotBlank(beginStr)) {
			try {
				begin = DateUtils.YMDSin2.parse(beginStr);
				beginYear = begin.getYear();
			} catch (ParseException e) {
				logger.info("beginStr:" + beginStr + " error");
				return "begin date error";
			}
		}

		if (StringUtils.isNotBlank(endStr)) {
			try {
				end = DateUtils.YMDSin2.parse(endStr);
				endYear = end.getYear();
			} catch (ParseException e) {
				logger.info("endStr:" + endStr + " error");
				return "end date error";
			}
		}

		if (begin != null && end != null) {
			// 按日期查找
			if ("DAY".equals(dateType)) {
				map = storeSaleService.getDayOfMonth(user.getShopNamePlat(), begin, end);
				// 以月为单位进行查询
			} else if ("MONTH".equals(dateType)) {

				map = storeSaleService.getMonthofYear(user.getShopNamePlat(), begin, end);
			} else if ("YEAR".equals(dateType)) {

				map = storeSaleService.getYear(user.getShopNamePlat(), beginYear + 1900, endYear + 1900);
			} else {
				return null;
			}

		} else {// 缺少时间参数
			logger.info("begin or end date error");
			return "begin or end date error";
		}

		String s = GsonUtils.gson.toJson(map);
		return GsonUtils.gson.toJson(map);

	}
	/**
	 * @Function: storePromotion
	 * @Description:商品优惠
	 * @param dateType
	 * @param beginStr
	 * @param endStr
	 * @return
	 * @return String
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年11月3日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "storePromotion", produces = "text/html;charset=UTF-8")
	public String storePromotion(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr) {
		Jedis jedis = jedisPool.getResource();
		;
		PromotionDetailShowPojo pojoTotal;
		int userSize = 2;
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return LOGIN;
			}
			// Map<String, String>
			// map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
			startDate = DateUtils.stringToDate("2017-01-10");
			endDate = DateUtils.stringToDate("2017-01-12");
			int EVERTIME = 1;
			// 中间状态
			Date midDate = DateUtils.dateAddDay(startDate, EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			pojoTotal = new PromotionDetailShowPojo();
			do {
				String str = jedis.hget(user.getShopName() + KeyUtils.PROMOTIONDETAIL + KeyUtils.DAY,
						DateUtils.YMDSin1.format(startDate));
				PromotionDetailShowPojo pojo = JSON.parseObject(str, PromotionDetailShowPojo.class);
				pojoTotal.addPromotionName(pojo);
				startDate = midDate;
				midDate = DateUtils.dateAddDay(startDate, EVERTIME);
				midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			} while (startDate.compareTo(endDate) < 0);
			// 排序排序后的集合
			if (pojoTotal != null&&pojoTotal.getOrderPromotionNameAndFee()!=null) {
				List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(
						pojoTotal.getOrderPromotionNameAndFee().entrySet());
				// 然后通过比较器来实现排序
				Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
					// 升序排序
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						return new BigDecimal(o2.getValue()).compareTo(new BigDecimal(o1.getValue()));
					}
				});
				if (list.size() > userSize) {
					// 将大于指定数量的数据去除
					String tempEntry = null;

					for (int i = 0; i < list.size(); i++) {
						if (i >= userSize) {
							tempEntry = UtilTool.stringNumAdd(tempEntry, list.remove(i).getValue());
							i--;
						}
					}
					Map<String, String> tempMap = new HashMap<String, String>();
					tempMap.put("其他", tempEntry);
					list.addAll(tempMap.entrySet());
				}
				//按照前端的json需求传值
				pojoTotal.setPromotionName(new String[list.size() + 2]);
				pojoTotal.setDetailDiscountFee(new String[list.size() + 2]);
				pojoTotal.setDetailDiscountFeeSection(new BigDecimal[list.size() + 2][2]);
				String midDetailSumDiscountFee = pojoTotal.getSumTotalFee();
				pojoTotal.getDetailDiscountFeeSection()[0][0] = new BigDecimal(midDetailSumDiscountFee);
				pojoTotal.getDetailDiscountFeeSection()[0][1] = BigDecimal.ZERO;
				pojoTotal.getPromotionName()[0] = "商品总金额";
				pojoTotal.getDetailDiscountFee()[0] = midDetailSumDiscountFee;
				pojoTotal.getDetailDiscountFeeSection()[1][0] = new BigDecimal(midDetailSumDiscountFee);
				midDetailSumDiscountFee=UtilTool.stringNumSubtract(midDetailSumDiscountFee,pojoTotal.getSumPayment());
				pojoTotal.getDetailDiscountFeeSection()[1][1] = new BigDecimal(midDetailSumDiscountFee);
				pojoTotal.getPromotionName()[1] = "支付金额";
				pojoTotal.getDetailDiscountFee()[1] = midDetailSumDiscountFee;
				for (int i = 0; i < list.size(); i++) {
					pojoTotal.getDetailDiscountFee()[i + 2] = list.get(i).getValue();
					pojoTotal.getPromotionName()[i + 2] = list.get(i).getKey();
					pojoTotal.getDetailDiscountFeeSection()[i + 2][0] = new BigDecimal(midDetailSumDiscountFee);// 优惠金额
					midDetailSumDiscountFee = UtilTool.stringNumSubtract(midDetailSumDiscountFee,
							list.get(i).getValue());
					pojoTotal.getDetailDiscountFeeSection()[i + 2][1] = new BigDecimal(midDetailSumDiscountFee);
					if((i+1)==list.size()){
						pojoTotal.getDetailDiscountFeeSection()[i + 2][1] =BigDecimal.ZERO;
					}
				}
			}
			return GsonUtils.gson.toJson(pojoTotal);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			jedis.close();
		}

	}
	@ResponseBody
	@RequestMapping(value = "getStroeList",method=RequestMethod.POST)
	public void getStroeList(StoreManagerPojo storeManagerPojo,Integer pageNum, Integer pageSize,HttpServletRequest request,HttpServletResponse response){
		try {
			//WriteGson(response, page.getResult(),page.getTotal());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
