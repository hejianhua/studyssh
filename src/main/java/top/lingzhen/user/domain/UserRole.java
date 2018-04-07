package top.lingzhen.user.domain;
/**
 * 会员角色实体类，对应在数据库中的会员角色表，因为不在采用外键作为约束
 * 条件，故创建了此实体类
 * @author Administrator
 *
 */
public class UserRole {
	//会员Id
	private String userId;
	//会员角色
	private String roleId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
}
