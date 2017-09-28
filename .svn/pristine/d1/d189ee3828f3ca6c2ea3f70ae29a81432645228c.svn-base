package bi.baiqiu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import bi.baiqiu.mapper.GoalMonthAlipMapper;
import bi.baiqiu.pojo.GoalMonthAlip;

@Transactional
@Service
public class GoalMonthAlipServiceImpl {
	@Autowired
	private GoalMonthAlipMapper alipMapper;
	
	public List<GoalMonthAlip> queryGoalMonthAlip(GoalMonthAlip goalMonthAlip){
		return alipMapper.queryGoalMonthAlip(goalMonthAlip);
		
	}

	/**
	 * 批量删除
	 * 
	 * @param idarray
	 * @return
	 */
	public int deleteGoalMonthAlipByBatch(int[] idarray) {
		return alipMapper.deleteGoalMonthAlipByBatch(idarray);

	}

	/**
	 * 批量增加
	 * 
	 * @param goals
	 * @return
	 */
	public int insertByBatch(List<GoalMonthAlip> goals) {
		return alipMapper.insertByBatch(goals);
	}

	/**
	 * 更新
	 * 
	 * @param goalMonthAlip
	 * @return
	 */
	public int insertOrupdateGoalMonthAlip(GoalMonthAlip goalMonthAlip) throws Exception{
			if(goalMonthAlip.getId()!=null){
				alipMapper.updateGoalMonthAlip(goalMonthAlip);
				return goalMonthAlip.getId();
			}
			else {
				alipMapper.insertGoalMonthAlip(goalMonthAlip);
				return goalMonthAlip.getId();
			}
				
	}

	/**
	 * 批量更新
	 * 
	 * @param goalMonthAlip
	 * @return
	 */
	public int updateGoalMonthAlipByBatch(List<GoalMonthAlip> goalMonthAlip) {
		return alipMapper.updateGoalMonthAlipBybatch(goalMonthAlip);
	}

	/**
	 * 批量更新和插入
	 * 
	 * @param goalMonthAlip
	 * @return
	 */
	public void insertAndupdateGoalMonthAlipByBatch(List<GoalMonthAlip> goalMonthAlips) throws Exception {
		List<GoalMonthAlip> insertGoalMonthAlips = new ArrayList<GoalMonthAlip>();
		List<GoalMonthAlip> updateGoalMonthAlips = new ArrayList<GoalMonthAlip>();

		for (GoalMonthAlip goal : goalMonthAlips) {
			if (goal.getId() == null)
				insertGoalMonthAlips.add(goal);
			else
				updateGoalMonthAlips.add(goal);
		}

		if (insertGoalMonthAlips.size() > 0)
			alipMapper.insertByBatch(insertGoalMonthAlips);
		if (updateGoalMonthAlips.size() > 0)
			alipMapper.updateGoalMonthAlipBybatch(updateGoalMonthAlips);

	}

}
