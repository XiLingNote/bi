package bi.baiqiu.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import bi.baiqiu.pojo.PromotionDetailShowPojo;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.salesanalysis.ShowSaleSanalysisTablePojo;
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
	 * @Description:店铺销售业绩当前登录的业绩
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
			@RequestParam(value = "endStr", required = false) String endStr,String store) {
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
		//店铺为空时
		if (StringUtils.isBlank(store)) {
			store=user.getShopNamePlat();
					}
		if (begin != null && end != null) {
			// 按日期查找
			if ("DAY".equals(dateType)) {
				map = storeSaleService.getDayOfMonth(store, begin, end);
				// 以月为单位进行查询
			} else if ("MONTH".equals(dateType)) {

				map = storeSaleService.getMonthofYear(store, begin, end);
			} else if ("YEAR".equals(dateType)) {

				map = storeSaleService.getYear(store, beginYear + 1900, endYear + 1900);
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
		int userSize = 5;
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return LOGIN;
			}
			// Map<String, String>
			// map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
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
			if (pojoTotal != null && pojoTotal.getOrderPromotionNameAndFee() != null) {
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
				// 按照前端的json需求传值
				pojoTotal.setPromotionName(new String[list.size() + 2]);
				pojoTotal.setDetailDiscountFee(new String[list.size() + 2]);
				pojoTotal.setDetailDiscountFeeSection(new BigDecimal[list.size() + 2][2]);
				String midDetailSumDiscountFee = pojoTotal.getSumTotalFee();
				pojoTotal.getDetailDiscountFeeSection()[0][0] = new BigDecimal(midDetailSumDiscountFee);
				pojoTotal.getDetailDiscountFeeSection()[0][1] = BigDecimal.ZERO;
				pojoTotal.getPromotionName()[0] = "商品总金额";
				pojoTotal.getDetailDiscountFee()[0] = midDetailSumDiscountFee;
				pojoTotal.getDetailDiscountFeeSection()[1][0] = new BigDecimal(midDetailSumDiscountFee);
				midDetailSumDiscountFee = UtilTool.stringNumSubtract(midDetailSumDiscountFee,
						pojoTotal.getSumPayment());
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
					if ((i + 1) == list.size()) {
						pojoTotal.getDetailDiscountFeeSection()[i + 2][1] = BigDecimal.ZERO;
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

	/** 
	 * @Function: storeOverall 
	 * @Description:实时销售分析
	 * @param showSaleSanalysisTablePojo
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月29日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "storeOverall")
	public void storeOverall(ShowSaleSanalysisTablePojo showSaleSanalysisTablePojo, HttpServletRequest request,
			HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();

		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			jedis.close();
		}
	}

	/**
	 * @Function: storePriceRange
	 * @Description:店铺订单金额区域list
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
	 *             2017年11月17日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "getStroeList", produces = "text/html;charset=UTF-8")
	public void getStroeList(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr, HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			// Map<String, String>
			// map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
			int EVERTIME = 1;
			// 中间状态
			Date midDate = DateUtils.dateAddDay(startDate, EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			ShowSaleSanalysisTablePojo pojoTotal = new ShowSaleSanalysisTablePojo();
			do {
				String str = jedis.hget(user.getShopName() + KeyUtils.PRICERANGE + KeyUtils.DAY,
						DateUtils.YMDSin1.format(startDate));
				if (str != null) {
					ShowSaleSanalysisTablePojo pojo = JSON.parseObject(str, ShowSaleSanalysisTablePojo.class);
					pojoTotal.addPriceNumAndPayment(pojo);
				}
				startDate = midDate;
				midDate = DateUtils.dateAddDay(startDate, EVERTIME);
				midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			} while (startDate.compareTo(endDate) < 0);
			Long total=(long) 0;
			if (pojoTotal != null&&pojoTotal.getShowList()!=null){
				total=Long.valueOf(pojoTotal.getShowList().size());
			}
				WriteGson(response, pojoTotal.getShowList(), total);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

	}

	/**
	 * @Function: storePriceRange
	 * @Description:店铺订单金额区域list
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
	 *             2017年11月17日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "getStorePriceRange", produces = "text/html;charset=UTF-8")
	public void getStorePriceRange(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr, String priceRange,
			HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			// Map<String, String>
			// map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
			int EVERTIME = 1;
			// 中间状态
			Date midDate = DateUtils.dateAddDay(startDate, EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			Map<Date, BigDecimal> map = new LinkedHashMap<>();
			do {
				String str = jedis.hget(user.getShopName() + KeyUtils.PRICERANGE + KeyUtils.DAY,
						DateUtils.YMDSin1.format(startDate));
				if (str != null) {
					ShowSaleSanalysisTablePojo pojo = JSON.parseObject(str, ShowSaleSanalysisTablePojo.class);
					// 转化Array
					pojo.setPayments(pojo.getPayments());
					pojo.setPriceRanges(pojo.getPriceRanges());
					String[] pojoPaymentArray = pojo.getPaymentArray();
					String[] pojopriceRange = pojo.getPriceRangeArray();
					for (int i = 0; i < pojoPaymentArray.length; i++) {
						if (priceRange.equals(pojopriceRange[i])) {
							map.put(DateUtils.stringToDate(pojo.getPayTime()), new BigDecimal(pojoPaymentArray[i]));
						}
					}
				}
				startDate = midDate;
				midDate = DateUtils.dateAddDay(startDate, EVERTIME);
				midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			} while (startDate.compareTo(endDate) < 0);
			// 排序排序后的集合
			if (KeyUtils.DAY.equals(dateType)) {
				WriteObject(response, map);
			} else if (KeyUtils.MONTH.equals(dateType)) {
				Map<Date, BigDecimal> mapMonth = new LinkedHashMap<>();
				Map<Date, BigDecimal> mapYear = new LinkedHashMap<>();
				for (Map.Entry<Date, BigDecimal> entry : map.entrySet()) {
					System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				}
			} else if (KeyUtils.YEAR.equals(dateType)) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

	}

	/**
	 * @Function: storePriceRange
	 * @Description:店铺订单金额区域list
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
	 *             2017年11月17日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "getStorePriceRangeString", produces = "text/html;charset=UTF-8")
	public void getStorePriceRangeString(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr, String priceRange,
			HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			// Map<String, String>
			// map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
			int EVERTIME = 1;
			// 中间状态
			Date midDate = DateUtils.dateAddDay(startDate, EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			Map<String, BigDecimal> map = new LinkedHashMap<>();
			Map<String, BigDecimal> mapMonth = new LinkedHashMap<>();
			Map<String, BigDecimal> mapYear = new LinkedHashMap<>();
			do {
				String str = jedis.hget(user.getShopName() + KeyUtils.PRICERANGE + KeyUtils.DAY,
						DateUtils.YMDSin1.format(startDate));
				if (str != null) {
					ShowSaleSanalysisTablePojo pojo = JSON.parseObject(str, ShowSaleSanalysisTablePojo.class);
					// 转化Array
					pojo.setPayments(pojo.getPayments());
					pojo.setPriceRanges(pojo.getPriceRanges());
					String[] pojoPaymentArray = pojo.getPaymentArray();
					String[] pojopriceRange = pojo.getPriceRangeArray();
					for (int i = 0; i < pojoPaymentArray.length; i++) {
						if (priceRange.equals(pojopriceRange[i])) {
							BigDecimal dayValue = new BigDecimal(pojoPaymentArray[i]);
							map.put(pojo.getPayTime(), dayValue);
							String monthKey = pojo.getPayTime().substring(0, 7);
							BigDecimal monthValue = (mapMonth.get(monthKey) == null ? BigDecimal.ZERO
									: mapMonth.get(monthKey)).add(dayValue);
							mapMonth.put(monthKey, monthValue);
							String yearKey = pojo.getPayTime().substring(0, 4);
							BigDecimal yearValue = (mapYear.get(yearKey) == null ? BigDecimal.ZERO
									: mapYear.get(yearKey)).add(dayValue);
							mapYear.put(yearKey, yearValue);
						}
					}
				}else{
					String dayKey=DateUtils.YMDSin1.format(startDate);
					String monthKey=DateUtils.YMDSin1.format(startDate).substring(0, 7);
					String yearKey=DateUtils.YMDSin1.format(startDate).substring(0, 4);
					if(mapMonth.get(monthKey) == null){
						mapMonth.put(monthKey, BigDecimal.ZERO);
					}
					if(mapYear.get(yearKey) == null){
						mapYear.put(yearKey, BigDecimal.ZERO);
					}
					if(map.get(dayKey)==null){
						map.put(dayKey, BigDecimal.ZERO);
					}
				}
				startDate = midDate;
				midDate = DateUtils.dateAddDay(startDate, EVERTIME);
				midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			} while (startDate.compareTo(endDate) < 0);
			// 排序排序后的集合
			if (KeyUtils.DAY.equals(dateType)) {
				WriteObject(response, map);
			} else if (KeyUtils.MONTH.equals(dateType)) {
				WriteObject(response, mapMonth);
			} else if (KeyUtils.YEAR.equals(dateType)) {
				WriteObject(response, mapYear);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

	}//storeSalesDemonstrate
	
	/**
	 * @Function: storeSalesDemonstrate
	 * @Description:实时销售最近
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
	 *             2017年11月17日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "storeSalesDemonstrate", produces = "text/html;charset=UTF-8")
	public void getStoreSalesDemonstrate(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr, String priceRange,
			HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

	}

	/**
	 * @Function: storeSalesDemonstrate
	 * @Description:实时销售最近
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
	 *             2017年11月17日 Jared v1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "getStoreCompare", produces = "text/html;charset=UTF-8")
	public void getStoreCompare(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr, String priceRange,
			HttpServletResponse response) {
		Jedis jedis = jedisPool.getResource();
		try {
			User user = getLoginUser();
			if (user == null || user.getName() == null || "".equals(user.getName())) {
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

	}
	@ResponseBody
	@RequestMapping(value = "storeName", produces = "text/html;charset=UTF-8")
	public String name(Model model, HttpServletRequest request,String department) {
		Set<String> set = storeSaleService.queryStoreName();
		String json = GsonUtils.gson.toJson(set);
		return json;
	}
}
