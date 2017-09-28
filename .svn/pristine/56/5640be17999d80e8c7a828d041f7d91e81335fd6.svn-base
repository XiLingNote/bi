package bi.baiqiu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bi.baiqiu.mapper.UserMapper;
import bi.baiqiu.pojo.User;
import bi.baiqiu.pojo.UserRole;
import bi.baiqiu.pojo.UserRoleFunction;
import bi.baiqiu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String username) {
		return userMapper.login(username);
	}

	@Override
	public List<UserRole> getRoles(String roleIds) {
		return userMapper.getRoles(roleIds);
	}

	@Override
	public List<UserRoleFunction> getUserRoleFunctions(String functionIds) {
		return userMapper.getUserRoleFunctions(functionIds);
	}
}
