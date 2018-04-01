package xc.ssh.service.impl;

import xc.ssh.dao.UserDao;
import xc.ssh.domain.User;
import xc.ssh.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDaoImpl;
	
	@Override
	public void save(User user) {
		System.out.println("啦啦啦我是userservice"+userDaoImpl);
		userDaoImpl.save(user);
	}

}
