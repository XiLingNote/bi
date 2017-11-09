package bi.baiqiu.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import bi.baiqiu.page.PageHelper.Page;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.management.StoreManagerPojo;
import bi.baiqiu.service.impl.ShopBeanServiceImpl;

@Controller
@RequestMapping(value = "storeManage")
public class CategoryStoreManageController extends BaseController {
	Logger log=Logger.getLogger(CategoryStoreManageController.class);
	@Autowired
	private ShopBeanServiceImpl shopBeanServiceImpl;
	/**
	 *@Function StoreManageController.java
	 *@Description: 店铺部门管理页面显示
	 *@param 
	 *@return：String返回结果描述
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年10月19日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年10月19日	Jim		 1.0.0	描述
	 */
	@RequestMapping(value = "storeView")
	public String view(HttpServletRequest request,Model model) {
		User user=getLoginUser();
		if(user==null){
			rememberUrl(request);
			model.addAttribute("msg", LOGIN);
			return "/showlogin";
		}
		return "/manage/storeManage";
	}

	/**
	 *@Function StoreManageController.java
	 *@Description: 添加部门
	 *@param 
	 *@return：String返回结果描述
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年10月19日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年10月19日	Jim		 1.0.0	描述
	 */
	@ResponseBody
	@RequestMapping(value = "addCategory")
	public String addCategory() {
		return "";
	}

	/**
	 *@Function StoreManageController.java
	 *@Description: 添加店铺
	 *@param 
	 *@return：String返回结果描述
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年10月19日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年10月19日	Jim		 1.0.0	描述
	 */
	@ResponseBody
	@RequestMapping(value = "addStore")
	public String addStore() {
		return "";
	}

	/**
	 *@Function StoreManageController.java
	 *@Description: 修改店铺信息
	 *@param 
	 *@return：String返回结果描述
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年10月19日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年10月19日	Jim		 1.0.0	描述
	 */
	@ResponseBody
	@RequestMapping(value = "saveOrUpdateStore")
	public void saveOrUpdateStore(StoreManagerPojo storeManagerPojo,HttpServletRequest request,HttpServletResponse response) {
		try {
			shopBeanServiceImpl.saveOrUpdateStoreMessage(storeManagerPojo);
			WriteMsg(response, saveSuccess);
		} catch (Exception e) {
			WriteMsg(response, savesErroy);
			log.error(e.getMessage());
		}
	}
	/** 
	 * @Function: getStroeList 
	 * @Description:店铺查询结果集合
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws IOException 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月23日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "getStroeList",method=RequestMethod.POST)
	public void getStroeList(StoreManagerPojo storeManagerPojo,Integer pageNum, Integer pageSize,HttpServletRequest request,HttpServletResponse response){
		try {
			Page<StoreManagerPojo> page=shopBeanServiceImpl.queryByPage(storeManagerPojo,pageNum,pageSize);
			WriteGson(response, page.getResult(),page.getTotal());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
