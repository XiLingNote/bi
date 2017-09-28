package bi.baiqiu.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bi.baiqiu.mapper.UserMapper;
import bi.baiqiu.pojo.Shop;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;

@Service("userService")
public class UserServiceImpl {
	@Autowired
	private UserMapper userMapper;
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

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
	public User queryUserByUsername(String username) {
		return userMapper.login(username);
	}

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

	public List<UserRole> queryRoles(String roleIds) {
		return userMapper.queryRoles(roleIds);
	}

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

	public List<UserRoleFunction> queryUserRoleFunctions(String functionIds) {
		return userMapper.queryUserRoleFunctions(functionIds);
	}

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
	public List<Shop> queryDepartmentShop(String functionIds) {
		return userMapper.queryDepartmentShop(functionIds);
	}

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

	public List<User> queryShopUser(Integer shopId) {
		return userMapper.queryShopUser(shopId);
	}

	/**
	 * @Function UserServiceImpl.java
	 * @Description: 添加店铺子账号
	 * @param
	 * @return：void返回结果描述
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	public void addShopUser(User user) {
		userMapper.insertSelective(user);
	}

	/**
	 * @Function UserServiceImpl.java
	 * @Description: 修改用户信息
	 * @param
	 * @return：void
	 * @throws：异常描述
	 * @author:Jim
	 * @date 2017年9月6日 Modification History: Date Author Version Description
	 *       ---------------------------------------------------------*
	 *       2017年9月6日 Jim 1.0.0 描述
	 */
	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

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
	public List<User> queryAllShopManger() {
		return userMapper.queryAllShopManger();
	}

	public List<Shop> queryShop() {
		return userMapper.queryShop();
	}

}
