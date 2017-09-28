package bi.baiqiu.service;

import java.util.List;

import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;

public interface UserService {

	User login(String username);

	/**
	 *@Function UserService.java
	 *@Description: 该函数的功能描述
	 *@param 
	 *@return：List<UserRole>返回结果描述
	 *@throws：异常描述
	 *@author:Jim
	 *@date 2017年8月31日
	 *Modification History:
	 *Date			Author	Version	Description
	 *---------------------------------------------------------*
	 2017年8月31日	Jim		 1.0.0	描述
	 */
	List<UserRole> queryRoles(String roleIds);

	List<UserRoleFunction> queryUserRoleFunctions(String functionIds);

}
