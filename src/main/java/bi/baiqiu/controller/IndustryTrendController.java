package bi.baiqiu.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.service.IndustryTrendService;
import bi.baiqiu.utils.GsonUtils;

@Controller
@RequestMapping("industry")
public class IndustryTrendController {
	@Autowired
	IndustryTrendService industryTrendService;

	@ResponseBody
	@RequestMapping("top")
	public String top(HttpServletRequest request) {
		Map<String, Object> map = null;
		String dateType = request.getParameter("datetype");
		String brandOrStore = request.getParameter("brandOrStore");
		if (!"store".equals(brandOrStore) && !"brand".equals(brandOrStore)) {
			try {
				return URLEncoder.encode("参数非法", "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		String names = request.getParameter("names");

		if (StringUtils.isBlank(names)) {
			return null;
		}
		// 店铺名称 数组 、品牌名称数组
		String[] nameArr = names.split("，，，");
		ArrayList<String> arrayList = new ArrayList<String>();

		String beginStr = request.getParameter("begin");

		String endStr = request.getParameter("end");

		SimpleDateFormat format = new SimpleDateFormat(
				"EEE MMM dd yyyy hh:mm:ss z", Locale.ENGLISH);
		Date begin = null;
		Date end = null;

		Integer beginYear = null;
		Integer endYear = null;

		if (StringUtils.isNotBlank(beginStr)) {
			try {
				String str1 = beginStr.replace("GMT", "").replaceAll(
						"\\(.*\\)", "");
				begin = format.parse(str1);
				beginYear = begin.getYear();
			} catch (ParseException e) {
				throw new RuntimeException("开始时间转换异常");
			}
		}

		if (StringUtils.isNotBlank(endStr)) {
			try {
				String str2 = endStr.replace("GMT", "").replaceAll("\\(.*\\)",
						"");
				end = format.parse(str2);
				endYear = end.getYear();
			} catch (ParseException e) {
				throw new RuntimeException("结束时间转换异常");
			}
		}

		if (begin != null && end != null) {

			// 按日期查找
			if ("DAY".equals(dateType)) {

				map = industryTrendService.getDay(brandOrStore, nameArr, begin,
						end);
				// 以月为单位进行查询
			} else if ("MONTH".equals(dateType)) {

				map = industryTrendService.getMonth(brandOrStore, nameArr,
						begin, end);
			} else if ("YEAR".equals(dateType)) {

				map = industryTrendService.getYear(brandOrStore, nameArr,
						beginYear + 1900, endYear + 1900);
			} else {
				return null;
			}

		} else {// 缺少时间参数
			try {
				String encode = URLEncoder.encode("请选择参数", "utf-8");
				return encode;
			} catch (UnsupportedEncodingException e1) {

			}
		}

		String s = GsonUtils.gson.toJson(map);
		return GsonUtils.gson.toJson(map);

	}

	@ResponseBody
	@RequestMapping(value = "storeName", produces = "text/html;charset=UTF-8")
	public String storeName(Model model, HttpServletRequest request) {

		Set<String> set = industryTrendService.queryIndustryStoreName();
		String json = GsonUtils.gson.toJson(set);
		return json;
	}

	@ResponseBody
	@RequestMapping(value = "brandName", produces = "text/html;charset=UTF-8")
	public String brandName(Model model, HttpServletRequest request) {

		Set<String> set = industryTrendService.queryIndustryBrandName();
		String json = GsonUtils.gson.toJson(set);
		return json;
	}

}
