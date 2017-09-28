package bi.baiqiu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bi.baiqiu.utils.ExportExcelUtils;

@Controller
@RequestMapping("download")
public class DownloadController extends BaseController {
	/**
	 * 模板下载
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/downloadTemplate.do")
	public void exportDailyTargetTemp(HttpServletRequest request, String fileName, HttpServletResponse response)
			throws Exception {
		ExportExcelUtils util = new ExportExcelUtils();
		String filePath = "";
//		windows系统默认在c盘
		if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
			filePath = "C:";
		} else {
			filePath="/usr/local/downloadTemplate/";
		}
		util.downLoad(filePath + fileName + ".xlsx", response, false);

	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.arch"));
	}

}
