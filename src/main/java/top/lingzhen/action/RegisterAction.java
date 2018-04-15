package top.lingzhen.action;

import top.lingzhen.domain.user.User;
import top.lingzhen.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction  extends AbstractActionAjax{
	private UserService  userServiceImpl;
	private String username;
	private String password;
	
	@Override
	public String setResult() {
		try {
			User user = new User();
			user.setUserName(username);
			user.setUserPassword(password);
			//userServiceImpl.save(user);
			jsonReturn.put("success", true);
			jsonReturn.put("msg", "ajax的第一次请求");
		} catch (Exception e) {
			System.out.println("能不能别报错了啊！");
			jsonReturn.put("success", false);
			jsonReturn.put("msg", e.getMessage());
			e.printStackTrace();
		}
		return jsonReturn.toString();
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
