package bi.baiqiu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bi.baiqiu.mapper.DailyTargetMapper;
import bi.baiqiu.page.PageBean;
import bi.baiqiu.pojo.DailyTarget;
import bi.baiqiu.pojo.User;

@Service
@Transactional()
public class DailyTargetServiceImpl {
		@Autowired
		private DailyTargetMapper dailyTargetDao;

		@Autowired 
		private RedisServiceImpl redisServiceImpl;
		
		/**统计日计划的合计
		 * @param daily
		 * @return
		 */
		public List<Map<String, String>>getDailyMonthTargetSum(DailyTarget daily) throws Exception{
			return dailyTargetDao.getDailyMonthTargetNum(daily);
		}
		
		/**插入单条日计划
		 * @param dailyTarget
		 * @throws Exception
		 */
		public void insertDailyTarget(DailyTarget dailyTarget) throws Exception{
			dailyTargetDao.insert(dailyTarget);
		}
		/**插入多条日计划
		 * @param list
		 * @return
		 * @throws Exception
		 */
		@Transactional(noRollbackFor=DataAccessException.class)
		public int insertDailyTargetByBatch(List<DailyTarget>list,User user) throws Exception{
			return dailyTargetDao.insertByBatch(list);
		}
		/**批量删除
		 * @param idArray
		 * @return
		 * @throws Exception
		 */
		public int deleteDailyTargetByBatch(int [] idArray) throws Exception{
			return dailyTargetDao.batchDeleteDailyTarget(idArray);
		}
		/**多条日计划新增或者修改
		 * @param list
		 * @return
		 * @throws Exception
		 */
		
	public void insertOrUpdateDailyTargetByBatch(List<DailyTarget> dailyTargets) throws Exception {

		List<DailyTarget> insertDailyTargets = new ArrayList<>();
		List<DailyTarget> updateDailyTargets = new ArrayList<>();
		for (DailyTarget dailyTarget : dailyTargets) {
			if (dailyTarget.getId() == null)
				insertDailyTargets.add(dailyTarget);
			else
				updateDailyTargets.add(dailyTarget);
		}if(insertDailyTargets.size()>0)
		dailyTargetDao.insertByBatch(insertDailyTargets);
		if(updateDailyTargets.size()>0)
		dailyTargetDao.updateDaliypTargetByBatch(updateDailyTargets);
	}
	/**当数据修改时调用redis 的更新方法改变缓存数据
	 * @param user
	 */
	public void SaveRedis(User user){
		try {
			DailyTarget dailyRedis=new DailyTarget();
			dailyRedis.setShopId(user.getShopId());
			List<DailyTarget> dailyTargetsRedis=dailyTargetDao.queryDailyTarget(dailyRedis,new PageBean().setMeToDefault());
			redisServiceImpl.saveDailyTargetToRedis(user,dailyTargetsRedis );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
