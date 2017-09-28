package bi.baiqiu.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import bi.baiqiu.pojo.Shop;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.impl.UserServiceImpl;

@Controller
@RequestMapping("page")
public class PageController {

	/**
	 * @Function PageController.java
	 * @Description: page下的通用页面映射
	 * @param
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	@RequestMapping("{value}")
	public String page(@PathVariable String value) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("dailySales");
		list.add("monthlySales");
		list.add("salesTrend");
		list.add("topBrand");
		list.add("topStore");
		list.add("index");
		list.add("inputExcel");
		list.add("showlogin");
		list.add("pcFlowStructure");
		list.add("wirelessFlowStructure");
		list.add("storeSalesDemonstrate");
		boolean b = false;
		for (String string : list) {
			if (string.equals(value)) {
				b = true;
			}
		}

		if (b) {
			return "/" + value;
		} else {
			return "/" + value;
			// return "/index";
		}
	}

	@RequestMapping("{value1}/{value2}")
	public String screen(@PathVariable String value1,
			@PathVariable String value2) {
		return "/" + value1 + "/" + value2;
	}

	@RequestMapping(value = "logistic")
	public String logistic(Model model, HttpServletRequest requset) {
		boolean sign = false;
		String userAgent = requset.getHeader("user-agent");
		System.out.println(userAgent);
		if (userAgent.contains("Android")) {
			sign = true;
		} else if (userAgent.contains("iPhone")) {
			sign = true;
		} else if (userAgent.contains("iPad")) {
			sign = true;
		} else {
			sign = true;
		}
		
		if (sign) {
			// 移动端
			return "/screen/logistic";
		} else {
			// pc端
			return "/screen/logistic";
		}
		
	}

	/**
	 * @Function PageController.java
	 * @Description: 该函数的功能描述
	 * @param
	 * @return：左侧菜单页面
	 * @throws：空指针 用户关联的getShopList为空
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	@RequestMapping("left")
	public String left(Model model) {
		/*
		 * try {
		 * 
		 * } catch (NullPointerException e) {
		 * 
		 * }
		 */
		Subject sub = SecurityUtils.getSubject();
		User user = (User) sub.getPrincipal();
		if (user.getShopNamePlat() == null) {
			Shop shop = user.getShopList().get(0);
			user.setShopId(shop.getId());
			user.setShopName(shop.getName());
			user.setShopNamePlat(shop.getNamePlat());
		}
		model.addAttribute("user", user);
		return "/left";
	}
}