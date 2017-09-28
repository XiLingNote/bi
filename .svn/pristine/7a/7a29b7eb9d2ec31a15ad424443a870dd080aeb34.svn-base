package bi.baiqiu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.abel533.entity.Example;

import bi.baiqiu.mapper.DailyscheduledMapper;
import bi.baiqiu.pojo.DailyScheduleBean;

@Service
@Transactional
public class DailyScheduleServiceImpl {
	@Autowired
	private DailyscheduledMapper dailyScheduleDao;

	/**
	 * 插入单条日程
	 * 
	 * @param dailyTarget
	 * @throws Exception
	 */
	public int insertDailyschedule(DailyScheduleBean bean) throws Exception {
		if (bean.getId() == null)
			return dailyScheduleDao.insert(bean);
		else
			return dailyScheduleDao.updateByPrimaryKey(bean);

	}

	/**
	 * 删除日程
	 * 
	 * @param dailyTarget
	 * @throws Exception
	 */
	public int deleteDailySchedule(Integer id) throws Exception {
		return dailyScheduleDao.deleteByPrimaryKey(id);
	}

	/**
	 * 获取日程
	 * 
	 * @param bean
	 * @throws Exception
	 */
	public List<DailyScheduleBean> queryDailyschedule(DailyScheduleBean bean) throws Exception {
		Example ex = new Example(DailyScheduleBean.class);
		if (bean.getStartDate() != null)
			if (bean.getEndDate() != null) {
				ex.createCriteria().andBetween("startDate", bean.getStartDate(), bean.getEndDate()).andEqualTo("shopId",
						bean.getShopId());
			} else {
				ex.createCriteria().andEqualTo("startDate", bean.getStartDate()).andEqualTo("shopId", bean.getShopId());
			}
		else {
			ex.createCriteria().andEqualTo("id", bean.getId());
		}
		return dailyScheduleDao.selectByExample(ex);
	}
}
