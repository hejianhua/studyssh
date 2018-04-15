package top.lingzhen.dao;

import top.lingzhen.domain.user.User;

public interface UserDao extends BaseDao<User>  {
	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	public int Login(User user); 
}
