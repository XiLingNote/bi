package bi.baiqiu.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.HashSet;
import java.util.Set;

import com.alibaba.druid.util.StringUtils;

/**
 * 工具类
 * 
 * @author Jared
 * @time 2017年8月11日下午2:34:53
 */
public class UtilTool {

	/**
	 * 将字符串转为小数点
	 * 
	 * @param change
	 * @return
	 */
	public static String convertToDecimal(String change) {
		if (StringUtils.isEmpty(change)) {
			return "0";
		} else if (change.contains("%")) {
			BigDecimal big = new BigDecimal(change.replace("%", ""));
			if (big.compareTo(BigDecimal.ZERO) > 0)
				return String.valueOf(big.multiply(new BigDecimal("0.01")));
			else
				return "0";
		} else {
			return change;
		}
	}

	/**
	 * 字符串转为Integer 为空设为零
	 * 
	 * @param a
	 * @return
	 */
	public static String convertToStringZero(String a) {
		if (StringUtils.isEmpty(a))
			return "0";
		else
			return a;
	}

	/**
	 * 字符串转为Integer 舍去小数位
	 * 
	 * @param a
	 * @return
	 */
	public static Integer convertToInteger(String a) throws Exception {
		return Integer.valueOf(convertToStringZero((convertToString(a))));
	}

	/**
	 * 字符串转为BigInteger 舍去小数位
	 * 
	 * @param a
	 * @return
	 */
	public static BigInteger convertToBigInteger(String a) throws Exception {
		return new BigInteger(convertToStringZero(convertToString(a)));
	}

	/**
	 * 字符串转为BigInteger 舍去小数位
	 * 
	 * @param a
	 * @return
	 */
	public static String convertToString(String a) throws Exception {
		if (a.endsWith(".0000") || a.endsWith(".00")) {
			return a.substring(0, a.lastIndexOf('.'));
		} else {
			return a;
		}
	}

	/**
	 * @Function: monthAddZero
	 * @Description:int转为string 如果小于9则在前面加上0
	 * @param month
	 * @return
	 * @return String
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年9月25日 Jared v1.0.0
	 */
	public static String monthAddZero(int month) {
		return month <= 9 ? "0" + month : "" + month;
	}

	/** 
	 * @Function: StringToBoolean 
	 * @Description:字符串时on转化为booleantrue off 为false
	 * @param str
	 * @return    
	 * @return boolean 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月25日      Jared           v1.0.0              
	*/
	public static boolean StringToBoolean(String str) {
		return "on".equals(str);
	}

	/** 
	 * @Function: StringToByte 
	 * @Description:true 转为byte1类型
	 * @param str
	 * @return    
	 * @return Byte 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月25日      Jared           v1.0.0              
	*/
	public static Byte StringToByte(String str) {
		if (StringToBoolean(str))
			return new Byte("1");
		else
			return new Byte("0");
	}
	/** 
	 * @Function: stringNumAdd 
	 * @Description:连个string类型的数字转为bigDecimal 相加返回String
	 * @param str1
	 * @param str2
	 * @return    
	 * @return String 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月9日      Jared           v1.0.0              
	*/
	public static String stringNumAdd(String str1,String str2){
		return new BigDecimal(convertToStringZero(str1)).add(new BigDecimal(convertToStringZero(str2))).toString();
	}
	/** 
	 * @Function: stringNumAdd 
	 * @Description:str1-str2的结果
	 * @param str1
	 * @param str2
	 * @return    
	 * @return String 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月9日      Jared           v1.0.0              
	*/
	public static String stringNumSubtract(String str1,String str2){
		return new BigDecimal(convertToStringZero(str1)).subtract(new BigDecimal(convertToStringZero(str2))).toString();
	}
	/** 
	 * @Function: stringUnion 
	 * @Description:两个数组的并集返回综合数组
	 * @param arr1
	 * @param arr2
	 * @return    
	 * @return String[] 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月9日      Jared           v1.0.0              
	*/
	public static  String[] stringUnion(String[] arr1, String[] arr2) {
		Set<String> hs = new HashSet<String>();
		for (String str : arr1) {
			hs.add(str);
		}
		for (String str : arr2) {
			hs.add(str);
		}
		String[] result = {};
		return hs.toArray(result);
	}
	/** 
	 * @Function: getStringArrayBySplit 
	 * @Description:返回数组的工具
	 * @param str
	 * @param strSplit
	 * @return    
	 * @return String[] 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月20日      Jared           v1.0.0              
	*/
	public static String[] getStringArrayBySplit(String str,String strSplit){
		if(str!=null){
			return str.split(strSplit);
		}else{		
			String[] result = {};
			return result;
		}
		
	}
	/** 
	 * @Function: stringPercent 
	 * @Description:两个字符串的百分比，前面分子后面分母
	 * @param numerator
	 * @param denominator
	 * @return    
	 * @return String 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年11月20日      Jared           v1.0.0              
	*/
	public static String stringPercent(String numerator,String denominator){
		if(StringUtils.isEmpty(denominator)||StringUtils.isEmpty(numerator)||new BigDecimal(denominator).compareTo(BigDecimal.ZERO)==0){
			return "0";
		}
		return String.valueOf(new BigDecimal(numerator).divide(new BigDecimal(denominator),new MathContext(4)));
	}
}
