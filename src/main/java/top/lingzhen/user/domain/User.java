package top.lingzhen.user.domain;

/**
 * 会员实体类
 * @author Administrator
 *
 */
public class User {
	//用户编号
	private String userId;
	//用户名
	private String userName;
	//会员密码
	private String userPassword;
	//会员账户状态(1.代表可用，0代表未激活或者账号异常)
	private String userState;
	//会员的创建日期
	private String userCreateTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserCreateTime() {
		return userCreateTime;
	}
	public void setUserCreateTime(String userCreateTime) {
		this.userCreateTime = userCreateTime;
	}
	
	
}
