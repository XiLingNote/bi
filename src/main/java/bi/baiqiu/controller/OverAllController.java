package bi.baiqiu.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.mapper.FirstStartMapper;
import bi.baiqiu.mapper.ShopBeanMapper;
import bi.baiqiu.pojo.FirstStart;
import bi.baiqiu.pojo.RedisPojo;
import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.service.OverAllService;
import bi.baiqiu.service.impl.RedisServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;
import bi.baiqiu.utils.KeyUtils;

/**
 * @comment
 * @author:Jim*@date 2017年9月20日 下午3:53:20
 * @version 1.0.0
 * @see
 */
@Controller
@RequestMapping("overall")
public class OverAllController extends BaseController {
	Logger logger = Logger.getLogger(OverAllController.class);
	@Autowired
	private OverAllService overAllService;
	@Autowired
	private RedisServiceImpl redisService;
	@Autowired
	private FirstStartMapper firstStartDao;
	Map<String, BigDecimal[]> map = null;
	List<ShopBean> shopBeanTable = null;

	/**
	 * @Function OverAllController.java
	 * @Description: index.jsp 数据来源
	 * @param beginStr
	 *            ：yyyy/MM/dd
	 * @param endStr
	 *            ：yyyy/MM/dd
	 * @param dateType
	 *            :DAY,MONTH,YEAR
	 * @param department
	 *            :部门暂时为4个，ACC，Shoes，Bag，Shoes
	 * @return：json字符串
	 * @throws：RuntimeException
	 * @author:Jim
	 * @date 2017年9月20日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月20日 Jim 1.0.0 描述
	 */
	@ResponseBody
	@RequestMapping("sale")
	public String sale(@RequestParam(value = "beginStr", required = false) String beginStr,
			@RequestParam(value = "endStr", required = false) String endStr,
			@RequestParam(value = "datetype", required = false) String dateType,
			@RequestParam(value = "department", required = false) String department) {
		Map<String, Object> map = null;

		if (StringUtils.isBlank(department)) {
			department = "All";
		}

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date begin = null;
		Date end = null;
		Integer beginYear = null;
		Integer beginMonth = null;
		Integer endYear = null;
		Integer endMonth = null;
		if (StringUtils.isNotBlank(beginStr)) {
			try {
				begin = format.parse(beginStr);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(begin);
				beginYear = calendar.get(Calendar.YEAR);
				beginMonth = calendar.get(Calendar.MONTH);
			} catch (ParseException e) {
				throw new RuntimeException("开始时间转换异常" + beginStr);
			}
		}

		if (StringUtils.isNotBlank(endStr)) {
			try {
				end = format.parse(endStr);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(end);
				endYear = calendar.get(Calendar.YEAR);
				endMonth = calendar.get(Calendar.MONTH);
			} catch (ParseException e) {
				throw new RuntimeException("结束时间转换异常" + endStr);
			}
		}

		if (begin != null && end != null) {

			// 按日期查找
			if ("DAY".equals(dateType)) {
				// 同一个年月
				Boolean b = DateUtils.sameyyyyMM(begin, end);

				Boolean theBeginOfMonth = DateUtils.isTheBeginOfMonth(begin);
				Boolean theEndOfMonth = DateUtils.isTheEndOfMonth(end);

				// 查询整月,带有同比
				if (b && theEndOfMonth && theBeginOfMonth) {
					map = overAllService.getDayofWholeMonth(department, end);

				} else {
					map = overAllService.getDayOfMonth(department, begin, end);
				}
				// 以月为单位进行查询
			} else if ("MONTH".equals(dateType)) {

				if (beginYear == endYear && endMonth - beginMonth == 11) {
					// 这个月正好是整年
					map = overAllService.getMonthofWholeYear(department, beginYear);
				} else {
					map = overAllService.getMonthofYear(department, begin, end);
				}
			} else if ("YEAR".equals(dateType)) {

				if (beginYear == endYear) {
					map = overAllService.getWholeYear(department, endYear);
				} else {
					map = overAllService.getYear(department, beginYear, endYear);
				}
			} else {
				return null;
			}

		} else {// 缺少时间参数
			map = overAllService.getThisMonth(department);
		}
		return GsonUtils.gson.toJson(map);
	}

