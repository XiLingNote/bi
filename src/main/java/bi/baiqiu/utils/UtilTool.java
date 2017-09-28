package bi.baiqiu.utils;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.alibaba.druid.util.StringUtils;

/**工具类
 * 	@author Jared
 *	@time 2017年8月11日下午2:34:53
 */
public class UtilTool {

	/**将字符串转为小数点
	 * @param change
	 * @return
	 */
	public static String convertToDecimal(String change){
		if(StringUtils.isEmpty(change)){
		return "0";	
		}else if(change.contains("%"))
		{
			BigDecimal big=new BigDecimal(change.replace("%",""));
		if(big.compareTo(BigDecimal.ZERO)>0)	
			return String.valueOf(big.multiply(new BigDecimal("0.01")));	
		else
			return "0";
		}else{
			return change;
		}
	}
	
	/**字符串转为Integer 为空设为零
	 * @param a
	 * @return
	 */
	public static String convertToStringZero(String a){
		if(StringUtils.isEmpty(a))
			return "0";
		else 
			return a;
	}
	/**字符串转为Integer 舍去小数位
	 * @param a
	 * @return
	 */
	public static Integer convertToInteger(String a)throws Exception{
		return Integer.valueOf(convertToStringZero((convertToString(a))));
	}
	/**字符串转为BigInteger 舍去小数位
	 * @param a
	 * @return
	 */
	public static BigInteger convertToBigInteger(String a)throws Exception{
		return new BigInteger(convertToStringZero(convertToString(a)));
	}
	/**字符串转为BigInteger 舍去小数位
	 * @param a
	 * @return
	 */
	public static String convertToString(String a)throws Exception{
		if(a.endsWith(".0000")||a.endsWith(".00")){
			return a.substring(0,a.lastIndexOf('.'));
		}else{
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
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月25日      Jared           v1.0.0              
	*/
	public static String monthAddZero(int month){
		return month<=9?"0"+month:""+month;
	}
}
