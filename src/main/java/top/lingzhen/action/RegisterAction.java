package top.lingzhen.action;

import top.lingzhen.domain.user.User;
import top.lingzhen.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction  extends ActionSupport{
	private UserService  userServiceImpl;
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		try {
			User user = new User();
			user.setUserName(username);
			user.setUserPassword(password);
			userServiceImpl.save(user);
			
			
		} catch (Exception e) {
			System.out.println("能不能别报错了啊！");
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
}
