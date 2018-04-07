package top.lingzhen.user.domain;

import java.io.Serializable;

/**
 * 所有模块对应实体类
 * @author Administrator
 *
 */
public class Module implements Serializable{
   //模块编号
   private String moduleId;
   //模块名
   private String moduleName;
   //模块链接
   private String moduleLink;
   //模块权限标记
   private String RightFlag;
   //模块创造日期
   private String moduleCreateTime;
   
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleLink() {
		return moduleLink;
	}
	public void setModuleLink(String moduleLink) {
		this.moduleLink = moduleLink;
	}
	public String getRightFlag() {
		return RightFlag;
	}
	public void setRightFlag(String rightFlag) {
		RightFlag = rightFlag;
	}
	public String getModuleCreateTime() {
		return moduleCreateTime;
	}
	public void setModuleCreateTime(String moduleCreateTime) {
		this.moduleCreateTime = moduleCreateTime;
	}
	   
   
	
}
