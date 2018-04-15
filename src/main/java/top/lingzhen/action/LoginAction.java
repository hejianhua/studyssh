package top.lingzhen.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import top.lingzhen.domain.user.User;
import top.lingzhen.service.UserService;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	User user=new User();
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login(){
		userService.login(user);
		return "success";
	}
	@Override
	public User getModel() {
		return user;
	}
}
