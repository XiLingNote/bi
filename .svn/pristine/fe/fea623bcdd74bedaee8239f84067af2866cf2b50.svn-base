package bi.baiqiu.shiro;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;
import bi.baiqiu.service.UserService;

public class UserRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// System.out.println("授权");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		String roleIds = user.getRoleIds();
		if ("admin".equals(user.getUsername())) {

		}

		List<UserRole> roles = userService.getRoles(user.getRoleIds());

		for (UserRole userRole : roles) {
			info.addRole(userRole.getRoleName());
			System.out.println(userRole.getRoleName());
			List<UserRoleFunction> functions = userService
					.getUserRoleFunctions(userRole.getFunctionIds());
			for (UserRoleFunction userRoleFunction : functions) {
				System.out.println(userRoleFunction);
				info.addStringPermission(userRoleFunction.getFunctionName());
			}
		}

		//
		// boolean hasRole = subject.hasRole("");
		// List<Function> functionList = facadeService.getFunctionService()
		// .findAll();
		// for (Function function : functionList) {
		// info.addStringPermission(function.getCode());
		// }
		// } else {
		// // Set<Role> roles = person.getRoles();
		// List<Role> roles = facadeService.getRoleService().findByPersonID(
		// person.getId());
		// for (Role role : roles) {
		// info.addRole(role.getCode());
		// Set<Function> functions = role.getFunctions();
		// for (Function function : functions) {
		// info.addStringPermission(function.getCode());
		// }
		// }
		//
		// }
		return info;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 *      shiro 登录方法 根据用户名查询user表，验证密码
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken token1 = (UsernamePasswordToken) token;
		User user = userService.login(token1.getUsername());
		if (user == null) {
			return null;
		} else {
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
					user.getPassword(), super.getName());
			return info;
		}
	}
}
