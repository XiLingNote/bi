package bi.baiqiu.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import bi.baiqiu.pojo.BaseBean;
import bi.baiqiu.pojo.User;

public class BaseController {
	public final static String saveSuccess = "Save successful";

	public final static String savesErroy = "save failure";
	
	public final static String commintSuccess=saveSuccess+"save rows: ";
	
	public final static String commintErroy=savesErroy+" data before ";

	public final static String noDeleteHistoryAuthority = "no Delete History Authority";
	
	public final static String noUpdateHistoryAuthority = "Save successful,Historical data is not covered";

	public final static String noData = "noData";

	public final static String deleteSuccess = "Deleted successfully. rows:";

	public final static String deleteErroy = "Deleted failed";
	
	public final static String systemErroy = "Please wait";
	
	public final static String analysisExcelErroy = "save failure,Please see if the data date format is correct";
	
	public final static String dataCheckError="Data check error";

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteObject(HttpServletResponse response, Object object, int total) {
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
			response.getWriter().write(msg.replace("Bean\":null", "Bean\":{}").replace("Beans\":null", "Beans\":[]")
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
			response.getWriter().write(msg.replace("Bean\":null", "Bean\":{}").replace("Beans\":null", "Beans\":[]")
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
}
