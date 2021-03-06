package bi.baiqiu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.pojo.Shop;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;
import bi.baiqiu.service.impl.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {
	@Autowired
	private UserServiceImpl userService;

	Logger logger = Logger.getLogger(UserController.class);

	/**
	 * @Function UserController.java
	 * @Description: 用户登录方法，根据角色和权限返回不同页面 店铺分多个子权限，店铺子角色根据权限返回页面
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return：String 该角色(权限)对应的页面
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年8月30日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年8月30日 Jim 1.0.0
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String dologin(
			Model model,
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "autoLogin", required = false) String autoLogin,
			HttpServletRequest request, HttpServletResponse response) {
		Subject sub = SecurityUtils.getSubject();
		String pass = DigestUtils.md5Hex(password);

		UsernamePasswordToken token = new UsernamePasswordToken(username, pass);
		//
		// token.setRememberMe(true);
		try {
			sub.login(token);
			// 登录失败抛出该异常，用户名不对
		} catch (UnknownAccountException e) {
			model.addAttribute("msg", "User name or password error!1");
			return "/showlogin";
			// 登录失败抛出该异常，密码不对
		} catch (IncorrectCredentialsException e) {
			model.addAttribute("msg", "User name or password error!2");
			return "/showlogin";
		}
		// 登录成功
		if (StringUtils.isNotBlank(autoLogin)) {
			addCookie(response, "username", username, 360 * 24 * 60 * 60);
			addCookie(response, "password", password, 360 * 24 * 60 * 60);
			addCookie(response, "autoLogin", autoLogin, 360 * 24 * 60 * 60);
		} else {
			removeCookie(response, "username");
			removeCookie(response, "password");
			removeCookie(response, "autoLogin");
		}

		String redirectUrl = null;
		StringBuffer requestURL = request.getRequestURL();
		SavedRequest req = WebUtils.getSavedRequest(request);
		String aa = requestURL.toString().replaceAll("/user/login.do", "");
		if (req != null) {
			redirectUrl = req.getRequestUrl();
			if (StringUtils.isNotBlank(redirectUrl)) {
				request.getSession().removeAttribute(WebUtils.SAVED_REQUEST_KEY);
				return "redirect:" +aa+ redirectUrl;
			}
		}
		String url = getUrl(sub, model);
		if (!url.contains("showlogin")) {
			request.getSession().removeAttribute(WebUtils.SAVED_REQUEST_KEY);
		}
		return url;
	}

	@RequestMapping(value = "logout")
	public String logout(Model model, HttpServletRequest request,
			HttpServletResponse response) {
		request.getSession().removeAttribute("rememberUrl");
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		removeCookie(response, "autoLogin");
		return "redirect:/page/showlogin.do";
		// return "/showlogin";
	}

	/**
	 * @Function UserController.java
	 * @Description: 接收切换店铺的请求，并重新关联当前店铺
	 * @param
	 * @return：String
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月4日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月4日 Jim 1.0.0 描述
	 */
	@RequestMapping(value = "changeName", method = RequestMethod.POST)
	@ResponseBody
	public String shopNameChange(
			@RequestParam(value = "shopId", required = true) Integer shopId) {
		if (shopId != null) {
			Subject sub = SecurityUtils.getSubject();
			User user = (User) sub.getPrincipal();
			// 清空之前选择的店铺数据
			user.setShopName(null);
			user.setShopNamePlat(null);
			user.setShopId(null);
			for (Shop shop : user.getShopList()) {
				if (shopId == shop.getId()) {
					user.setShopName(shop.getName());
					user.setShopNamePlat(shop.getNamePlat());
					user.setShopId(shop.getId());
					return "true";
				}
			}
			return "Handover Failure!";
		} else {
			return "Handover Failure!";
		}
	}

	@RequestMapping(value = "manageUser")
	@ResponseBody
	public List<User> shopNameChange() {
		List<User> arrayList = new ArrayList<User>();
		for (int i = 1; i < 16; i++) {
			User user = new User();
			user.setId(i);
			user.setName("name" + i);
			user.setUsername(i + "name" + i);
			arrayList.add(user);
		}

		return arrayList;
	}

	/**
	 * @Function UserController.java
	 * @Description: 添加店铺子角色
	 * @param
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月8日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月8日 Jim 1.0.0 描述
	 */
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public String addUser(Model model, User user,
			@RequestParam(value = "page", required = true) String page) {
		// 当前店铺管理
		Subject sub = SecurityUtils.getSubject();
		User manger = (User) sub.getPrincipal();

		if (StringUtils.isBlank(user.getUsername())) {
			model.addAttribute("msg", ERR_USERNAME);
			return "forward:/user/shopadmin.do";
		}

		if (StringUtils.isBlank(user.getPassword())) {
			model.addAttribute("msg", ERR_PASSWORD);
			return "forward:/user/shopadmin.do";
		} else {
			// 密码加密
			String pass = DigestUtils.md5Hex(user.getPassword());
			user.setPassword(pass);
		}

		// 店铺子角色标记
		user.setUserSign(4);
		user.setRoleIds("4");
		if (StringUtils.isNotBlank(user.getFunctionIds())) {
			// roleIds字符串重新排序
			String[] split = user.getFunctionIds().split(",");
			Arrays.sort(split);
			StringBuffer sb = new StringBuffer();
			for (String string : split) {
				sb.append(string).append(",");
			}
			String roleIds = sb.substring(0, sb.length() - 1);
			user.setFunctionIds(roleIds);
		}

		// 添加shop id
		user.setShopId(manger.getShopId());
		/*
		 * // 密码加密 String pass = DigestUtils.md5Hex(user.getPassword());
		 * user.setPassword(pass);
		 */

		try {
			userService.addShopUser(user);
		} catch (Exception e) {
			logger.info(ERR_PARA);
			model.addAttribute("msg", ERR_SHOP);
			return "forward:/user/shopadmin.do";
		}
		// return "/shopadmin";
		return "redirect:/user/shopadmin.do";
	}

	/**
	 * @Function UserController.java
	 * @Description: 添加店铺管理及经理以上用户
	 * @param
	 * @return：String返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月8日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月8日 Jim 1.0.0 描述
	 */
	@RequestMapping(value = "regist2", method = RequestMethod.POST)
	public String addUser2(Model model, User user) {
		// 当前店铺管理
		Subject sub = SecurityUtils.getSubject();
		User manger = (User) sub.getPrincipal();
		try {
			if (user.getRoleIds().equals("0")) {
				logger.info(ERR_ROlE);
				model.addAttribute("msg", ERR_ROlE);
				return "forward:/user/admin.do";
			}

			if (user.getRoleIds().contains("2")) {
				user.setUserSign(2);
			} else {
				if (user.getShopId() == null) {
					model.addAttribute("msg", ERR_SHOP);
					return "forward:/user/admin.do";
				}
				user.setUserSign(3);
			}
		} catch (NullPointerException e) {
			logger.info(ERR_ROlE);
			model.addAttribute("msg", ERR_ROlE);
			return "forward:/user/admin.do";
		}

		if (StringUtils.isBlank(user.getUsername())) {
			model.addAttribute("msg", ERR_USERNAME);
			return "forward:/user/admin.do";
		}

		if (StringUtils.isBlank(user.getPassword())) {
			model.addAttribute("msg", ERR_PASSWORD);
			return "forward:/user/admin.do";
		} else {
			// 密码加密
			String pass = DigestUtils.md5Hex(user.getPassword());
			user.setPassword(pass);
		}

		try {
			userService.addShopUser(user);
		} catch (Exception e) {
			logger.info(ERR_PARA);
			model.addAttribute("msg", ERR_PARA);
			return "forward:/user/admin.do";
		}
		// return "/shopadmin";
		return "redirect:/user/admin.do";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateUser(Model model, User user,
			@RequestParam(value = "page", required = true) String page) {

		if (StringUtils.isNotBlank(user.getFunctionIds())) {
			// roleIds字符串重新排序
			String[] split = user.getFunctionIds().split(",");
			Arrays.sort(split);
			StringBuffer sb = new StringBuffer();
			for (String string : split) {
				sb.append(string).append(",");
			}
			String roleIds = sb.substring(0, sb.length() - 1);
			user.setFunctionIds(roleIds);
		}
		userService.updateUser(user);

		return "redirect:/user/" + page + ".do";
	}

	@RequestMapping(value = "shopadmin")
	public String shopAdmin(Model model) {
		// 当前登录用户
		Subject sub = SecurityUtils.getSubject();
		User user = (User) sub.getPrincipal();
		List<UserRole> queryRoles = userService.queryRoles(user.getRoleIds());

		Set<UserRoleFunction> functionSet = new HashSet<UserRoleFunction>();
		// 当前登录用户的权限
		for (UserRole userRole : queryRoles) {
			List<UserRoleFunction> list = userService
					.queryUserRoleFunctions(userRole.getFunctionIds());
			functionSet.addAll(list);
		}
		model.addAttribute("functionSet", functionSet);
		// 当前登录用户关联店铺所有的账号
		List<User> userList = userService.queryShopUser(user.getShopId());
		model.addAttribute("userList", userList);
		return "/shopadmin";
	}

	@RequestMapping(value = "admin")
	public String admin(Model model) {
		Subject sub = SecurityUtils.getSubject();
		User user = (User) sub.getPrincipal();
		List<User> userList = userService.queryAllShopManger();
		model.addAttribute("userList", userList);
		model.addAttribute("user", user);
		return "/admin";
	}

}
