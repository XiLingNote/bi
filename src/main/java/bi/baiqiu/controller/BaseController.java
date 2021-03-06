package bi.baiqiu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;

import bi.baiqiu.pojo.BaseBean;
import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.UtilTool;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseController {
	public final static String forwardLogin = "forward:/page/showlogin.do";

	public final static String saveSuccess = "Save successful";

	public final static String savesErroy = "save failure";

	public final static String commintSuccess = saveSuccess + ". save rows: ";

	public final static String commintErroy = savesErroy + " data before ";

	public final static String erroyFormate = "save failed Date：";

	public final static String dataFormat = "\n Row : ";
	public final static String notAllow = " not allow ";

	public final static String noDeleteHistoryAuthority = "No Change History Authority.Row:";

	public final static String noUpdateHistoryAuthority = "Save successful,Historical data is not covered";

	public final static String noData = "No correct data. ";

	public final static String deleteSuccess = "Deleted successfully. rows:";

	public final static String deleteErroy = "Deleted failed";

	public final static String systemErroy = "Please wait";

	public final static String analysisExcelErroy = "save failure,Please see if the data date format is correct";

	public final static String dataCheckError = "Data check error";

	public final static String templateError = "Please use template import.Change ";

	public final static String ERR_USERNAME_PASSWORD = "User name or password error!";

	public final static String ERR_ROlE = "Please select roles!";

	public final static String ERR_USERNAME = "Username cannot be empty!";

	public final static String ERR_SHOP = "Please select shop!";

	public final static String ERR_PASSWORD = "Password cannot be empty!";

	public final static String ERR_PARA = "parameter error!";

	public final static String ERR_URL = "URL error!";

	public final static String LOGIN = "Please log in first";

	public void WriteOnlyMsg(HttpServletResponse response, String msg) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		try {
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteMsg(HttpServletResponse response, String message) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		try {
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			BaseBean baseBean = new BaseBean();
			baseBean.setStatus("ok");
			baseBean.setObject(message);

			String msg = new Gson().toJson(baseBean);
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void WriteObject(HttpServletResponse response, Object object,
			int total) {
		try {
			response.addHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			BaseBean baseBean = new BaseBean();
			baseBean.setStatus("ok");
			baseBean.setObject(object);
			baseBean.setTotal(total);
			Gson gson = new GsonBuilder().serializeNulls().create();
			// Gson gson = new GsonBuilder().registerTypeAdapterFactory(new
			// NullStringToEmptyAdapterFactory<String>()).create();
			String msg = gson.toJson(baseBean);
			response.getWriter().write(
					msg.replace("Bean\":null", "Bean\":{}")
							.replace("Beans\":null", "Beans\":[]")
							.replace(":null", ":\"\""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteObject(HttpServletResponse response, Object object) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		try {
			if (object == null) {
				object = new Object();
			}
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			BaseBean baseBean = new BaseBean();
			baseBean.setStatus("ok");
			baseBean.setObject(object);
			Gson gson = new GsonBuilder().serializeNulls().create();
			// Gson gson = new GsonBuilder().registerTypeAdapterFactory(new
			// NullStringToEmptyAdapterFactory<String>()).create();
			String msg = gson.toJson(baseBean);
			response.getWriter().write(
					msg.replace("Bean\":null", "Bean\":{}")
							.replace("Beans\":null", "Beans\":[]")
							.replace(":null", ":\"\""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteError(HttpServletResponse response, String error) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		try {
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			BaseBean baseBean = new BaseBean();
			baseBean.setStatus("error");
			baseBean.setError(error);

			Gson gson = new GsonBuilder().serializeNulls().create();
			String msg = gson.toJson(baseBean);
			response.getWriter().write(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WritePending(HttpServletResponse response, String error) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		try {
			response.setHeader("Content-Type", "text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			BaseBean baseBean = new BaseBean();
			baseBean.setStatus("pending");
			baseBean.setError(error);
			String msg = new Gson().toJson(baseBean);
			response.getWriter().write(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readJSONString(HttpServletRequest request) {
		StringBuffer json = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				json.append(line);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return json.toString();
	}

	/**
	 * 获取登录信息
	 * 
	 * @param request
	 * @return
	 */
	public User getLoginUser() {
		Subject sub = SecurityUtils.getSubject();
		User user = (User) sub.getPrincipal();
		if (sub.isPermitted("all") || sub.isPermitted("delete_history")) {
			user.setHasDeleteHistoryAuthority(true);
		}
		return user;
	}

	/**
	 * 循环遍历表头进行数据格式对比
	 * 
	 * @param list
	 * @param lo
	 * @throws Exception
	 */
	public String checkData(List<TableTitleBean> list, List<Object> lo, int row)
			throws Exception {
		StringBuffer buffer = new StringBuffer();
		if (lo != null && lo.size() > 0) {
			for (int i = 1, j = 0; i < (list.size() < lo.size() ? list.size()
					: lo.size()); i++, j++) {
				String returnMsg = checkOneData(list.get(i),
						String.valueOf(lo.get(j)));
				if (!StringUtils.isEmpty(returnMsg)) {
					buffer.append(dataFormat);
					buffer.append(row);
					buffer.append(" ");
					buffer.append(returnMsg);
					buffer.append(notAllow);
				}

			}
			return buffer.toString();
		} else {
			return templateError;
		}

	}

	/**
	 * 校验单天的日期
	 * 
	 * @param bean
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public String checkOneData(TableTitleBean bean, String value)
			throws Exception {
		String formate = bean.getFormatter();
		// 百分号格式判定
		// 金额
		StringBuffer buffer = new StringBuffer();
		if ("percent".equals(formate) || "integerAndPercent".equals(formate)
				|| "amount".equals(formate) || "totalAmount".equals(formate)) {
			Pattern p = Pattern
					.compile("^[+-]?(([1-9]{1}\\d*)|([0]{1}))(\\d*|\\.(\\d){0,5})[%]?$");
			Matcher m = p.matcher(value);
			boolean b = m.matches();
			if (!b && !StringUtils.isBlank(value)) {
				buffer.append(bean.getTemplateTitle());
				buffer.append(":");
				buffer.append(value);
			}
		} else if ("integer".equals(formate)) {
			Pattern p = Pattern
					.compile("^[+-]?(([1-9]{1}\\d*)|([0]{1}))(\\d*)[%]?$");
			value = UtilTool.convertToString(value);
			Matcher m = p.matcher(value);
			boolean b = m.matches();
			if (!b && !StringUtils.isBlank(value)) {
				buffer.append(bean.getTemplateTitle());
				buffer.append(":");
				buffer.append(value);
			}
		}
		// 日期
		else if ("month".equals(formate) || "date".equals(formate)) {
			if (!DateUtils.isDateType(value)) {
				buffer.append(bean.getTemplateTitle());
				buffer.append(":");
				buffer.append(value);
			}
		}
		return buffer.toString();
	}

	/**
	 * 添加数据
	 * 
	 * @return
	 */
	public List<Object> addNull(List<Object> list, int index) {

		for (int i = 0; i <= index; i++) {
			list.add("");
		}
		return list;
	}

	/**
	 * @Function: writeGson
	 * @Description:返回bootstrap需要的格式的数据u
	 * @param response
	 * @param list
	 * @param total
	 * @throws IOException
	 * @return void
	 * @throws Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年10月24日 Jared v1.0.0
	 */
	public void WriteGson(HttpServletResponse response, List<?> list, Long total)
			throws IOException {
		Gson gson = new GsonBuilder().serializeNulls().create();
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		String json = "{\"total\":" + total + ",\"rows\":" + gson.toJson(list)
				+ "}";
		response.getWriter().print(json);
	}

	/**
	 * @Function: rememberUrl
	 * @Description:将请求保存到session
	 * @param requset
	 * @return void
	 * @throws Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年10月26日 Jared v1.0.0
	 */
	public void rememberUrl(HttpServletRequest requset) {
		HttpSession session = requset.getSession();
		session.setAttribute("rememberUrl", requset.getRequestURL());
	}

	/**
	 * @Function: getRememberUrl
	 * @Description:读取记忆的url登陆后调用
	 * @param requset
	 * @return
	 * @return String
	 * @throws Modification
	 *             History: Date Author Version Description
	 *             ---------------------------------------------------------
	 *             2017年10月26日 Jared v1.0.0
	 */
	public String getRememberUrl(HttpServletRequest requset) {
		HttpSession session = requset.getSession();
		String url = String.valueOf(session.getAttribute("rememberUrl"));
		session.removeAttribute("rememberUrl");
		return url;
	}

	public void addCookie(HttpServletResponse response, String name,
			String value, int maxAge) {
		Cookie cookie = new Cookie(name, value);
		cookie.setPath("/");
		if (maxAge > 0) {
			cookie.setMaxAge(maxAge);
		}
		response.addCookie(cookie);
	}

	public void removeCookie(HttpServletResponse response, String name) {
		Cookie cookie = new Cookie(name, null);
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	public Cookie getCookieByName(HttpServletRequest request, String name) {
		Map<String, Cookie> cookieMap = ReadCookieMap(request);
		if (cookieMap.containsKey(name)) {
			Cookie cookie = (Cookie) cookieMap.get(name);
			return cookie;
		} else {
			return null;
		}
	}

	public Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
		Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				cookieMap.put(cookie.getName(), cookie);
			}
		}
		return cookieMap;
	}

	public String getUrl(Subject sub, Model model) {
		if (sub.hasRole("admin") || sub.hasRole("director")) {
			return "redirect:/page/index.do";
			// 店鋪admin,store_onlysee
		} else if (sub.hasRole("store_admin")) {
			return "redirect:/page/target.do";
			// 店铺子角色根据权限来判定页面(防止没有权限访问)
		} else if (sub.hasRole("store_sub_role")) {
			// target 目标展示页面
			if (sub.isPermitted("target")) {
				return "redirect:/page/target.do";
			}
			// flow
			if (sub.isPermitted("flow")) {
				return "redirect:/page/pcFlowStructure.do";
			}
			// fans_data
			if (sub.isPermitted("fans_data")) {
				return "redirect:/page/fansDaily.do";
			}

			// pay_data
			if (sub.isPermitted("pay_data")) {
				return "redirect:/page/saleProductsTreasure.do";
			}
			// commodity_property
			if (sub.isPermitted("commodity_property")) {
				return "redirect:/page/commodityProperty.do";
			}

			model.addAttribute("msg", ERR_USERNAME_PASSWORD);
			return "/showlogin";

		} else if (sub.hasRole("tvView")) {
			if (sub.isPermitted("wareHourse")) {
				return "redirect:/wareHouse/screen.do";
			}

			if (sub.isPermitted("businessTV")) {
				return "redirect:/overall/Bag.do";
			}

			if (sub.isPermitted("departmentTV")) {
				return "redirect:/overall/department/Bag.do";
			}

			model.addAttribute("msg", "tvView not permission found");
			return "/showlogin";

		} else {
			model.addAttribute("msg", ERR_USERNAME_PASSWORD);
			return "/showlogin";
		}
	}

}
