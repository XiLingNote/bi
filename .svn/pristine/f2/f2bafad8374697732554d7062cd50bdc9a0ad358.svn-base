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
import bi.baiqiu.pojo.TableTitleBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.VisitorMonthFeaturesBean;
import bi.baiqiu.service.impl.TableTitleServiceImpl;
import bi.baiqiu.service.impl.VisitorMonthFeathersServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ExcelException;
import bi.baiqiu.utils.ImportExcelUtils;

/**
 * 访客特征
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("visitorMonthFeature")
public class VisitorMonthFeaturesController extends BaseController {
	@Autowired
	private VisitorMonthFeathersServiceImpl visitorMonthFeatureServiceImpl;
	@Autowired
	private TableTitleServiceImpl tableTitleServiceImpl;

	/**
	 * 分页查询
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "queryVisitorMonthFeatureByPage.do")
	public void queryByPage(VisitorMonthFeaturesBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		try {
			response.setCharacterEncoding("utf-8");
			bean.setShopId(user.getShopId());
			Gson gson = new GsonBuilder().serializeNulls().create();
			Page<VisitorMonthFeaturesBean> page = visitorMonthFeatureServiceImpl.queryByPage(bean, pageNum, pageSize);
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
	@RequestMapping(value = "updateVisitorMonthFeatures.do")
	public void updateVisitorMonthFeatures(VisitorMonthFeaturesBean bean, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			WriteObject(response, saveSuccess + visitorMonthFeatureServiceImpl.updateVisitorMonthFeatures(bean));
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
	@RequestMapping(value = "deleteVisitorMonthFeaturesByBatch.do")
	public void deleteVisitorMonthFeaturesByBatch(@RequestParam(value = "idArray[]") int[] idArray,
			HttpServletRequest request, HttpServletResponse response) {
		VisitorMonthFeaturesBean bean = new VisitorMonthFeaturesBean();
		User user = getLoginUser();
		bean.setIdArray(idArray);
		// 不可删除两月前的数据
		bean.setDeleteHistory(user.isHasDeleteHistoryAuthority());
		try {
			int a = visitorMonthFeatureServiceImpl.deleteVisitorMonthFeaturesByBatch(bean);
			WriteObject(response, deleteSuccess + a);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * 访客特征
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "uploadVisitorMonthFeatures.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void uploadVisitorMonthFeatures(HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		// 上传文件用
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in = null;
		List<List<Object>> listob = null;
		// MultipartFile file = multipartRequest.getFile("upfile"); jquery 提交的文件
		MultipartFile file = multipartRequest.getFile("txt_file");// bootstrap获取流的方式
		try {
			List<TableTitleBean> titleList = tableTitleServiceImpl.queryTableTitle("visitorMonthFeatures");
			if (file == null || file.isEmpty()) {
				throw new Exception("文件不存在！");
			}
			StringBuffer noAuthorityMsg = new StringBuffer(noDeleteHistoryAuthority);
			StringBuffer errorFormatMsg = new StringBuffer("");
			List<VisitorMonthFeaturesBean> visitorMonthFeatures;
			in = file.getInputStream();
			listob = new ImportExcelUtils().getBankListByExcel(in, file.getOriginalFilename(), titleList);
			visitorMonthFeatures = new ArrayList<VisitorMonthFeaturesBean>();
			for (int i = 0; i < listob.size(); i++) {
				List<Object> lo = listob.get(i);
				String checkMsg = checkData(titleList, lo, i + 2);
				if (lo.size() > 0 &&checkMsg.equals("")) {
					//不填数据防止空指针
					lo=addNull(lo, (3-lo.size()));
					VisitorMonthFeaturesBean VisitorMonthFeaturesBean = new VisitorMonthFeaturesBean(
							DateUtils.stringToMontYear(String.valueOf(lo.get(0))), String.valueOf(lo.get(1)),
							String.valueOf(lo.get(2)),
							Float.valueOf((lo.get(3) == null || lo.get(3).equals("")) ? 0.0 + ""
									: String.valueOf(lo.get(3))),
							user.getShopId());
					if (!user.isHasDeleteHistoryAuthority() && DateUtils.compareMonthsAgo(String.valueOf(lo.get(0)))) {
						noAuthorityMsg = noAuthorityMsg.append(" ");
						noAuthorityMsg = noAuthorityMsg.append((i + 2));
					} else {
						visitorMonthFeatures.add(VisitorMonthFeaturesBean);
					}
				}else {
					errorFormatMsg.append(checkMsg);
				}
			}
			if (noAuthorityMsg.toString().equals(noDeleteHistoryAuthority)) {
				noAuthorityMsg.delete(0, noAuthorityMsg.length());
			}
			if (!errorFormatMsg.toString().equals("")) {
				WriteObject(response, errorFormatMsg);
			} else if (visitorMonthFeatures.size() > 0) {
				WriteObject(response,
						visitorMonthFeatureServiceImpl.insertByBatchLarge(visitorMonthFeatures) + noAuthorityMsg);
			} else {
				WriteObject(response, noData + noAuthorityMsg);
			}
		} catch (ExcelException excele) {
			WriteObject(response, excele.getMessage());
			excele.printStackTrace();
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
