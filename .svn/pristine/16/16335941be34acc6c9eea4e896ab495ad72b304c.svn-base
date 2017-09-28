package bi.baiqiu.utils;

import java.math.BigDecimal;

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
}
