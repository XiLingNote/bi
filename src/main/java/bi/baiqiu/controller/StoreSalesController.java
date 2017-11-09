package bi.baiqiu.controller;

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
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import bi.baiqiu.pojo.PromotionDetailShowPojo;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.StoreSaleService;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;
import bi.baiqiu.utils.KeyUtils;
import bi.baiqiu.utils.UtilTool;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
@RequestMapping("store")
public class StoreSalesController extends BaseController {
	Logger logger = Logger.getLogger(StoreSalesController.class);
	@Autowired
	private StoreSaleService storeSaleService;
	@Autowired
	private JedisPool jedisPool;
	@ResponseBody
	@RequestMapping(value = "month", produces = "text/html;charset=UTF-8")
	public String monthSales(Model model, HttpServletRequest request) {
		String amountType = request.getParameter("amountType");
		String department = request.getParameter("department");
		Map<String, Object> map = storeSaleService.queryThisMonth(amountType, department);
		String json = GsonUtils.gson.toJson(map);
		return json;
	}

	/**
	 * @Function: StoreSalesController.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: FengCheng
	 * @date: 2017年7月21日 上午9:56:39
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年7月21日 FengCheng v1.0.0 修改原因
	 */

	@ResponseBody
	@RequestMapping("storeSalesDemonstrate")
	public String storeSalesDemonstrate(Model model, HttpServletRequest request) {
		// String amountType = request.getParameter("amountType");
		// String department = request.getParameter("department");
		// cpuqijian
		String storeName = request.getParameter("storeName");
		Map<String, Object> map = storeSaleService.storeSalesDemonstrate(storeName);
		String json = GsonUtils.gson.toJson(map);
		return json;
	}

	/**
	 * @param date
	 *            日期
	 * @param type
	 *            Gmv、Alipay
	 * @return
	 */
	@ResponseBody
	@RequestMapping("daily")
	public String daliySales(@RequestParam(value = "amountType", required = false) String amountType,
			@RequestParam(value = "endStr", required = false) String endStr,
			@RequestParam(value = "dateType", required = false) String dateType) {
		Map<String, Object> map = null;

		Date date = null;
		if (StringUtils.isBlank(amountType)) {
			amountType = "GMV";
		}

		if (StringUtils.isNotBlank(endStr)) {
			try {
				date = DateUtils.YMDSin2.parse(endStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		map = storeSaleService.queryByThisDay(dateType, date, amountType);
		String json = GsonUtils.gson.toJson(map);
		return json;
	}

	/**
	 * @Function StoreSalesController.java
	 * @Description: 该函数的功能描述
	 * @param datetype
	 *            ：y m d, beginStr,endStr: 日期, store 店铺名称
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月12日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月12日 Jim 1.0.0 描述
	 */
	@ResponseBody
	@RequestMapping(value = "salesTrend", produces = "text/html;charset=UTF-8")
	public String salesTrend(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr,
			@RequestParam(value = "store", required = false) String store) {
		Map<String, Object> map = null;

		if (StringUtils.isBlank(store)) {
			return "store cannot be empty!";
		}

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

	@ResponseBody
	@RequestMapping(value = "name", produces = "text/html;charset=UTF-8")
	public String name(Model model, HttpServletRequest request) {

		Set<String> set = storeSaleService.queryStoreName();
		String json = GsonUtils.gson.toJson(set);
		return json;
	}

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
		User user=getLoginUser();
		if(user==null||user.getName()==null||"".equals(user.getName())){
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
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月3日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "storePromotion", produces = "text/html;charset=UTF-8")
	public String storePromotion(@RequestParam(value = "dateType", required = false) String dateType,
			@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr) {
		Jedis jedis=jedisPool.getResource();;
		PromotionDetailShowPojo pojoTotal;
		int userSize=5;
		try {
			User user=getLoginUser();
			if(user==null||user.getName()==null||"".equals(user.getName())){
				return LOGIN;
			}
//			Map<String, String> map=jedis.hgetAll("achettePromotionDetailDAY");
			Date startDate = DateUtils.stringToDate(beginStr);
			Date endDate = DateUtils.stringToDate(endStr);
			 startDate = DateUtils.stringToDate("2016-01-10");
			 endDate = DateUtils.stringToDate("2016-01-12");
			int EVERTIME=1;
			//中间状态
			Date midDate = DateUtils.dateAddDay(startDate,EVERTIME);
			midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			pojoTotal = new PromotionDetailShowPojo();
			do {
				String str=jedis.hget(user.getShopName()+KeyUtils.PROMOTIONDETAIL+KeyUtils.DAY,DateUtils.YMDSin1.format(startDate));
				PromotionDetailShowPojo pojo=JSON.parseObject(str,PromotionDetailShowPojo.class);
				pojoTotal.addPromotionName(pojo);
				startDate = midDate;
				midDate = DateUtils.dateAddDay(startDate,EVERTIME);
				midDate = endDate.compareTo(midDate) > 0 ? midDate : endDate;
			} while (startDate.compareTo(endDate) < 0);
			//排序排序后的集合
			 List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(pojoTotal.getOrderPromotionNameAndFee().entrySet());  
		        //然后通过比较器来实现排序  
		        Collections.sort(list,new Comparator<Map.Entry<String,String>>() {  
		            //升序排序  
		            public int compare(Entry<String, String> o1,  
		                    Entry<String, String> o2) {  
		                return new BigDecimal(o2.getValue()).compareTo(new BigDecimal(o1.getValue()));  
		            }  
		        }); 
		     //将大于指定数量的数据去除
		        String tempEntry=null;
		      for(int i=0;i<list.size();i++){
		    	  if(i>=userSize){
		    		  tempEntry=UtilTool.stringNumAdd(tempEntry,list.remove(i).getValue());
		    		  i--;
		    	  }
		      }
		      Map< String,String> tempMap=new HashMap<String, String>();
		      tempMap.put("其他", tempEntry);
		      list.addAll(tempMap.entrySet()); 
		      pojoTotal.setPromotionName(new String[list.size()+1]);
		      pojoTotal.setDetailDiscountFee(new String[list.size()+1]);
		      pojoTotal.setDetailDiscountFeeSection(new String[list.size()+1][2]);
		      String midDetailSumDiscountFee=pojoTotal.getDetailSumDiscountFee();
		      pojoTotal.getDetailDiscountFeeSection()[0][0]=midDetailSumDiscountFee;
		      pojoTotal.getDetailDiscountFeeSection()[0][1]="0";
		      pojoTotal.getPromotionName()[0]="支付金额";
		      pojoTotal.getDetailDiscountFee()[0]=midDetailSumDiscountFee;
		      for(int i=0;i<list.size();i++){
		    	  pojoTotal.getDetailDiscountFee()[i+1]=list.get(i).getValue();
		    	  pojoTotal.getPromotionName()[i+1]=list.get(i).getKey();
		    	  pojoTotal.getDetailDiscountFeeSection()[i+1][0]=midDetailSumDiscountFee;//优惠金额
		    	  midDetailSumDiscountFee=UtilTool.stringNumSubtract(midDetailSumDiscountFee, list.get(i).getValue());
		    	  pojoTotal.getDetailDiscountFeeSection()[i+1][1]=midDetailSumDiscountFee;
		      }
			return GsonUtils.gson.toJson(pojoTotal);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			jedis.close();
		}
	

	}
}
