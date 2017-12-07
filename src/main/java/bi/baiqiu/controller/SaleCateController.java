package bi.baiqiu.controller;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bi.baiqiu.mapper.SaleCateMapper;
import bi.baiqiu.mapper.ShopBeanMapper;
import bi.baiqiu.pojo.SaleCate;
import bi.baiqiu.pojo.SaleCateExample;
import bi.baiqiu.pojo.ShopBean;
import bi.baiqiu.pojo.User;
/**@version: v1.0.0
 * @author Jared
 *@date  Creat Time : 2017年10月24日 下午2:22:20
 * @Description: 部门管理
 */
@Controller
@RequestMapping(value = "saleCate")
public class SaleCateController extends BaseController {
	@Autowired
	public SaleCateMapper saleCateDao;
	@Autowired
	private ShopBeanMapper shopDao;
	/** 
	 * @Function: getSaleCate 
	 * @Description:查询 有效的部门
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月24日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "getSaleCate")
	public void getSaleCate(HttpServletRequest request,HttpServletResponse response){
		SaleCateExample example=new SaleCateExample();
		example.createCriteria().andExEqualTo(new Byte("1"));
		List<SaleCate> saleCates=saleCateDao.selectByExample(example);
		WriteObject(response, saleCates);
	}
	/** 
	 * @Function: getSaleCateSelf 
	 * @Description:当前登录用户的所在部门
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年10月24日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "getSaleCateByShop")
	public void getSaleCateByShop(HttpServletRequest request,HttpServletResponse response){
		User user=getLoginUser();
		user.getShopId();
		ShopBean shop=shopDao.selectByPrimaryKey(user.getShopId());
		SaleCateExample example=new SaleCateExample();
		example.createCriteria().andExEqualTo(new Byte("1")).andIdEqualTo(shop.getScId());
		List<SaleCate> saleCates=saleCateDao.selectByExample(example);
		WriteObject(response, saleCates);
	}
	/** 
	 * @Function: getplat 
	 * @Description:部门查询
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年12月4日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "getplat")
	public void getplat(HttpServletRequest request,HttpServletResponse response){

		List<Map<String, String>> saleCates=saleCateDao.queryplat();
		WriteObject(response, saleCates);
	}
	/** 
	 * @Function: createSaleCate 
	 * @Description:添加
	 * @param request
	 * @param response    
	 * @return void 
	 * @throws 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------
	 * 2017年12月4日      Jared           v1.0.0              
	*/
	@ResponseBody
	@RequestMapping(value = "createSaleCate")
	public void createSaleCate(HttpServletRequest request,HttpServletResponse response){
		
	}
	@ResponseBody
	@RequestMapping(value = "updateSaleCate")
	public void updateSaleCate(HttpServletRequest request,HttpServletResponse response){
		
	}
}
