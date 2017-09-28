package bi.baiqiu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.service.impl.TableTitleServiceImpl;

@Controller
@RequestMapping("table")
public class TableTitleController extends BaseController {
	
	@Autowired
	private TableTitleServiceImpl tableTitleServiceImpl;
	/**
	 * 查询表头
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "getTableTitle.do" ,method = RequestMethod.POST)
	public void getTableTitle( String tableName ,HttpServletRequest request,
			HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			Gson gson = new GsonBuilder().serializeNulls().create();
			List<TableTitleBean> list=tableTitleServiceImpl.queryTableTitle(tableName);
			String json = gson.toJson(list);
			response.getWriter().print(json);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, "查询出错");
		}
	}
}
