package bi.baiqiu.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.ShopTvShowTablePojo;

public interface OverAllService {
	
	/**
	 * @return
	 * 查询本自然月的数据 :  带同比
	 */
	Map<String, Object> getThisMonth(String department);

	/**
	 * @param department
	 * @param begin
	 * @return
	 * 查询整一个自然月:带同比
	 */
	Map<String, Object> getDayofWholeMonth(String department,Date begin);
	
	/**
	 * @return
	 * 自定义日期查询
	 * 按日查询
	 */
	Map<String, Object> getDayOfMonth(String department, Date begin, Date end);

	/**
	 * @return
	 * 查询整年数:  据带同比
	 */
	Map<String, Object> getMonthofWholeYear(String department, int y1);

	
	/**
	 * @param department
	 * @param begin
	 * @param end
	 * @return
	 */
	Map<String, Object> getMonthofYear(String department, Date begin, Date end);

	
	
	/**
	 * @param department
	 * @param y2
	 * @return
	 * 查询一整年的数据: 带同比
	 */
	Map<String, Object> getWholeYear(String department, int y2);

	
	
	/**
	 * @param department
	 * @param y1
	 * @param y2
	 * @return
	 * 
	 * 查询的数据 不止一个年份 :	不带同比
	 */
	Map<String, Object> getYear(String department, int y1, int y2); 
	
	/** 
	 * @Function: getBusinessHour 
	 * @Description:根据店铺名称添加到map中
	 * @param shop 店铺名称
	 * @return    
	 * @return Map<String,Object> 
	 * @throws Exception 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月25日      Jared           v1.0.0              
	*/
	Map<String,BigDecimal []> getBusinessHour(ShopBean shop,Map<String, BigDecimal []>map) throws Exception;
	/** 
	 * @Function: getBusinessHour 
	 * @Description:根据店铺名称创建map调用getBusinessHour循环添加
	 * @param shopName
	 * @return
	 * @throws Exception    
	 * @return Map<String,String[]> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月25日      Jared           v1.0.0              
	*/
	Map<String,BigDecimal []> getShopHourData(String business) throws Exception;
	
	
	/** 根据事业部查出店铺
	 * @Function: getShopBeans 
	 * @Description:
	 * @param business
	 * @return    
	 * @return List<ShopBean> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月26日      Jared           v1.0.0              
	*/
	List<ShopBean>getShopBeans(String business);

	/** 
	 * @Function: getTableshow 
	 * @Description:tv展示table展示块
	 * @param business
	 * @return
	 * @throws Exception    
	 * @return List<ShopBean> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月27日      Jared           v1.0.0              
	*/
	List<ShopBean> getTableshow(String business) throws Exception;

	/** 
	 * @Function: getBusinessMonthAndTarget 
	 * @Description:部门数据展示
	 * @param business
	 * @param businessMap
	 * @return
	 * @throws Exception    
	 * @return Map<String,BigDecimal> 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年9月27日      Jared           v1.0.0              
	*/
	Map<String, BigDecimal> getBusinessMonthAndTarget(String business)
			throws Exception;

	/** 
	 * @Function: getShopDayData 
	 * @Description:根据店铺集合获取详细数据和统计数据
	 * @param list
	 * @return
	 * @throws ParseException    
	 * @return ShopTvShowTablePojo 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月11日      Jared           v1.0.0              
	*/
	ShopTvShowTablePojo getShopDayData(List<ShopBean> list) throws ParseException;

	
}
