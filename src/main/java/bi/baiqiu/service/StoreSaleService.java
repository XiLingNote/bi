package bi.baiqiu.service;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public interface StoreSaleService {

	/**
	 * @param type
	 * @param department
	 * @return 查询本月 rank
	 */
	Map<String, Object> queryThisMonth(String amountType, String department);

	/**
	 * @param date
	 * @param type
	 * @return 查询daily rank
	 */
	Map<String, Object> queryByThisDay(String dateType, Date date, String type);

	/**
	 * @return 自定义日期查询 按日查询
	 */
	Map<String, Object> getDayOfMonth(String store, Date begin, Date end);

	/**
	 * @param department
	 * @param begin
	 * @param end
	 * @return
	 */
	Map<String, Object> getMonthofYear(String store, Date begin, Date end);

	/**
	 * @param department
	 * @param y1
	 * @param y2
	 * @return
	 * 
	 */
	Map<String, Object> getYear(String store, int y1, int y2);

	/**
	 * @param name
	 * @return 查询店铺名称
	 */
	Set<String> queryStoreName();

	/**   
	* @Function: StoreSaleService.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: FengCheng
	* @date: 2017年7月26日 上午10:36:00 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年7月26日     FengCheng           v1.0.0               修改原因
	*/
	
	
	Map<String, Object> storeSalesDemonstrate(String storeName);

	/**   
	* @Function: StoreSaleService.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: FengCheng
	* @date: 2017年7月26日 上午10:39:37 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年7月26日     FengCheng           v1.0.0               修改原因
	*/
	
	
	Map<String, Object> getRecentlyDateAndGmvlist(String storeName);

}
