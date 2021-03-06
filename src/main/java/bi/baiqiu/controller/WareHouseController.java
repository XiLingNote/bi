package bi.baiqiu.controller;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.mapper.WareHouseMapper;
import bi.baiqiu.pojo.ShopTvShowTablePojo;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.WareHouse;
import bi.baiqiu.pojo.WareHouseExample;

@Controller
@RequestMapping("wareHouse")
public class WareHouseController extends BaseController {
	private static Logger logger = Logger.getLogger(WareHouseController.class);
	@Autowired
	private WareHouseMapper wareHouseDao;

	@ResponseBody
	@RequestMapping(value = "queryWareHourse.do")
	public void queryWareHourse(HttpServletRequest request,
			HttpServletResponse response) {

		Subject sub = SecurityUtils.getSubject();
		User user = (User) sub.getPrincipal();

		try {
			// Gson gson = new GsonBuilder().serializeNulls().create();
			WareHouseExample example = new WareHouseExample();
			example.createCriteria().andFacetEqualTo(true)
					.andVisibleEqualTo(true);
			example.setOrderByClause("sort");
			List<WareHouse> list = wareHouseDao.selectByExample(example);
			WareHouse totalWareHouse = new WareHouse();
			for (WareHouse war : list) {
				totalWareHouse.setNotTurnAmount(war.getNotTurnAmount()
						+ totalWareHouse.getNotTurnAmount());
				totalWareHouse.setTrunAmount(war.getTrunAmount()
						+ totalWareHouse.getTrunAmount());
				totalWareHouse.setNotPrintAmount(war.getNotPrintAmount()
						+ totalWareHouse.getNotPrintAmount());
				totalWareHouse.setDistributionAmount(war
						.getDistributionAmount()
						+ totalWareHouse.getDistributionAmount());
				totalWareHouse.setTotalSingleAmount(war.getTotalSingleAmount()
						+ totalWareHouse.getTotalSingleAmount());
				totalWareHouse.setTodayShippedAmount(war
						.getTodayShippedAmount()
						+ totalWareHouse.getTodayShippedAmount());
				totalWareHouse.setTodayShippedGeneralAmount(war
						.getTodayShippedGeneralAmount()
						+ totalWareHouse.getTodayShippedGeneralAmount());
				totalWareHouse.setTodayShippedPresellAmount(war
						.getTodayShippedPresellAmount()
						+ totalWareHouse.getTodayShippedPresellAmount());
				totalWareHouse.setLastMonthShippedAmount(war
						.getLastMonthShippedAmount()
						+ totalWareHouse.getLastMonthShippedAmount());
				totalWareHouse.setPresentMonthShippedAmount(war
						.getPresentMonthShippedAmount()
						+ totalWareHouse.getPresentMonthShippedAmount());
			}
			// String json = "{\"total\":" +gson.toJson(totalWareHouse)+
			// ",\"rows\":" + gson.toJson(list) + "}";
			WriteObject(response, totalWareHouse);
			WriteObject(response, list);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, systemErroy);
		}
	}

	/**
	 * @Function WareHouseController.java
	 * @Description: 仓库大屏幕页面
	 * @param
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @throws Exception
	 * @date 2017年9月20日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月20日 Jim 1.0.0 描述
	 */
	@RequestMapping(value = "screen")
	public String screen(Model model, HttpServletRequest requset) {
		// Subject sub = SecurityUtils.getSubject();
		// User user = (User) sub.getPrincipal();
		// if(user==null){
		// rememberUrl(requset);
		// model.addAttribute("msg", LOGIN);
		// return forwardLogin;
		// // return "redirect:/page/showlogin.do";
		// }
		// 未转单，总单量，分开
		WareHouseExample example = new WareHouseExample();
		example.createCriteria().andFacetEqualTo(true).andVisibleEqualTo(true);
		example.setOrderByClause("sort");
		List<WareHouse> list = wareHouseDao.selectByExample(example);
		WareHouse total = new WareHouse();
		TreeSet<WareHouse> treeSet = new TreeSet<WareHouse>(
				new Comparator<WareHouse>() {
					public int compare(WareHouse o1, WareHouse o2) {
						if (o1.equals(o2)) {
							return 0;
						}

						if (o1.getShowName().equalsIgnoreCase(o2.getShopName())) {
							// TODO

							// 未转单
							o2.setNotTurnAmount(o1.getNotTurnAmount()
									+ o2.getNotTurnAmount());
							// 今日已转单
							o2.setTrunAmount(o1.getTrunAmount()
									+ o2.getTrunAmount());
							// 待打印
							o2.setNotPrintAmount(o1.getNotPrintAmount()
									+ o2.getNotPrintAmount());
							// 配货中
							o2.setDistributionAmount(o1.getDistributionAmount()
									+ o2.getDistributionAmount());
							// 预售单量
							o2.setPreOrderQuantity(o2.getPreOrderQuantity()
									+ o1.getPreOrderQuantity());
							// 今日总单量
							o2.setTotalSingleAmount(o1.getTotalSingleAmount()
									+ o2.getTotalSingleAmount());
							// 今日总发货
							o2.setTodayShippedAmount(o1.getTodayShippedAmount()
									+ o2.getTodayShippedAmount());
							// 今日非预售发货
							o2.setTodayShippedGeneralAmount(o1
									.getTodayShippedGeneralAmount()
									+ o2.getTodayShippedGeneralAmount());
							// 今日预售发货
							o2.setTodayShippedPresellAmount(o1
									.getTodayShippedPresellAmount()
									+ o2.getTodayShippedPresellAmount());
							// 上月总发货
							o2.setLastMonthShippedAmount(o1
									.getLastMonthShippedAmount()
									+ o2.getLastMonthShippedAmount());
							// 本月总发货
							o2.setPresentMonthShippedAmount(o1
									.getPresentMonthShippedAmount()
									+ o2.getPresentMonthShippedAmount());
							return 0;
						} else {
							return o1.getSort() - o2.getSort();
						}
					};
				});

		for (WareHouse wareHouse : list) {
			if (wareHouse.getFacet()) {
				treeSet.add(wareHouse);
			}

			if (wareHouse.getVisible()) {
				// 未转单
				total.setNotTurnAmount(wareHouse.getNotTurnAmount()
						+ total.getNotTurnAmount());
				// 今日已转单
				total.setTrunAmount(wareHouse.getTrunAmount()
						+ total.getTrunAmount());
				// 待打印
				total.setNotPrintAmount(wareHouse.getNotPrintAmount()
						+ total.getNotPrintAmount());
				// 配货中
				total.setDistributionAmount(wareHouse.getDistributionAmount()
						+ total.getDistributionAmount());
				// 预售单量
				total.setPreOrderQuantity(total.getPreOrderQuantity()
						+ wareHouse.getPreOrderQuantity());
				// 今日总单量
				total.setTotalSingleAmount(wareHouse.getTotalSingleAmount()
						+ total.getTotalSingleAmount());
				// 今日总发货
				total.setTodayShippedAmount(wareHouse.getTodayShippedAmount()
						+ total.getTodayShippedAmount());
				// 今日非预售发货
				total.setTodayShippedGeneralAmount(wareHouse
						.getTodayShippedGeneralAmount()
						+ total.getTodayShippedGeneralAmount());
				// 今日预售发货
				total.setTodayShippedPresellAmount(wareHouse
						.getTodayShippedPresellAmount()
						+ total.getTodayShippedPresellAmount());
				// 上月总发货
				total.setLastMonthShippedAmount(wareHouse
						.getLastMonthShippedAmount()
						+ total.getLastMonthShippedAmount());
				// 本月总发货
				total.setPresentMonthShippedAmount(wareHouse
						.getPresentMonthShippedAmount()
						+ total.getPresentMonthShippedAmount());
			}
		}
		model.addAttribute("total", total);
		model.addAttribute("list", list);

		boolean sign = false;
		String userAgent = requset.getHeader("user-agent");
		logger.debug(userAgent);
		// System.out.println(userAgent);
		if (userAgent.contains("Android")) {
			sign = true;
		} else if (userAgent.contains("iPhone")) {
			sign = true;
		} else if (userAgent.contains("iPad")) {
			sign = true;
		}

		if (sign) {
			// 移动端
			return "/screen/mobile";
			// return "/screen/pc";
		} else {
			// pc端
			return "/screen/pc";
		}

	}

	/**
	 * @Function WareHouseController.java
	 * @Description: 仓库大屏幕页面
	 * @param
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @throws Exception
	 * @date 2017年9月20日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月20日 Jim 1.0.0 描述
	 */
	@RequestMapping(value = "mobile")
	public String screen2(Model model, HttpServletRequest requset) {
		// 未转单，总单量，分开
		WareHouseExample example = new WareHouseExample();
		example.createCriteria().andFacetEqualTo(true).andVisibleEqualTo(true);
		example.setOrderByClause("sort");
		List<WareHouse> list = wareHouseDao.selectByExample(example);
		WareHouse total = new WareHouse();
		TreeSet<WareHouse> treeSet = new TreeSet<WareHouse>(
				new Comparator<WareHouse>() {
					public int compare(WareHouse o1, WareHouse o2) {
						if (o1.equals(o2)) {
							return 0;
						}

						if (o1.getShowName().equalsIgnoreCase(o2.getShopName())) {
							// TODO

							// 未转单
							o2.setNotTurnAmount(o1.getNotTurnAmount()
									+ o2.getNotTurnAmount());
							// 今日已转单
							o2.setTrunAmount(o1.getTrunAmount()
									+ o2.getTrunAmount());
							// 待打印
							o2.setNotPrintAmount(o1.getNotPrintAmount()
									+ o2.getNotPrintAmount());
							// 配货中
							o2.setDistributionAmount(o1.getDistributionAmount()
									+ o2.getDistributionAmount());
							// 预售单量
							o2.setPreOrderQuantity(o2.getPreOrderQuantity()
									+ o1.getPreOrderQuantity());
							// 今日总单量
							o2.setTotalSingleAmount(o1.getTotalSingleAmount()
									+ o2.getTotalSingleAmount());
							// 今日总发货
							o2.setTodayShippedAmount(o1.getTodayShippedAmount()
									+ o2.getTodayShippedAmount());
							// 今日非预售发货
							o2.setTodayShippedGeneralAmount(o1
									.getTodayShippedGeneralAmount()
									+ o2.getTodayShippedGeneralAmount());
							// 今日预售发货
							o2.setTodayShippedPresellAmount(o1
									.getTodayShippedPresellAmount()
									+ o2.getTodayShippedPresellAmount());
							// 上月总发货
							o2.setLastMonthShippedAmount(o1
									.getLastMonthShippedAmount()
									+ o2.getLastMonthShippedAmount());
							// 本月总发货
							o2.setPresentMonthShippedAmount(o1
									.getPresentMonthShippedAmount()
									+ o2.getPresentMonthShippedAmount());
							return 0;
						} else {
							return o1.getSort() - o2.getSort();
						}
					};
				});

		for (WareHouse wareHouse : list) {
			if (wareHouse.getFacet()) {
				treeSet.add(wareHouse);
			}

			if (wareHouse.getVisible()) {
				// 未转单
				total.setNotTurnAmount(wareHouse.getNotTurnAmount()
						+ total.getNotTurnAmount());
				// 今日已转单
				total.setTrunAmount(wareHouse.getTrunAmount()
						+ total.getTrunAmount());
				// 待打印
				total.setNotPrintAmount(wareHouse.getNotPrintAmount()
						+ total.getNotPrintAmount());
				// 配货中
				total.setDistributionAmount(wareHouse.getDistributionAmount()
						+ total.getDistributionAmount());
				// 预售单量
				total.setPreOrderQuantity(total.getPreOrderQuantity()
						+ wareHouse.getPreOrderQuantity());
				// 今日总单量
				total.setTotalSingleAmount(wareHouse.getTotalSingleAmount()
						+ total.getTotalSingleAmount());
				// 今日总发货
				total.setTodayShippedAmount(wareHouse.getTodayShippedAmount()
						+ total.getTodayShippedAmount());
				// 今日非预售发货
				total.setTodayShippedGeneralAmount(wareHouse
						.getTodayShippedGeneralAmount()
						+ total.getTodayShippedGeneralAmount());
				// 今日预售发货
				total.setTodayShippedPresellAmount(wareHouse
						.getTodayShippedPresellAmount()
						+ total.getTodayShippedPresellAmount());
				// 上月总发货
				total.setLastMonthShippedAmount(wareHouse
						.getLastMonthShippedAmount()
						+ total.getLastMonthShippedAmount());
				// 本月总发货
				total.setPresentMonthShippedAmount(wareHouse
						.getPresentMonthShippedAmount()
						+ total.getPresentMonthShippedAmount());
			}
		}
		model.addAttribute("total", total);
		model.addAttribute("list", treeSet);
		return "/screen/mobile";

	}

	@RequestMapping(value = "location")
	public String wareHouseLocation() {
		return "/screen/location";
	}
}
