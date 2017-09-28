package bi.baiqiu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bi.baiqiu.pojo.DailyScheduleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.impl.DailyScheduleServiceImpl;

@Controller
@RequestMapping("dailySchedule")
public class DailyScheduleController extends BaseController {
	/**
	 * 查询
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@Autowired
	private DailyScheduleServiceImpl scheduleDao;

	@RequestMapping(value = "/queryDailySchedule.do", method = RequestMethod.POST)
	public void queryDailySchedule(HttpServletRequest request, DailyScheduleBean bean, HttpServletResponse response) {
		User user=getLoginUser();
		try {
			bean.setShopId(user.getShopId());
			WriteObject(response, scheduleDao.queryDailyschedule(bean));
		} catch (Exception e) {
			WriteMsg(response, systemErroy);
			e.printStackTrace();
		}
		;
	}

	/**
	 * 插入和更新
	 * 
	 * @param request
	 * @param bean
	 * @param response
	 */
	@RequestMapping(value = "/insertDailySchedule.do", method = RequestMethod.POST)
	public void insertDailySchedule(HttpServletRequest request, DailyScheduleBean bean, HttpServletResponse response) {
		User user=getLoginUser();
		try {
			bean.setShopId(user.getShopId());
			scheduleDao.insertDailyschedule(bean);
			WriteObject(response, saveSuccess);
		} catch (Exception e) {
			WriteMsg(response, savesErroy);
			e.printStackTrace();
		}
		;
	}

	/**
	 * 删除
	 * 
	 * @param request
	 * @param bean
	 * @param response
	 */
	@RequestMapping(value = "/deleteDailySchedule.do", method = RequestMethod.POST)
	public void deleteDailySchedule(HttpServletRequest request, DailyScheduleBean bean, HttpServletResponse response) {
		try {
			WriteObject(response, deleteSuccess + scheduleDao.deleteDailySchedule(bean.getId()));
		} catch (Exception e) {
			WriteMsg(response, deleteErroy);
			e.printStackTrace();
		}
		;
	}
}
