package top.lingzhen.user.domain;

import java.io.Serializable;
/**
 * 角色权限实体类
 * @author Administrator
 *
 */
public class RoleRight implements Serializable{
	//角色ID
	private String roleId;
	//模块ID
	private String moduleId;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
}
