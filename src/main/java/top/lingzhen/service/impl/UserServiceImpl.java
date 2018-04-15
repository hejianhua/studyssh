package top.lingzhen.service.impl;



import org.springframework.transaction.annotation.Transactional;

import top.lingzhen.dao.UserDao;
import top.lingzhen.domain.user.User;
import top.lingzhen.service.BaseService;
import top.lingzhen.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public int login(User user) {
		
		return userDao.Login(user);
	}
	
	
}

