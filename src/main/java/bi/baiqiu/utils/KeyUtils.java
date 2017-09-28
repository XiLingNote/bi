package bi.baiqiu.utils;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class KeyUtils {
	/**
	 * 店铺部门对应redis的key name：店铺简称 jedis.hget(shortKey,name);
	 */
	public static String shortKey = "shortKey";
	/**
	 * All 公司业绩总计 key
	 */
	public static String All = "All";

	/**
	 * 4个部门
	 */
	public static String ACC = "ACC";

	public static String Bag = "Bag";

	public static String Dress = "Dress";

	public static String Shoes = "Shoes";
	/**
	 * HOUR，DAY，MONTH，YEAR
	 * 
	 * 四个维度统计数据的后半个key
	 * 
	 * hget 店铺简称、部门简称 +后半个key,对应日期
	 */
	public static final String HOUR = "HOUR";
	public static final String DAY = "DAY";
	public static final String MONTH = "MONTH";
	public static final String YEAR = "YEAR";
	/**
	 * TOTAL ：店铺合计 YESTERDAY ：昨日分计 YESTERDAYTOTAL：昨日合计
	 */
	public static final String TOTAL = "Total";
	public static final String YESTERDAY = "Yesterday";
	public static final String YESTERDAYTOTAL = "YesterdayTotal";
	public static final String TARGET="Target";
	public static final String GMV="Gmv";
	public static final String ALIPAY="Alipay";

	/**
	 * redis 部门所对应的set集合 存jedis.sadd("departments", departShort);
	 * 取jedis.smembers("departments");
	 */
	public static final String departments = "departments";

	/**
	 * 系统所用map集合中的标记
	 */
	public static String regix = "，，，";

	public static String storeMap = "storeMap";

	/**
	 * 部门简称set集合后缀
	 */
	public static String EN = "EN";

	public static String SHOPNOTFOUND = "shop not found";

}
