package bi.baiqiu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.service.OverAllService;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.GsonUtils;

@Controller
@RequestMapping("overall")
public class OverAllController {

	@Autowired
	OverAllService overAllService;

	/**
	 * @param model
	 * @return 本自然月数据 带有YOY同比 map.put("pojoset", treeSet); map.put("last",
	 *         pojo);
	 */
	@ResponseBody
	@RequestMapping("sale")
	public String demo3(
			@RequestParam(value = "beginStr", required = false) String beginStr,
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
				beginYear = begin.getYear();
				beginMonth = begin.getMonth();
			} catch (ParseException e) {
				throw new RuntimeException("开始时间转换异常" + beginStr);
			}
		}

		if (StringUtils.isNotBlank(endStr)) {
			try {
				end = format.parse(endStr);
				endYear = end.getYear();
				endMonth = end.getMonth();
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
					map = overAllService.getMonthofWholeYear(department,
							beginYear + 1900);
				} else {
					map = overAllService.getMonthofYear(department, begin, end);
				}
			} else if ("YEAR".equals(dateType)) {

				if (beginYear == endYear) {
					map = overAllService.getWholeYear(department,
							endYear + 1900);
				} else {
					map = overAllService.getYear(department, beginYear + 1900,
							endYear + 1900);
				}
			} else {
				return null;
			}

		} else {// 缺少时间参数

			map = overAllService.getThisMonth(department);
		}

		String s = GsonUtils.gson.toJson(map);
		return GsonUtils.gson.toJson(map);
	}
}
