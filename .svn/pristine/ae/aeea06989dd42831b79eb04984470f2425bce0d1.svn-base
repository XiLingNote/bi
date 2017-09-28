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
import bi.baiqiu.pojo.SaleProductsTreasureBean;
import bi.baiqiu.pojo.User;
import bi.baiqiu.service.impl.SaleProductsTreasureServiceImpl;
import bi.baiqiu.utils.DateUtils;
import bi.baiqiu.utils.ImportExcelUtils;

/**
 * 品销宝
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("saleProductsTreasure")
public class SaleProductsTreasureController extends BaseController {
	@Autowired
	private SaleProductsTreasureServiceImpl saleProductsTreasureServiceImpl;

	/**
	 * 删除
	 * 
	 * @param bean
	 * @param pageNum
	 * @param pageSize
	 * @param requSaleProductsTreasure response
	 */
	@RequestMapping(value = "deleteSaleProductsTreasure.do")
	public void deleteSaleProductsTreasure(SaleProductsTreasureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			WriteObject(response, deleteSuccess + saleProductsTreasureServiceImpl.deleteSaleProductsTreasure(bean));
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
	@RequestMapping(value = "querySaleProductsTreasureByPage.do")
	public void queryByPage(SaleProductsTreasureBean bean, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) {
		User user=getLoginUser();
		try {
			response.setCharacterEncoding("utf-8");
			bean.setShopId(user.getShopId());
			Gson gson = new GsonBuilder().serializeNulls().create();
			Page<SaleProductsTreasureBean> page = saleProductsTreasureServiceImpl.queryByPage(bean, pageNum, pageSize);
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
	@RequestMapping(value = "updateSaleProductsTreasure.do")
	public void updateSaleProductsTreasure(SaleProductsTreasureBean bean, Integer pageNum, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			WriteObject(response, saveSuccess + saleProductsTreasureServiceImpl.updateSaleProductsTreasure(bean));
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
	@RequestMapping(value = "deleteSaleProductsTreasureByBatch.do")
	public void deleteSaleProductsTreasureByBatch(@RequestParam(value = "idArray[]") int[] idArray,
			HttpServletRequest request, HttpServletResponse response) {
		User user=getLoginUser();
		SaleProductsTreasureBean bean =new SaleProductsTreasureBean();
		bean.setIdArray(idArray);
		//不可删除两月前的数据
			bean.setDeleteHistory(user.isHasDeleteHistoryAuthority());
		try {
			int a = saleProductsTreasureServiceImpl.deleteSaleProductsTreasureByBatch(bean);
			WriteObject(response, deleteSuccess + a);
		} catch (Exception e) {
			e.printStackTrace();
			WriteObject(response, deleteErroy);
		}
	}

	/**
	 * 品销宝
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "uploadSaleProductsTreasure.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void uploadSaleProductsTreasure(HttpServletRequest request,  HttpServletResponse response) {
		User user=getLoginUser();
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
			List<SaleProductsTreasureBean> beans;
			in = file.getInputStream();
			listob = new ImportExcelUtils().getBankListByExcel(in, file.getOriginalFilename());
			beans = new ArrayList<SaleProductsTreasureBean>();
			String msg="";
			for (int i = 0; i < listob.size(); i++) {
				List<Object> lo = listob.get(i);
				if (lo.size() > 0&&DateUtils.isDateType(String.valueOf(lo.get(0)))) {
						SaleProductsTreasureBean bean = new SaleProductsTreasureBean(String.valueOf(lo.get(0)),
								String.valueOf(lo.get(1)), String.valueOf(lo.get(2)), String.valueOf(lo.get(3)),
								String.valueOf(lo.get(4)), String.valueOf(lo.get(5)), String.valueOf(lo.get(6)),
								String.valueOf(lo.get(7)), String.valueOf(lo.get(8)), String.valueOf(lo.get(9)),
								String.valueOf(lo.get(10)), String.valueOf(lo.get(11)), String.valueOf(lo.get(12)),
								String.valueOf(lo.get(13)), String.valueOf(lo.get(14)), String.valueOf(lo.get(15)),
								String.valueOf(lo.get(16)), String.valueOf(lo.get(17)), String.valueOf(lo.get(18)),
								String.valueOf(lo.get(19)), String.valueOf(lo.get(20)),
								 user.getShopId());
						// 没有权限，且日期在两个月前的数据不做操作
						if (!user.isHasDeleteHistoryAuthority()
								&&DateUtils.compareMonthsAgo(String.valueOf(lo.get(0)))) {
								msg=noDeleteHistoryAuthority;
						} else {
							beans.add(bean);
						}
						beans.add(bean);
				}
			}
			if (beans.size() > 0)
				WriteObject(response, saleProductsTreasureServiceImpl.insertByBatchLarge(beans));
			else{
				WriteObject(response, noData+msg);
				return;
			}
		} catch (NullPointerException e4) {
			WriteObject(response, analysisExcelErroy);
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
