package bi.baiqiu.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.DrillShowBean;
import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.impl.DrillShowServiceImpl;
import bi.baiqiu.service.impl.TableTitleServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ExcelException;
import bi.baiqiu.utils.ImportExcelUtils;

/**
 * 钻展
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("drillShow")
public class DrillShowController extends BaseController {
	@Autowired
	private DrillShowServiceImpl drillShowServiceImpl;
	@Autowired
	private TableTitleServiceImpl tableTitleServiceImpl;

	/**
	 * 删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param requDrillShow
	 *            response
	 */
	@RequestMapping(value = "deleteDrillShow.do")
	public void deleteDrillShow(DrillShowBean bean, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			WriteObject(response, deleteSuccess + drillShowServiceImpl.deleteDrillShow(bean));
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * 分页查询
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "queryDrillShowByPage.do")
	public void queryByPage(DrillShowBean bean, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		User user = getLoginUser();
		try {
			response.setCharacterEncoding("utf-8");
			bean.setShopId(user.getShopId());
			Gson gson = new GsonBuilder().serializeNulls().create();
			Page<DrillShowBean> page = drillShowServiceImpl.queryByPage(bean, pageNum, pageSize);
			String json = "{\"total\":" + page.getTotal() + ",\"rows\":" + gson.toJson(page.getResult()) + "}";
			response.getWriter().print(json);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, systemErroy);
		}
	}

	/**
	 * 更新
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "updateDrillShow.do")
	public void updateDrillShow(DrillShowBean bean, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			WriteObject(response, saveSuccess + drillShowServiceImpl.updateDrillShow(bean));
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, savesErroy);
		}
	}

	/**
	 * 批量删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "deleteDrillShowByBatch.do")
	public void deleteDrillShowByBatch(@RequestParam(value = "idArray[]") int[] idArray, HttpServletRequest request,
			HttpServletResponse response) {
		User user = getLoginUser();
		DrillShowBean bean = new DrillShowBean();
		bean.setIdArray(idArray);
		// 可删除两月前的数据权限判定
		bean.setDeleteHistory(user.isHasDeleteHistoryAuthority());
		try {
			WriteObject(response, deleteSuccess + drillShowServiceImpl.deleteDrillShowByBatch(bean));
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * 钻展文件上传
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "uploadDrillShow.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void uploadDrillShow(HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		// 上传文件用
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in = null;
		List<List<Object>> listob = null;
		// MultipartFile file = multipartRequest.getFile("upfile"); jquery 提交的文件
		MultipartFile file = multipartRequest.getFile("txt_file");// bootstrap获取流的方式
		try {
			List<TableTitleBean> titleList = tableTitleServiceImpl.queryTableTitle("drillShow");
			if (file == null || file.isEmpty()) {
				throw new Exception("文件不存在！");
			}
			StringBuffer noAuthorityMsg = new StringBuffer(noDeleteHistoryAuthority);
			StringBuffer errorFormatMsg = new StringBuffer("");
			List<DrillShowBean> saleBeans;
			in = file.getInputStream();
			listob = new ImportExcelUtils().getBankListByExcel(in, file.getOriginalFilename(), titleList);
			saleBeans = new ArrayList<DrillShowBean>();
			for (int i = 0; i < listob.size(); i++) {
				List<Object> lo = listob.get(i);
				String checkMsg = checkData(titleList, lo, i + 2);
				if (lo.size() > 0 && checkMsg.equals("")) {
					//不填数据防止空指针
					lo=addNull(lo, (19-lo.size()));
					DrillShowBean saleBean = new DrillShowBean(String.valueOf(lo.get(0)), String.valueOf(lo.get(1)),
							String.valueOf(lo.get(2)), String.valueOf(lo.get(3)), String.valueOf(lo.get(4)),
							String.valueOf(lo.get(5)), String.valueOf(lo.get(6)), String.valueOf(lo.get(7)),
							String.valueOf(lo.get(8)), String.valueOf(lo.get(9)), String.valueOf(lo.get(10)),
							String.valueOf(lo.get(11)), String.valueOf(lo.get(12)), String.valueOf(lo.get(13)),
							String.valueOf(lo.get(14)), String.valueOf(lo.get(15)), String.valueOf(lo.get(16)),
							String.valueOf(lo.get(17)), String.valueOf(lo.get(18)), String.valueOf(lo.get(19)),
							user.getShopId());
					// 没有权限，且日期在两个月前的数据不做操作
					if (!user.isHasDeleteHistoryAuthority() && DateUtils.compareMonthsAgo(String.valueOf(lo.get(0)))) {
						noAuthorityMsg = noAuthorityMsg.append(" ");
						noAuthorityMsg = noAuthorityMsg.append((i + 2));
					} else {
						saleBeans.add(saleBean);
					}
				} else {
					errorFormatMsg.append(checkMsg);
				}
			}
			if (noAuthorityMsg.toString().equals(noDeleteHistoryAuthority)) {
				noAuthorityMsg.delete(0, noAuthorityMsg.length());
			}
			if (!errorFormatMsg.toString().equals("")) {
				WriteObject(response, errorFormatMsg);
			} else if (saleBeans.size() > 0) {
				WriteObject(response, drillShowServiceImpl.insertByBatchLarge(saleBeans)+noAuthorityMsg);
			} else {
				WriteObject(response, noData + noAuthorityMsg);
			}
		}catch (ExcelException excele) {
			excele.printStackTrace();
			WriteObject(response, excele.getMessage());
		} catch (Exception e) {
			WriteObject(response, savesErroy);
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
