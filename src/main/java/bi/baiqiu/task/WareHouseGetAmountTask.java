package bi.baiqiu.task;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo.WareHouseExample;
import bi.baiqiu.task.GetDateTread.RunGetDateTread;




/**@version: v1.0.0
 * @author Jared
 *@date  Creat Time : 2017年9月20日 上午10:52:42
 * @Description: 该类的功能描述
 */
@Component
public class WareHouseGetAmountTask {
	@Autowired
	private WareHouseMapper wareHouse;
	@Autowired
	@Qualifier("sqlSessionTemplate1")
	private SqlSessionTemplate sqlSessionTemplateSys;
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;

	/**   
	* @Function: WareHouseGetAmountTask.java
	* @Description: 定时从erp、各个店铺数据库拉取发货信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: Administrator
	* @date: 2017年9月20日 上午11:21:10 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年9月20日     Administrator           v1.0.0               修改原因
	*/
	
	//@Scheduled(fixedDelay = 30 * 1000)
	public void getDate() {
		try {
			WareHouseExample wareHouseExample = new WareHouseExample();
			wareHouseExample.setOrderByClause("sort");
			wareHouseExample.createCriteria().andFacetEqualTo(true).andVisibleEqualTo(true);

//			获取需要拉取的数据按照sort排序		
			List<WareHouse> list = wareHouse.selectByExample(wareHouseExample);
//			每个店铺一个线程拉取该店铺的发货数据
			for (WareHouse w : list) {
				GetDateTread get = new GetDateTread(sqlSessionTemplateSys, sqlSessionTemplate, w);
				RunGetDateTread run = get.new RunGetDateTread();
				taskExecutor.execute(run);
			}
		} catch (Exception e) {
			taskExecutor.destroy();
			e.printStackTrace();
		}
	}
}
