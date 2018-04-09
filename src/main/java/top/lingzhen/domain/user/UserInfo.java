package top.lingzhen.domain.user;

import java.io.Serializable;

/**
 * 会员具体信息实体类
 * @author Administrator
 *
 */
public class UserInfo implements Serializable{
	//会员信息编号
	private String userInfoId;
	//会员编号
	private String userId;
	//会员名
	private String userName;
	//会员生日
	private String userBirthday;
	//会员所属学院以及系部
	private String userCollege;
	//会员联系电话
	private String userNumber;
	//会员性别
	private String userSex;
	//会员学号
	private String userStudentId;
	//会员描述
	private String userDeclare;
	public String getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}
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
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserCollege() {
		return userCollege;
	}
	public void setUserCollege(String userCollege) {
		this.userCollege = userCollege;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserStudentId() {
		return userStudentId;
	}
	public void setUserStudentId(String userStudentId) {
		this.userStudentId = userStudentId;
	}
	public String getUserDeclare() {
		return userDeclare;
	}
	public void setUserDeclare(String userDeclare) {
		this.userDeclare = userDeclare;
	}
	
	
}
