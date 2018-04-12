package top.lingzhen.service;

import top.lingzhen.domain.user.User;

public interface UserService  extends BaseService<User>{
	public int login(User user);
}
