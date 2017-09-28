package bi.baiqiu.service;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public interface IndustryTrendService {

	Map<String, Object> getDay(String brandOrStore, String[] storeArr, Date begin,
			Date end);

	Map<String, Object> getMonth(String brandOrStore, String[] storeArr, Date begin,
			Date end);

	Map<String, Object> getYear(String brandOrStore, String[] storeArr, int i, int j);
	/**
	 * @param name
	 * @return
	 * 查询店铺名称
	 */
	Set<String> queryIndustryStoreName(); 
	/**
	 * @param name
	 * @return
	 * 查询品牌名称
	 */
	Set<String> queryIndustryBrandName(); 

}
