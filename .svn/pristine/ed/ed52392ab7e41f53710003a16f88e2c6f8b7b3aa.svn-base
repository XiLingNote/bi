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
import bi.baiqiu.pojo.WirelessFlowStructureBean;
import bi.baiqiu.service.impl.TableTitleServiceImpl;
import bi.baiqiu.service.impl.WirelessFlowStructureServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ExcelException;
import bi.baiqiu.utils.ImportExcelUtils;
import bi.baiqiu.utils.UtilTool;

/**
 * 无线流量结构控制层
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("wirelessFlowStructure")
public class WirelessFlowStructureController extends BaseController {
	@Autowired
	private WirelessFlowStructureServiceImpl wirelessFlowStructureServiceImpl;
	@Autowired
	private TableTitleServiceImpl tableTitleServiceImpl; 
	/**
	 * 删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "deleteWirelessFlowStructure.do")
	public void deleteWirelessFlowStructure(WirelessFlowStructureBean bean, 
			HttpServletRequest request, HttpServletResponse response) {
		User user=getLoginUser();
		try {
			WriteObject(response, deleteSuccess + wirelessFlowStructureServiceImpl.deleteWirelessFlowStructure(bean,user));
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
	@RequestMapping(value = "queryWirelessFlowStructureByPage.do")
	public void queryWirelessFlowStructureByPage(WirelessFlowStructureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		User user=getLoginUser();
		try {
			response.setCharacterEncoding("utf-8");
			bean.setShopId(user.getShopId());
			Gson gson = new GsonBuilder().serializeNulls().create();
			Page<WirelessFlowStructureBean> page = wirelessFlowStructureServiceImpl.queryByPage(bean, pageNum,
					pageSize);
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
	@RequestMapping(value = "updateWirelessFlowStructure.do")
	public void updateWirelessFlowStructure(WirelessFlowStructureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			WriteObject(response, saveSuccess+ wirelessFlowStructureServiceImpl.updateWirelessFlowStructure(bean));
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
	@RequestMapping(value = "deleteWirelessFlowStructureByBatch.do")
	public void deleteWirelessFlowStructureByBatch(@RequestParam(value = "idArray[]") int[] idArray,
			HttpServletRequest request, HttpServletResponse response) {
		WirelessFlowStructureBean bean = new WirelessFlowStructureBean();
		User user = getLoginUser();
		try {
			bean.setIdArray(idArray);
			// 不可删除两月前的数据
			bean.setDeleteHistory(user.isHasDeleteHistoryAuthority());
			int a = wirelessFlowStructureServiceImpl.deleteWirelessFlowStructureByBatchList(bean);
			WriteObject(response, deleteSuccess + a);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * pc流量结构上传
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "uploadWirelessFlowStructure.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void uploadWirelessFlowStructure(HttpServletRequest request, HttpServletResponse response) {
		User user = getLoginUser();
		// 上传文件用
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in = null;
		List<List<Object>> listob = null;
		// MultipartFile file = multipartRequest.getFile("upfile"); jquery 提交的文件
		MultipartFile file = multipartRequest.getFile("txt_file");// bootstrap获取流的方式
		try {
			if (file == null || file.isEmpty()) {
				throw new Exception("文件不存在！");
			}
			List<TableTitleBean> titleList = tableTitleServiceImpl.queryTableTitle("wirelessFlowStructure");
			List<WirelessFlowStructureBean> wirelessFlowStructures;
			in = file.getInputStream();
			listob = new ImportExcelUtils().getBankListByExcel(in, file.getOriginalFilename(),titleList);
			wirelessFlowStructures = new ArrayList<WirelessFlowStructureBean>();
//删除历史记录权限
			StringBuffer noAuthorityMsg = new StringBuffer(noDeleteHistoryAuthority);
			StringBuffer errorFormatMsg = new StringBuffer("");
			for (int i = 0; i < listob.size(); i++) {
				List<Object> lo = listob.get(i);
				String checkMsg=checkData(titleList,lo,i+2);
				if (lo.size() > 0 &&checkMsg.equals("")) {
					//不填数据防止空指针
					lo=addNull(lo, (16-lo.size()));
					
					WirelessFlowStructureBean wirelessFlowStructure = new WirelessFlowStructureBean(
							String.valueOf(lo.get(0)), UtilTool.convertToString(String.valueOf(lo.get(1))), UtilTool.convertToString(String.valueOf(lo.get(2))),
							String.valueOf(lo.get(3)), String.valueOf(lo.get(4)), String.valueOf(lo.get(5)),
							String.valueOf(lo.get(6)), String.valueOf(lo.get(7)), String.valueOf(lo.get(8)),
							String.valueOf(lo.get(9)), String.valueOf(lo.get(10)), String.valueOf(lo.get(11)),
							String.valueOf(lo.get(12)), String.valueOf(lo.get(13)), String.valueOf(lo.get(14)),
							String.valueOf(lo.get(15)), String.valueOf(lo.get(16)), user.getShopId());
					if (!user.isHasDeleteHistoryAuthority()) {
						noAuthorityMsg = noAuthorityMsg.append(" ");
						noAuthorityMsg = noAuthorityMsg.append((i + 2));
					} else {
						wirelessFlowStructures.add(wirelessFlowStructure);
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
			} else if (wirelessFlowStructures.size() > 0) {
				// 错误提示信息空时将错误信息为空
				WriteObject(response, wirelessFlowStructureServiceImpl.insertByBatchLarge(wirelessFlowStructures) + noAuthorityMsg);
			} else {
				WriteObject(response, noData+noAuthorityMsg);
			}
			
		}catch (ExcelException excele) {
			excele.printStackTrace();
			WriteObject(response, excele.getMessage());
		}  
		catch (Exception e) {
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
