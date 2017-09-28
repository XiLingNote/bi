package bi.baiqiu.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * @comment 自定义拦截器,有任意一个角色就可以访问指定的连接
 * eg：/page/index.do=authc,roleOrFilter["admin,director"]
 * @author Jim
 * @date 2017年8月30日 下午4:14:09
 * @version 1.0.0
 * @see
 */
public class CustomRolesAuthorizationFilter extends AuthorizationFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest req, ServletResponse resp,
			Object mappedValue) throws Exception {
		Subject subject = getSubject(req, resp);
		String[] rolesArray = (String[]) mappedValue;
		// 没有角色限制，有权限访问
		if (rolesArray == null || rolesArray.length == 0) {
			return true;
		}
		// 若当前用户是rolesArray中的任何一个，则有权限访问
		for (int i = 0; i < rolesArray.length; i++) {
			if (subject.hasRole(rolesArray[i])) {
				return true;
			}
		}
		return false;
	}

}
