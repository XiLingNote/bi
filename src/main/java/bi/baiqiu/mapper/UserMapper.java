package bi.baiqiu.mapper;

import java.util.List;

import bi.baiqiu.pojo.Shop;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;

import com.github.abel533.mapper.Mapper;

public interface UserMapper extends Mapper<User> {

	/**
	 * @Function UserMapper.java
	 * @Description: shiro登录方法
	 * @param username
	 *            用户名
	 * @return：User 返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年8月31日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年8月31日 Jim 1.0.0 描述
	 */
	public User login(String username);

	/**
	 * @Function UserMapper.java
	 * @Description: 根据角色ids：逗号拼接的字符串查询角色
	 * @param 逗号拼接的角色id字符串
	 *            不能为空和null
	 * @return：List<UserRole>返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年8月31日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年8月31日 Jim 1.0.0 描述
	 */
	public List<UserRole> queryRoles(String roleIds);

	/**
	 * @Function UserMapper.java
	 * @Description: 根据权限ids：逗号拼接的字符串查询角色
	 * @param 逗号拼接的权限id字符串
	 *            不能为空和null
	 * @return：List<UserRoleFunction>返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年8月31日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年8月31日 Jim 1.0.0 描述
	 */
	public List<UserRoleFunction> queryUserRoleFunctions(String functionIds);

	/**
	 * @Function UserMapper.java
	 * @Description: 根据当前登录用户的部门id获取可以查看数据的所有店铺
	 * @param 逗号拼接的部门id字符串
	 *            不能为空和null
	 * @return：List<Shop>返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年8月31日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年8月31日 Jim 1.0.0 描述
	 */
	public List<Shop> queryDepartmentShop(String scIds);
	/**
	 * @Function UserMapper.java
	 * @Description: 查询当前店铺关联的用户
	 * @param 店铺id
	 * @return：List<User>当前店铺关联的用户
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	public List<User> queryShopUser(Integer shopId);
	/**
	 * @Function UserMapper.java
	 * @Description: 查询所有店铺的管理员
	 * @param
	 * @return：List<User>所有店铺的管理员
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	public List<User> queryAllShopManger();
	/**
	 *@Function UserMapper.java
	 *@Description: 该函数的功能描述
	 *@param 
	 *@return：List<Shop>所有店铺
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年9月8日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年9月8日		Jim		 1.0.0	描述
	 */
	public List<Shop> queryShop();
}
