package bi.baiqiu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class StoreCheckAvailable {
	// map 存储所有的店铺及起止日期
	private static Logger logger = Logger.getLogger(StoreCheckAvailable.class);

	// 存储所有namePlate和name 及 对应起止时间的集合
	private static Map<String, ShopCheck> map = new HashMap<String, ShopCheck>();

	public static final SimpleDateFormat FORMAT = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public static final SimpleDateFormat FORMAT2 = new SimpleDateFormat(
			"yyyy-MM-dd");
	static {
		try {
			logger.info("StoreCheckAvailable.start");
			// 6ixty8ight官方旗舰店 6IXTY8IGHT 2017-05-01 2019-04-30
			map.put("6ixty8ight官方旗舰店",
					new ShopCheck("6ixty8ight官方旗舰店", FORMAT2
							.parse("2017-05-01"), FORMAT2.parse("2019-04-30")));
			map.put("6IXTY8IGHT",
					new ShopCheck("6ixty8ight官方旗舰店", FORMAT2
							.parse("2017-05-01"), FORMAT2.parse("2019-04-30")));
			// TODO
			// ace箱包旗舰店 ace

			// achette雅氏旗舰店 achette 2018-12-31
			map.put("achette雅氏旗舰店",
					new ShopCheck("achette雅氏旗舰店", FORMAT2.parse("2018-12-31")));
			map.put("achette",
					new ShopCheck("achette雅氏旗舰店", FORMAT2.parse("2018-12-31")));

			// agnesb官方旗舰店 agnesb 2016-08-15 2017-07-31

			map.put("agnesb官方旗舰店",
					new ShopCheck("agnesb官方旗舰店", FORMAT2.parse("2017-07-31")));
			map.put("agnesb",
					new ShopCheck("agnesb官方旗舰店", FORMAT2.parse("2017-07-31")));

			// alexandredeparis旗舰店 ADP 2017-03-01 2019-02-28
			map.put("alexandredeparis旗舰店", new ShopCheck("alexandredeparis旗舰店",
					FORMAT2.parse("2017-03-01"), FORMAT2.parse("2019-02-28")));
			map.put("ADP",
					new ShopCheck("alexandredeparis旗舰店", FORMAT2
							.parse("2017-03-01"), FORMAT2.parse("2019-02-28")));

			// antipodes海外旗舰店 ANTIPODES 2015-08-01 2017-07-31

			map.put("antipodes海外旗舰店",
					new ShopCheck("antipodes海外旗舰店", FORMAT2.parse("2017-09-10")));
			map.put("ANTIPODES",
					new ShopCheck("antipodes海外旗舰店", FORMAT2.parse("2017-09-10")));

			// aromatherapy海外旗舰店 aa 2017-03-31
			map.put("aromatherapy海外旗舰店", new ShopCheck("aromatherapy海外旗舰店",
					FORMAT2.parse("2017-03-31")));
			map.put("aa",
					new ShopCheck("aromatherapy海外旗舰店", FORMAT2
							.parse("2017-03-31")));
			// TODO
			// braunbuffel男鞋旗舰店 braunbuffel
			// braunbuffel箱包旗舰店 braunbuffel box

			// cambridgesatchel csc 2017-06-30
			map.put("cambridgesatchel", new ShopCheck("cambridgesatchel",
					FORMAT2.parse("2017-06-30")));
			map.put("csc",
					new ShopCheck("cambridgesatchel", FORMAT2
							.parse("2017-06-30")));

			// clarksJD clarksJD 2017-02-01 2018-01-31

			map.put("clarksJD",
					new ShopCheck("clarksJD", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));
			map.put("clarksJD",
					new ShopCheck("clarksJD", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));

			// clarksVIP+小红书 clarksVIP+小红书 2017-02-01 2018-01-31

			map.put("clarksVIP+小红书",
					new ShopCheck("clarksVIP+小红书", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));
			map.put("clarksVIP+小红书",
					new ShopCheck("clarksVIP+小红书", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));

			// clarks女鞋旗舰店 clarks女鞋 2017-02-01 2018-01-31
			map.put("clarks女鞋旗舰店",
					new ShopCheck("clarks女鞋旗舰店", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));
			map.put("clarks女鞋",
					new ShopCheck("clarks女鞋旗舰店", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));

			// clarks童鞋旗舰店 clarks童鞋 2017-02-01 2018-01-31
			map.put("clarks童鞋旗舰店",
					new ShopCheck("clarks童鞋旗舰店", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));
			map.put("clarks童鞋",
					new ShopCheck("clarks童鞋旗舰店", FORMAT2.parse("2017-02-01"),
							FORMAT2.parse("2018-01-31")));

			// claudiepierlot旗舰店 CP 2017-04-01 2019-03-31
			
			// claudiepierlot官方旗舰店

			map.put("claudiepierlot旗舰店", new ShopCheck("claudiepierlot旗舰店",
					FORMAT2.parse("2017-04-01"), FORMAT2.parse("2019-03-31")));
			map.put("CP",
					new ShopCheck("claudiepierlot旗舰店", FORMAT2
							.parse("2017-04-01"), FORMAT2.parse("2019-03-31")));

			// cpu旗舰 c.p.u. 2015-05-15 2019-06-30
			map.put("cpu旗舰",
					new ShopCheck("cpu旗舰", FORMAT2.parse("2019-06-30")));
			map.put("c.p.u.",
					new ShopCheck("cpu旗舰", FORMAT2.parse("2019-06-30")));

			// delsey箱包旗舰店 delsey 2016-09-01 2017-12-31

			map.put("delsey箱包旗舰店",
					new ShopCheck("delsey箱包旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("delsey",
					new ShopCheck("delsey箱包旗舰店", FORMAT2.parse("2017-12-31")));

			// edhardy旗舰店 edhardy 2017-04-01 2019-03-31

			map.put("edhardy旗舰店",
					new ShopCheck("edhardy旗舰店", FORMAT2.parse("2017-04-01"),
							FORMAT2.parse("2019-03-31")));
			map.put("edhardy",
					new ShopCheck("edhardy旗舰店", FORMAT2.parse("2017-04-01"),
							FORMAT2.parse("2019-03-31")));

			// elle服饰配件旗舰店 elle acc

			// elle箱包官方旗舰店 elle 2017-12-31
			map.put("elle箱包官方旗舰店",
					new ShopCheck("elle箱包官方旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("elle",
					new ShopCheck("elle箱包官方旗舰店", FORMAT2.parse("2017-12-31")));
			// estate旗舰店 estate 2015-12-31
			map.put("estate旗舰店",
					new ShopCheck("estate旗舰店", FORMAT2.parse("2015-12-31")));
			map.put("estate",
					new ShopCheck("estate旗舰店", FORMAT2.parse("2015-12-31")));

			// fossil官方旗舰店 FOSSIL 2016-03-15 2017-12-31
			map.put("fossil官方旗舰店",
					new ShopCheck("fossil官方旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("FOSSIL",
					new ShopCheck("fossil官方旗舰店", FORMAT2.parse("2017-12-31")));
			// geox健乐士女鞋旗舰店 geox woman 2016-12-31

			map.put("geox健乐士女鞋旗舰店",
					new ShopCheck("geox健乐士女鞋旗舰店", FORMAT2.parse("2016-12-31")));
			map.put("geox woman",
					new ShopCheck("geox健乐士女鞋旗舰店", FORMAT2.parse("2016-12-31")));

			// geox健乐士官方旗舰店 geox 2016-12-31
			map.put("geox健乐士官方旗舰店",
					new ShopCheck("geox健乐士官方旗舰店", FORMAT2.parse("2016-12-31")));
			map.put("geox",
					new ShopCheck("geox健乐士官方旗舰店", FORMAT2.parse("2016-12-31")));
			// geox健乐士童鞋旗舰店 geox kids 2016-12-31
			map.put("geox健乐士童鞋旗舰店",
					new ShopCheck("geox健乐士童鞋旗舰店", FORMAT2.parse("2016-12-31")));
			map.put("geox kids",
					new ShopCheck("geox健乐士童鞋旗舰店", FORMAT2.parse("2016-12-31")));
			// gfferre箱包旗舰店 gfferre

			// jeep服饰旗舰店 jeep 2017-03-31
			map.put("jeep服饰旗舰店",
					new ShopCheck("jeep服饰旗舰店", FORMAT2.parse("2017-03-31")));
			map.put("jeep",
					new ShopCheck("jeep服饰旗舰店", FORMAT2.parse("2017-03-31")));

			// jessiejane旗舰店 jessiejane 2017-12-31
			map.put("jessiejane旗舰店",
					new ShopCheck("jessiejane旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("jessiejane",
					new ShopCheck("jessiejane旗舰店", FORMAT2.parse("2017-12-31")));
			// kenzo男鞋旗舰店 kenzo
			// kipling官方旗舰店 kipling 2018-03-31
			map.put("kipling官方旗舰店",
					new ShopCheck("kipling官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("kipling",
					new ShopCheck("kipling官方旗舰店", FORMAT2.parse("2018-03-31")));
			// TODO
			// lesportsac旗舰店 LESPORTSAC 2017-07-19
			// lesportsac创想专卖店供应商、lesportsac创想专卖店
			map.put("lesportsac旗舰店",
					new ShopCheck("lesportsac旗舰店", FORMAT2.parse("2017-07-19")));
			map.put("lesportsac创想专卖店供应商", new ShopCheck("lesportsac旗舰店",
					FORMAT2.parse("2017-07-19")));
			map.put("lesportsac创想专卖店",
					new ShopCheck("lesportsac旗舰店", FORMAT2.parse("2017-07-19")));
			map.put("LESPORTSAC",
					new ShopCheck("lesportsac旗舰店", FORMAT2.parse("2017-07-19")));

			// liujo瑠久官方旗舰店 liujo 2017-07-01 2019-12-31
			map.put("liujo瑠久官方旗舰店",
					new ShopCheck("liujo瑠久官方旗舰店", FORMAT2.parse("2017-07-01"),
							FORMAT2.parse("2019-12-31")));
			map.put("liujo",
					new ShopCheck("liujo瑠久官方旗舰店", FORMAT2.parse("2017-07-01"),
							FORMAT2.parse("2019-12-31")));
			// TODO
			// loake旗舰店 loake
			// TODO
			// maje官方旗舰店 maje 2016-04-01 2018-03-31
			// maje旗舰店

			map.put("maje官方旗舰店",
					new ShopCheck("maje官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("maje旗舰店",
					new ShopCheck("maje官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("maje",
					new ShopCheck("maje官方旗舰店", FORMAT2.parse("2018-03-31")));
			// TODO
			// mcs旗舰店 mcs
			// minnetonka海外旗舰店 mntk abroad
			// outdoorproducts旗舰 outdoorproducts

			// pandora潘多拉官方旗舰店 PANDORA 2016-10-17 2018-10-31
			// pandora潘多拉旗舰店
			map.put("pandora潘多拉官方旗舰店",
					new ShopCheck("pandora潘多拉官方旗舰店", FORMAT2
							.parse("2018-10-31")));
			map.put("pandora潘多拉旗舰店",
					new ShopCheck("pandora潘多拉官方旗舰店", FORMAT2
							.parse("2018-10-31")));
			map.put("PANDORA",
					new ShopCheck("pandora潘多拉官方旗舰店", FORMAT2
							.parse("2018-10-31")));
			// TODO
			// paraboot官方旗舰店 paraboot
			// Pinko Pinko

			// rossmann海外旗舰店 Rossmann 2016-10-01 2017-12-31
			map.put("rossmann海外旗舰店",
					new ShopCheck("rossmann海外旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("Rossmann",
					new ShopCheck("rossmann海外旗舰店", FORMAT2.parse("2017-12-31")));
			// salad旗舰店 salad 2016-02-01 2017-12-31
			map.put("salad旗舰店",
					new ShopCheck("salad旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("salad",
					new ShopCheck("salad旗舰店", FORMAT2.parse("2017-12-31")));
			// TODO
			// sandro官方旗舰店 sandro 2016-04-01 2018-03-31
			// sandro女装旗舰店、sandro女装官方旗舰店
			map.put("sandro官方旗舰店",
					new ShopCheck("sandro官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("sandro女装旗舰店",
					new ShopCheck("sandro官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("sandro女装官方旗舰店",
					new ShopCheck("sandro官方旗舰店", FORMAT2.parse("2018-03-31")));
			map.put("sandro",
					new ShopCheck("sandro官方旗舰店", FORMAT2.parse("2018-03-31")));
			// sense1991旗舰店 sense1991 2016-07-31
			map.put("sense1991旗舰店",
					new ShopCheck("sense1991旗舰店", FORMAT2.parse("2016-07-31")));
			map.put("sense1991",
					new ShopCheck("sense1991旗舰店", FORMAT2.parse("2016-07-31")));
			// skagen官方旗舰店 skagen 2016-03-15 2017-12-31

			map.put("skagen官方旗舰店",
					new ShopCheck("skagen官方旗舰店", FORMAT2.parse("2017-12-31")));
			map.put("skagen",
					new ShopCheck("skagen官方旗舰店", FORMAT2.parse("2017-12-31")));
			// swatch斯沃琪官方旗舰店 swatch 2017-05-01 2018-06-30
			map.put("swatch斯沃琪官方旗舰店",
					new ShopCheck("swatch斯沃琪官方旗舰店",
							FORMAT2.parse("2017-05-01"), FORMAT2
									.parse("2018-06-30")));
			map.put("swatch",
					new ShopCheck("swatch斯沃琪官方旗舰店",
							FORMAT2.parse("2017-05-01"), FORMAT2
									.parse("2018-06-30")));
			// tissot天梭官方旗舰店 Tissot 2016-11-01 2018-02-28
			map.put("tissot天梭官方旗舰店",
					new ShopCheck("tissot天梭官方旗舰店", FORMAT2.parse("2018-02-28")));
			map.put("Tissot",
					new ShopCheck("tissot天梭官方旗舰店", FORMAT2.parse("2018-02-28")));

			// toms旗舰店 TOMS 2017-06-01 2019-05-31
			map.put("toms旗舰店",
					new ShopCheck("toms旗舰店", FORMAT2.parse("2017-06-01"),
							FORMAT2.parse("2019-05-31")));
			map.put("TOMS",
					new ShopCheck("toms旗舰店", FORMAT2.parse("2017-06-01"),
							FORMAT2.parse("2019-05-31")));
			// vsvelsus旗舰店 Vsvelsus 2017-04-30
			map.put("vsvelsus旗舰店",
					new ShopCheck("vsvelsus旗舰店", FORMAT2.parse("2017-04-30")));
			map.put("Vsvelsus",
					new ShopCheck("vsvelsus旗舰店", FORMAT2.parse("2017-04-30")));

			// watchstation旗舰店 watchstation 2016-03-15 2017-12-31
			map.put("watchstation旗舰店",
					new ShopCheck("watchstation旗舰店", FORMAT2
							.parse("2017-12-31")));
			map.put("watchstation",
					new ShopCheck("watchstation旗舰店", FORMAT2
							.parse("2017-12-31")));
			// TODO
			// weleda官方海外旗舰店 weleda
			// weleda海外旗舰店

			// why旗舰店 why 2018-01-31
			map.put("why旗舰店",
					new ShopCheck("why旗舰店", FORMAT2.parse("2018-01-31")));
			map.put("why", new ShopCheck("why旗舰店", FORMAT2.parse("2018-01-31")));

			// wmf旗舰店 wmf 2016-12-31

			map.put("wmf旗舰店",
					new ShopCheck("wmf旗舰店", FORMAT2.parse("2016-12-31")));
			map.put("wmf", new ShopCheck("wmf旗舰店", FORMAT2.parse("2016-12-31")));
			// yellowearth旗舰店 yellowearth 2019-12-31
			map.put("yellowearth旗舰店",
					new ShopCheck("yellowearth旗舰店", FORMAT2.parse("2019-12-31")));
			map.put("yellowearth",
					new ShopCheck("yellowearth旗舰店", FORMAT2.parse("2019-12-31")));
			// 丹尼爱特箱包旗舰店 dh
			// 凯特周官方旗舰店 KateZhou 2019-12-31
			map.put("凯特周官方旗舰店",
					new ShopCheck("凯特周官方旗舰店", FORMAT2.parse("2019-12-31")));
			map.put("KateZhou",
					new ShopCheck("凯特周官方旗舰店", FORMAT2.parse("2019-12-31")));
			// 唯颂旗舰店 WS 2017-05-01 2018-12-31
			map.put("唯颂旗舰店", new ShopCheck("唯颂旗舰店",
					FORMAT2.parse("2017-05-01"), FORMAT2.parse("2018-12-31")));
			map.put("WS", new ShopCheck("唯颂旗舰店", FORMAT2.parse("2017-05-01"),
					FORMAT2.parse("2018-12-31")));
			// 圣大保罗官方旗舰店 sbprc 2017-03-31
			map.put("圣大保罗官方旗舰店",
					new ShopCheck("圣大保罗官方旗舰店", FORMAT2.parse("2017-03-31")));
			map.put("sbprc",
					new ShopCheck("圣大保罗官方旗舰店", FORMAT2.parse("2017-03-31")));
			// TODO
			// 服饰新客户 服饰新客户
			// 梦特娇女鞋旗舰店 montagut woman
			// 梦特娇男鞋旗舰店 montagut
			// 梦特娇皮具官方旗舰店 montagut box
			// 歌力思JD 歌力思JD 2017-05-01 2018-12-31
			map.put("歌力思JD", new ShopCheck("歌力思JD",
					FORMAT2.parse("2017-05-01"), FORMAT2.parse("2018-12-31")));
			map.put("歌力思JD", new ShopCheck("歌力思JD",
					FORMAT2.parse("2017-05-01"), FORMAT2.parse("2018-12-31")));
			// 歌力思官方旗舰店 ELSY 2017-05-01 2018-12-31
			map.put("歌力思官方旗舰店",
					new ShopCheck("歌力思官方旗舰店", FORMAT2.parse("2017-05-01"),
							FORMAT2.parse("2018-12-31")));
			map.put("ELSY",
					new ShopCheck("歌力思官方旗舰店", FORMAT2.parse("2017-05-01"),
							FORMAT2.parse("2018-12-31")));
			// 箱包新客户 箱包新客户
			// 西村名物旗舰店 nishimura
			// 迷你唐卡旗舰店 minnetonka
			// 鞋履新客户 鞋履新客户
			// 魅力惠 魅力惠 2017-03-31
			map.put("魅力惠", new ShopCheck("魅力惠", FORMAT2.parse("2017-03-31")));
			map.put("魅力惠", new ShopCheck("魅力惠", FORMAT2.parse("2017-03-31")));
			// 魅力惠天猫国际 魅力惠天猫国际 2017-03-31
			map.put("魅力惠天猫国际",
					new ShopCheck("魅力惠天猫国际", FORMAT2.parse("2017-03-31")));
			map.put("魅力惠天猫国际",
					new ShopCheck("魅力惠天猫国际", FORMAT2.parse("2017-03-31")));
			
//			clarks官方旗舰店  2017-09-15
			map.put("clarks官方旗舰店",
					new ShopCheck("clarks官方旗舰店", FORMAT2.parse("2017-09-15"),FORMAT2.parse("2018-09-15")));
			map.put("clarks-man",
					new ShopCheck("clarks官方旗舰店", FORMAT2.parse("2017-09-15"),FORMAT2.parse("2018-09-15")));
			
//			gabor旗舰店  2017-09-15
			map.put("gabor旗舰店",
					new ShopCheck("gabor旗舰店", FORMAT2.parse("2017-09-15"),FORMAT2.parse("2018-09-15")));
			map.put("gabor旗舰店",
					new ShopCheck("gabor旗舰店", FORMAT2.parse("2017-09-15"),FORMAT2.parse("2018-09-15")));
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat FORMA = new SimpleDateFormat("yyyyMMddhh");
		Date date = FORMA.parse("2017010101");
		System.out.println(date);
		Date date2 = FORMAT2.parse("2017-03-31");
		// for (String key : map.keySet()) {
		// System.out.println("|" + key + "|:"
		// + FORMAT2.format(map.get(key).getEnd()));
		// }

		System.out.println(date2.getMonth());
	}

	/**
	 * @param namePlate
	 *            shop表中的 name_plat
	 * @param timeStr
	 *            : "yyyy-MM-dd HH:mm:ss"
	 * @return 在所属的时间段之内,返回true,否则为false;
	 */
	public static boolean vailableTimeStr(String namePlate, String timeStr) {
		try {
			Date paytime = FORMAT.parse(timeStr);
			if (StringUtils.isBlank(namePlate) || StringUtils.isBlank(timeStr)) {
				return false;
			} else {
				ShopCheck check = map.get(namePlate);
				if (check == null) {
					// 没有这个店铺
					logger.debug(namePlate + " not found");
					return false;
				} else {
					// 找到店铺根据时间判断
					return sign2(check.getBegin(), paytime, check.getEnd());
				}
			}

		} catch (ParseException e) {
			logger.info(timeStr + "时间格式错误");
			return false;
		}
	}

	/**
	 * @param name
	 *            shop表中的 name
	 * @param time
	 * @return 在所属的时间段之内,返回true,否则为false;
	 */
	public static boolean vailableTime(String name, Date time) {
		if (StringUtils.isBlank(name) || time == null) {
			return false;
		} else {
			ShopCheck check = map.get(name);
			if (check == null) {
				// 没有这个店铺
				// logger.debug(name + " not found");
				return false;
			} else {
				// 找到店铺根据时间判断
				return sign2(check.getBegin(), time, check.getEnd());
			}
		}
	}
	
	public static boolean vailableAlipay(String name, Date time) {
		if (StringUtils.isBlank(name) || time == null) {
			return false;
		} else {
			ShopCheck check = map.get(name);
			if (check == null) {
				// 没有这个店铺
				// logger.debug(name + " not found");
				return false;
			} else {
				// 找到店铺根据时间判断
				return sign2(check.getBegin(), time, check.getEnd());
			}
		}
	}
	/**
	 * @param begin
	 * @param time
	 * @param end
	 * @return 判断time 是否在begin,end之间 end 为null的时候 代表end 为无限大
	 */
	public static boolean sign(Date begin, Date time, Date end) {
		if (time.before(begin)) {
			return false;
		} else if (end != null && time.after(end)) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean sign2(Date begin, Date time, Date end) {
		if (end == null && begin == null) {
			return true;
		} else if (end != null && begin != null) {
			if (time.after(begin) && time.before(end)) {
				return true;
			} else {
				return false;
			}
		} else if (end != null && begin == null) {
			return time.before(end);
		}
		return true;
	}
}

class ShopCheck {

	// 1 begin 不为空
	// 2 end 不为空
	Date begin = null;
	Date end = null;
	String name = null;

	/**
	 * @param begin
	 * @param end
	 * @param name
	 */
	public Date getBegin() {
		return begin;
	}

	public Date getEnd() {
		return end;
	}

	public String getName() {
		return name;
	}

	public ShopCheck() {
		super();
	};

	public ShopCheck(String name) {
		super();
		this.name = name;
	};

	public ShopCheck(String name, Date end) {
		super();
		this.name = name;
		this.end = end;
	}

	public ShopCheck(String name, Date begin, Date end) {
		super();
		this.begin = begin;
		this.end = end;
		this.name = name;
	}

	public ShopCheck(String name, String end) throws ParseException {
		super();

		this.name = name;
		this.end = StoreCheckAvailable.FORMAT2.parse(end);
	}

	public ShopCheck(String name, String begin, String end)
			throws ParseException {
		super();
		this.name = name;
		this.begin = StoreCheckAvailable.FORMAT2.parse(begin);
		this.end = StoreCheckAvailable.FORMAT2.parse(end);
	}
}