	/**
	 * @Function: department
	 * @Description:事业部大屏幕Data
	 * @param model
	 * @param value
	 * @return
	 * @return String
	 * @throws Exception
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年9月25日 Jared v1.0.0
	 */
	@RequestMapping("{business}")
	public String department(Model model, HttpServletResponse response, @PathVariable String business)
			 {
		if (StringUtils.isBlank(business)) {
			model.addAttribute("msg", ERR_URL);
			return "forward:/page/showlogin.do";
		} else {
			business = business.trim();
			// 1.获取店铺信息logo
			// 1.1获取店铺销售数据昨日今日分开
			// 1.2获取店铺总的数据。gmvAlipay完成率实时销售
			// 2.获取事业部信息
			try {
				//事业部电视机数据库显示的时间
				FirstStart first=firstStartDao.selectByPrimaryKey(new Byte("6"));
				if(first!=null&&first.getStatus()==0){
					DateUtils.setTestNow(first.getJdpModify());
				}
				map = overAllService.getShopHourData(business);
				shopBeanTable = overAllService.getTableshow(business);
				// 总事业部
				RedisPojo businessMonth = redisService.getBusinessMonth(business);
				RedisPojo businessToday = redisService.getBusinessToday(business);
				RedisPojo businessYesterday = redisService.getBusinessYesterday(business);
				model.addAttribute("businessMonth", businessMonth);
				// 分店铺
				model.addAttribute("shopBeans", shopBeanTable);
				model.addAttribute("shopHourData", map);
				model.addAttribute("businessName", business);
				model.addAttribute("businessName", business);
				model.addAttribute("businessToday", businessToday);
				model.addAttribute("businessYesterday", businessYesterday);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 事业部分时数据

			return "/screen/businessTV";
		}
	}

	/**
	 * @Function: getShop
	 * @Description:获取事业部下面店铺小时数据异步请求
	 * @param model
	 * @param response
	 * @param value
	 * @throws Exception
	 * @return void
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年9月26日 Jared v1.0.0
	 */
	@RequestMapping("/getShopData")
	public void getShop(Model model, HttpServletResponse response, String business) {
		if (StringUtils.isBlank(business)) {
			WriteObject(response, ERR_URL);
		} else {
			business = business.trim();
			Map<String, BigDecimal[]> map;
			try {
				map = overAllService.getShopHourData(business);
				WriteObject(response, map);
			} catch (Exception e) {
				WriteObject(response, ERR_PARA);
				e.printStackTrace();
			}

		}
	}

	/**
	 * @Function: getBusinessWaterPolo
	 * @Description:部门总的完成率的水球数据
	 * @param response
	 * @param business
	 * @throws Exception
	 * @return void
	 * @throws
	 *
	 * 			Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年9月27日 Jared v1.0.0
	 */
	@RequestMapping("/getBusinessWaterPolo")
	public void getBusinessWaterPolo(HttpServletResponse response, String business){
		if (StringUtils.isBlank(business)) {
			WriteObject(response, ERR_URL);
		} else {
			business = business.trim();
			Map<String, BigDecimal> map;
			try {
				map = overAllService.getBusinessMonthAndTarget(business);
				WriteObject(response, map);
			} catch (Exception e) {
				e.printStackTrace();
				WriteObject(response, ERR_PARA);
			}
			
		}
	}

	/**
	 * @Function: getBusinessHourData
	 * @Description:统计部门销售的分时数据
	 * @return void
	 * @throws map和shopBeanTable会在页面加载时调用
	 *
	 *             Modification History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年9月27日 Jared v1.0.0
	 */
	@RequestMapping("/getBusinessHour")
	public void getBusinessHourData(HttpServletResponse response, String business) {
		BigDecimal[] businesssHourArray = { BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO };
		BigDecimal[] businesssHourYesterday = { BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO };
		try {
			if (shopBeanTable != null && map != null && shopBeanTable.size() > 0 && map.size() > 0) {
				for (int i = 0; i < shopBeanTable.size(); i++) {
					BigDecimal[] today = map.get(shopBeanTable.get(i).getName());
					BigDecimal[] yesterday = map.get(shopBeanTable.get(i).getName()+KeyUtils.YESTERDAY);
					for (int j = 0; j < 24; j++) {
						businesssHourArray[j] = (today[j]==null?BigDecimal.ZERO:today[j]).add(businesssHourArray[j]);
						businesssHourYesterday[j]=(yesterday[j]==null?BigDecimal.ZERO:yesterday[j]).add(businesssHourYesterday[j]);
					}
				}
				Map<String, BigDecimal[]>hourMap=new HashMap<String, BigDecimal[]>();
				hourMap.put("today", businesssHourArray);
				hourMap.put("yesterday", businesssHourYesterday);
				WriteObject(response, hourMap,shopBeanTable.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, ERR_PARA);

		}
	}
}
