package bi.baiqiu.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import bi.baiqiu.pojo.RedisPojo;
import bi.baiqiu.pojo.SortShop;
import bi.baiqiu.pojo.SortShopDrillDown;
import bi.baiqiu.service.StoreSaleService;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;
import bi.baiqiu.utils.PinYin4jUtils;

@SuppressWarnings("all")
@Service("storeSaleService")
public class StoreSaleServiceImpl implements StoreSaleService {

	@Autowired
	private JedisPool jedisPool;

	/**
	 * 查询当月的店铺销售排名
	 */

	@Override
	public Map<String, Object> queryThisMonth(String amountType,
			String department) {
		Map<String, Object> map = new HashMap<String, Object>();
		Jedis jedis = jedisPool.getResource();
		Set<String> querySet = new HashSet<String>();
		// 查询店铺集合
		Set<String> storeShorts = new HashSet<String>();
		// 所有部门
		Set<String> departments = jedis.smembers("departments");
		for (String depart : departments) {
			// 店铺集合
			Set<String> stores = jedis.smembers(depart + "EN");
			storeShorts.addAll(stores);
		}

		if (StringUtils.isNotBlank(department)) {
			if (department.equals("All")) {
				querySet = storeShorts;
			} else {
				querySet = jedis.smembers(department + "EN");
			}
		} else {
			return null;
		}

		Date date = new Date();
//		String yyyyMM = DateUtils.getyyyyMM(date);
		 String yyyyMM = "201705";
		TreeSet<SortShop> treeSet = new TreeSet<SortShop>();
		// 店铺简称
		for (String shopName : querySet) {

			String dataString = jedis.hget(shopName + "MONTH", yyyyMM);

			String name = null;
			try {

				name = URLEncoder.encode(shopName, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			if (StringUtils.isNotBlank(dataString)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(dataString,
						RedisPojo.class);
				double value;
				if (amountType.equals("GMV")) {

					value = redisPojo.getGmv().doubleValue();
				} else {
					value = redisPojo.getAlipay().doubleValue();
				}

				double b = 0.0;
				if (b == value) {
					continue;
				}
				String pinyin = PinYin4jUtils.hanziToPinyin(shopName, "");
				SortShop sortShop = new SortShop();
				sortShop.setAmount(value);
				sortShop.setShopName(name);
				sortShop.setId(pinyin);
				treeSet.add(sortShop);

			}

		}

		map.put("set", treeSet);
		List<SortShopDrillDown> arrayList = new ArrayList<SortShopDrillDown>();

		for (String shopName : querySet) {
			SortShopDrillDown drillDown = new SortShopDrillDown();
			String name = null;
			String id = null;
			try {

				name = URLEncoder.encode(shopName, "utf-8");
				id = PinYin4jUtils.hanziToPinyin(shopName, "");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			drillDown.setId(id);
			drillDown.setShopName(name);

			List<RedisPojo> redisList = new ArrayList<RedisPojo>();
			for (int i = 1; i <= 31; i++) {
				String yyyyMMdd = (i < 9) ? yyyyMM + "0" + i : yyyyMM + i;
				String dataString = jedis.hget(id + "DAY", yyyyMMdd);
				if (StringUtils.isNotBlank(dataString)) {
					RedisPojo fromJson = GsonUtils.gson.fromJson(dataString,
							RedisPojo.class);
					redisList.add(fromJson);
				}
			}
			drillDown.setList(redisList);
			arrayList.add(drillDown);
		}
		map.put("arrayList", arrayList);

		jedisPool.returnResource(jedis);
		return map;
	}

	@Override
	public Map<String, Object> queryByThisDay(String dateType, Date date,
			String type) {
		Map<String, Object> map = new HashMap<String, Object>();
		TreeSet<SortShop> treeSet = new TreeSet<SortShop>();
		if (date == null) {
			Date date2 = new Date();
			int year = date2.getYear();
			int month = date2.getMonth();
			int day = date2.getDate();
			date = new Date(year, month, day);
		}

		String yyyyMMdd = DateUtils.getyyyyMMdd(date);
		if ("YEAR".equals(dateType)) {
			yyyyMMdd = DateUtils.getyyyy(date);
		} else if ("MONTH".equals(dateType)) {
			yyyyMMdd = DateUtils.getyyyyMM(date);
		}
		// redis field
		// 获取redis客户端
		Jedis jedis = jedisPool.getResource();
		// 部门集合
		Set<String> departments = jedis.smembers("departments");
		Set<String> set = new HashSet<String>();
		// 获取店铺名称集合
		for (String department : departments) {
			Set<String> store = jedis.smembers(department + "EN");
			set.addAll(store);
		}

		for (String storeName : set) {
			String dataString = jedis.hget(storeName + dateType, yyyyMMdd);

			String name = null;
			try {
				name = URLEncoder.encode(storeName, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			if (StringUtils.isNotBlank(dataString)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(dataString,
						RedisPojo.class);
				double value;
				if (type.equals("GMV")) {

					value = redisPojo.getGmv().doubleValue();
				} else {
					value = redisPojo.getAlipay().doubleValue();
				}
				double b = 0.0;
				if (b == value) {
					continue;
				}
				SortShop sortShop = new SortShop();
				sortShop.setAmount(value);
				sortShop.setShopName(name);
				sortShop.setId(name);
				treeSet.add(sortShop);
			}
		}

		map.put("set", treeSet);
		jedisPool.returnResource(jedis);
		return map;
	}

	/**
	 * 
	 * 按天查询记录
	 * 
	 * */
	@Override
	public Map<String, Object> getDayOfMonth(String store, Date begin, Date end) {

		Map<String, Object> map = new HashMap<String, Object>();
		Set<RedisPojo> treeSet = new TreeSet<RedisPojo>();
		Jedis jedis = jedisPool.getResource();
		String name = jedis.get(store);
		int d = begin.getDate();
		int m = begin.getMonth();
		int y = begin.getYear();
		String getyyyyMMdd = DateUtils.getyyyyMMdd(end);
		int endtime = Integer.parseInt(getyyyyMMdd);
		for (int i = d;; i++) {
			Date date = new Date(y, m, i);
			String thisdate = DateUtils.getyyyyMMdd(date);
			int thistime = Integer.parseInt(thisdate);
			if (endtime < thistime) {
				break;
			}

			/*
			 * if (date.after(end)) { break; }
			 */
			String string = jedis.hget(name + "DAY", thisdate);
			if (StringUtils.isNotBlank(string)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(string,
						RedisPojo.class);
				redisPojo.setAlipayCompleteness();
				redisPojo.setCompleteness();
				treeSet.add(redisPojo);
			}

		}
		map.put("treeSet", treeSet);
		jedisPool.returnResource(jedis);
		return map;
	}

	@Override
	public Map<String, Object> getMonthofYear(String store, Date begin, Date end) {
		Jedis jedis = jedisPool.getResource();
		Map<String, Object> map = new HashMap<String, Object>();
		Set<RedisPojo> treeSet = new TreeSet<RedisPojo>();
		int y = begin.getYear();
		int m = begin.getMonth();
		int d = begin.getDate();
		String name = jedis.get(store);
		for (int i = m;; i++) {
			Date date = new Date(y, i, d);
			if (date.after(end)) {
				break;
			}
			String string = jedis.hget(name + "MONTH",
					DateUtils.getyyyyMM(date));
			if (StringUtils.isNotBlank(string)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(string,
						RedisPojo.class);
				redisPojo.setAlipayCompleteness();
				redisPojo.setCompleteness();
				treeSet.add(redisPojo);
			}
		}
		map.put("treeSet", treeSet);

		jedisPool.returnResource(jedis);
		return map;
	}

	@Override
	public Map<String, Object> getYear(String store, int y1, int y2) {
		Map<String, Object> map = new HashMap<String, Object>();
		Set<RedisPojo> treeSet = new TreeSet<RedisPojo>();
		Jedis jedis = jedisPool.getResource();
		String name = jedis.get(store);
		for (int i = y1; i <= y2; i++) {
			String string = jedis.hget(name + "YEAR", "" + i);
			if (StringUtils.isNotBlank(string)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(string,
						RedisPojo.class);
				redisPojo.setAlipayCompleteness();
				redisPojo.setCompleteness();
				treeSet.add(redisPojo);
			}
		}
		map.put("treeSet", treeSet);
		jedisPool.returnResource(jedis);
		return map;
	}

	@Override
	public Set<String> queryStoreName() {
		Jedis jedis = jedisPool.getResource();
		Set<String> departNameSet = jedis.smembers("departments");
		Set<String> storeNameSet = new HashSet<String>();
		for (String departName : departNameSet) {
			Set<String> shoes = jedis.smembers(departName);
			storeNameSet.addAll(shoes);
		}
		jedisPool.returnResource(jedis);
		return storeNameSet;
	}

	/**
	 * @see bi.baiqiu.service.StoreSaleService#storeSalesDemonstrate(java.lang.String)
	 * @Function: StoreSaleServiceImpl.java
	 * @Description: 该函数的功能描述 3.5.1.1sales 模块
	 *
	 * @param:参数描述 店铺名称简写对应表 shop : name
	 * @return：返回结果描述 
	 *                Yesterday:店铺昨日销售额，MTD_GMV：店铺本月销售额，MTD_Alipay：店铺本月支付宝收账额，GMV_Complection
	 *                ：店铺本月业绩完成率 的map
	 *                最近31天的日期，GMV，(调用getRecentlyDateAndGmvlistAndGmvavg方法)
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: FengCheng
	 * @date: 2017年7月19日 下午1:58:33
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年7月19日 FengCheng v1.0.0 修改原因
	 */
	@Override
	public Map<String, Object> storeSalesDemonstrate(String storeName) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> dateAndGmvlistAndGmvavgMap;
		double gmv = 0, alipay = 0, gmvTarget, alipayTarget, yesterday_gmv = 0, completeness = 0, alipayCompleteness = 0;
		Jedis jedis = jedisPool.getResource();
		Date date = new Date();// 取当前时间

		// int day = date.getDate();
		String month = DateUtils.getyyyyMM(date);// 本月
		/*
		 * Calendar calendar = new GregorianCalendar(); calendar.setTime(date);
		 * calendar.add(calendar.DATE,-1);//把日期往前增加一天.整数往后推,负数往前移动
		 * date=calendar.getTime(); //这个时间就是表示昨天
		 */
		String Yesterday = DateUtils.getyyyyMMdd(DateUtils.getYesterday());
		String dataString = jedis.hget(storeName + "MONTH", "201705");
		if (StringUtils.isNotBlank(dataString)) {
			RedisPojo redisPojo = GsonUtils.gson.fromJson(dataString,
					RedisPojo.class);
			gmv = redisPojo.getGmv().doubleValue();
			alipay = redisPojo.getAlipay().doubleValue();
			gmvTarget = redisPojo.getAlipay().doubleValue();
			alipayTarget = redisPojo.getAlipayTarget().doubleValue();
			redisPojo.setCompleteness();
			redisPojo.setAlipayCompleteness();
			completeness = redisPojo.getCompleteness();
			alipayCompleteness = redisPojo.getAlipayCompleteness();
		}
		String Yesterday_dataString = jedis.hget(storeName + "DAY", Yesterday);
		if (StringUtils.isNotBlank(Yesterday_dataString)) {
			RedisPojo redisPojo = GsonUtils.gson.fromJson(Yesterday_dataString,
					RedisPojo.class);
			yesterday_gmv = redisPojo.getGmv().doubleValue();
		}
		map.put("Yesterday_gmv", 123123);
		// map.put("Yesterday_gmv", yesterday_gmv);
		map.put("gmv", gmv);
		map.put("alipay", alipay);
		map.put("completeness", completeness);
		map.put("alipayCompleteness", alipayCompleteness);
		dateAndGmvlistAndGmvavgMap = getRecentlyDateAndGmvlist(storeName);
		map.putAll(dateAndGmvlistAndGmvavgMap);
		jedisPool.returnResource(jedis);

		return map;
	}

	/**
	 * @Function: StoreSaleServiceImpl.java
	 * @Description: 该函数的功能描述 获取最近31天的日期，GMV，
	 *
	 * @param:参数描述 店铺名称
	 * @return：返回结果描述 map
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: FengCheng
	 * @date: 2017年7月24日 上午10:33:46
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年7月24日 FengCheng v1.0.01 修改原因 无需gmvAvg字段
	 */
	@Override
	public Map<String, Object> getRecentlyDateAndGmvlist(String storeName) {
		String dataString;
		double gmvSum = 0;
		int recent = 31;
		double gmv;
		Map<String, Object> map = new HashMap<String, Object>();
		Jedis jedis = jedisPool.getResource();
		List<String> recentlyDate = DateUtils.getRecentlyDate(recent);// 获取近31天的日期\
		List gmvList = new ArrayList();
		for (String date : recentlyDate) {
			dataString = jedis.hget(storeName + "DAY", date);
			gmv = 0;
			if (StringUtils.isNotBlank(dataString)) {
				RedisPojo redisPojo = GsonUtils.gson.fromJson(dataString,
						RedisPojo.class);
				gmv = redisPojo.getGmv().doubleValue();

			}
			gmvList.add(gmv);
			gmvSum += gmv;
		}
		map.put("recentlyDate", recentlyDate);
		map.put("gmvlist", gmvList);
		jedisPool.returnResource(jedis);
		return map;
	}

}
