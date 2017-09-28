package bi.baiqiu.shiro;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
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

import bi.baiqiu.pojo.Shop;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;
import bi.baiqiu.service.impl.UserServiceImpl;

public class UserRealm extends AuthorizingRealm {
	@Autowired
	private UserServiceImpl userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		String roleIds = user.getRoleIds();
		
		boolean b = false;
		/*
		 * if ("admin".equals(user.getUsername())) {
		 * 
		 * }
		 */
		// 有角色id先添加角色和权限
		if (StringUtils.isNotBlank(user.getRoleIds())) {
			List<UserRole> roles = userService.queryRoles(user.getRoleIds());

			for (UserRole userRole : roles) {
				if (userRole.getRoleName().equals("admin")||userRole.getRoleName().equals("director")) {
					b = true;
				}
				
				info.addRole(userRole.getRoleName());
				List<UserRoleFunction> functions = userService
						.queryUserRoleFunctions(userRole.getFunctionIds());
				for (UserRoleFunction userRoleFunction : functions) {
					info.addStringPermission(userRoleFunction.getFunctionName());
				}
			}
		}
		// 没有角色，根据权限id添加权限
		if (StringUtils.isNotBlank(user.getFunctionIds())) {
			List<UserRoleFunction> functions = userService
					.queryUserRoleFunctions(user.getFunctionIds());
			for (UserRoleFunction userRoleFunction : functions) {
				info.addStringPermission(userRoleFunction.getFunctionName());
			}
		}

		if (b) {
			List<Shop> shopList = userService.queryShop();
			user.setShopList(shopList);
		}

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
		System.out.println("login");
		UsernamePasswordToken token1 = (UsernamePasswordToken) token;
		User user = userService.queryUserByUsername(token1.getUsername());

		if (user == null) {
			return null;
		} else {
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
					user.getPassword(), super.getName());
			return info;
		}
	}
}
