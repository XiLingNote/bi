package bi.baiqiu.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
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
public class PageController extends BaseController {
	private static Logger logger = Logger.getLogger(PageController.class);
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

	@RequestMapping(value = "showlogin")
	public String showLogin(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String redirectUrl = null;
		StringBuffer requestURL = request.getRequestURL();
		SavedRequest req = WebUtils.getSavedRequest(request);
		if (req!= null) {
			String aa = requestURL.toString().replaceAll("/page/showlogin.do", "");
			redirectUrl =aa + req.getRequestUrl();
		}
		
		System.out.println(redirectUrl);
		String username = null;
		String password = null;
		Cookie usernameCookie = getCookieByName(request, "username");
		Cookie passwordCookie = getCookieByName(request, "password");
		if (usernameCookie != null) {
			username = usernameCookie.getValue();
		}

		if (passwordCookie != null) {
			password = passwordCookie.getValue();
		}

		String autoLogin = null;
		Cookie cookie = getCookieByName(request, "autoLogin");
		if (cookie != null) {
			autoLogin = cookie.getValue();
		}

		Subject sub = SecurityUtils.getSubject();
		if (StringUtils.isNotBlank(autoLogin)) {
			String pass = DigestUtils.md5Hex(password);
			UsernamePasswordToken token = new UsernamePasswordToken(username,
					pass);
			try {
				sub.login(token);
				// 登录失败抛出该异常，用户名不对
			} catch (UnknownAccountException e) {
				model.addAttribute("msg", "User name or password error!");
				return "/showlogin";
				// 登录失败抛出该异常，密码不对
			} catch (IncorrectCredentialsException e) {
				model.addAttribute("msg", "User name or password error!");
				return "/showlogin";
			}

			// 登录成功
			if (StringUtils.isNotBlank(autoLogin)) {
				System.out.println("addCookie");
				addCookie(response, "username", username, 360 * 24 * 60 * 60);
				addCookie(response, "password", password, 360 * 24 * 60 * 60);
				addCookie(response, "autoLogin", autoLogin, 360 * 24 * 60 * 60);
			} else {
				removeCookie(response, "username");
				removeCookie(response, "password");
				removeCookie(response, "autoLogin");
			}
			
			if (StringUtils.isNotBlank(redirectUrl)) {
				return "redirect:" + redirectUrl;
			}
			return getUrl(sub, model);
		}

		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("autoLogin", autoLogin);
		return "/showlogin";

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
