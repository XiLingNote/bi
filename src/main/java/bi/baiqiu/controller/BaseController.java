package bi.baiqiu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import bi.baiqiu.pojo.BaseBean;
import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.UtilTool;

public class BaseController {
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
	
	public final static String templateError="Please use template import.Change ";

	public final static String ERR_USERNAME_PASSWORD = "User name or password error!";
	
	public final static String ERR_ROlE = "Please select roles!";
	
	public final static String ERR_USERNAME = "Username cannot be empty!";
	
	public final static String ERR_SHOP = "Please select shop!";
	
	public final static String ERR_PASSWORD = "Password cannot be empty!";
	
	public final static String ERR_PARA = "parameter error!";
	
	public final static String ERR_URL = "URL error!";
	
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
	/**
	 * 循环遍历表头进行数据格式对比
	 * 
	 * @param list
	 * @param lo
	 * @throws Exception 
	 */
	public String  checkData(List<TableTitleBean> list, List<Object> lo,int row) throws Exception {
		StringBuffer buffer=new StringBuffer();
		if(lo!=null&&lo.size()>0){
			for (int i = 1,j=0; i < (list.size()<lo.size()?list.size():lo.size()); i++,j++) {
				String returnMsg=checkOneData(list.get(i), String.valueOf(lo.get(j)));
				if(!StringUtils.isEmpty(returnMsg)){
					buffer.append(dataFormat);
					buffer.append(row);
					buffer.append(" ");
					buffer.append(returnMsg);
					buffer.append(notAllow);
				}
				
			}
			return buffer.toString();
		}else{
			return templateError;
		}
		
	}
	/**校验单天的日期
	 * @param bean
	 * @param value
	 * @return
	 * @throws Exception 
	 */
	public String checkOneData(TableTitleBean bean, String value) throws Exception {
		String formate = bean.getFormatter();
		// 百分号格式判定
		// 金额
		StringBuffer buffer=new StringBuffer();
		if ("percent".equals(formate) || "integerAndPercent".equals(formate)||"amount".equals(formate) || "totalAmount".equals(formate)) {
			Pattern	p = Pattern.compile("^[+-]?(([1-9]{1}\\d*)|([0]{1}))(\\d*|\\.(\\d){0,5})[%]?$");
			Matcher	m = p.matcher(value);
			boolean	b = m.matches();
			if (!b&&!StringUtils.isBlank(value)) {
				buffer.append(bean.getTemplateTitle());
				buffer.append(":");
				buffer.append(value);
			}
		}
		else if("integer".equals(formate)){
			Pattern	p = Pattern.compile("^[+-]?(([1-9]{1}\\d*)|([0]{1}))(\\d*)[%]?$");
			value=UtilTool.convertToString(value);
			Matcher	m = p.matcher(value);
			boolean	b = m.matches();
			if (!b&&!StringUtils.isBlank(value)) {
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
	
	/**添加数据
	 * @return
	 */
	public List<Object> addNull(List<Object> list,int index){

		for(int i=0;i<=index;i++){
			list.add("");
		}
		return list;
	}
}
