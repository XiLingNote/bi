package bi.baiqiu.task;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import bi.baiqiu.mapper.FirstStartMapper;
import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.pojo.FirstStart;
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
	@Autowired
	private FirstStartMapper firstStartDao;
	Logger logger=Logger.getLogger(this.getClass());

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
	
	@Scheduled(fixedDelay = 30 * 1000)
	public void getDate() {
		Date d1=new Date();
		try {

			int status =0;
			//id为5的数据决定定时器是否执行，状态为1时执行
			FirstStart first=firstStartDao.selectByPrimaryKey(new Byte("5"));
			if(first!=null&&first.getStatus()==1){
				logger.info("WareHouseGetAmountTask --getDate--start--");
				//记录数据初始状态,更改状态防止重复启动
				status=first.getStatus();
				first.setStatus(-1);
				firstStartDao.updateByPrimaryKey(first);
				WareHouseExample wareHouseExample = new WareHouseExample();
				wareHouseExample.setOrderByClause("sort");
				wareHouseExample.createCriteria().andFacetEqualTo(true).andVisibleEqualTo(true);
//				获取需要拉取的数据按照sort排序		
				List<WareHouse> list = wareHouse.selectByExample(wareHouseExample);
//				每个店铺一个线程拉取该店铺的发货数据
				for (WareHouse w : list) {
					GetDateTread get = new GetDateTread(sqlSessionTemplateSys, sqlSessionTemplate, w);
					RunGetDateTread run = get.new RunGetDateTread();
					taskExecutor.execute(run);
				}	
				Date d2=new Date();
				while(taskExecutor.getActiveCount()>0){
					Thread.sleep(10);
				}
				//定时器结束时归还状态
				FirstStart firstCentre=firstStartDao.selectByPrimaryKey(new Byte("5"));
				if(firstCentre!=null&&firstCentre.getStatus()==-1){
					first.setStatus(status);
				}
				first.setJdpModify(new Date());
				firstStartDao.updateByPrimaryKey(first);
				logger.info("WareHouseGetAmountTask --getDate--end--useTime:"+(d2.getTime()-d1.getTime())+"ms");

			}
		} catch (Exception e) {
			taskExecutor.destroy();
			e.printStackTrace();
			logger.error(e.getMessage());

		}
	}
}
