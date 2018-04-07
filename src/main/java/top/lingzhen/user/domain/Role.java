package top.lingzhen.user.domain;

import java.io.Serializable;

/**
 * 角色实体类
 * @author Administrator
 *
 */
public class Role implements Serializable{
	//角色Id
	private String roleId;
	//角色名
	private String roleName;
	//角色描述
	private String roleDeclare;
	//角色创建日期
	private String roleCreateTime;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDeclare() {
		return roleDeclare;
	}
	public void setRoleDeclare(String roleDeclare) {
		this.roleDeclare = roleDeclare;
	}
	public String getRoleCreateTime() {
		return roleCreateTime;
	}
	public void setRoleCreateTime(String roleCreateTime) {
		this.roleCreateTime = roleCreateTime;
	}
	
}
