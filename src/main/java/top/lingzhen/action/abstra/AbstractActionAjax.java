package top.lingzhen.action.abstra;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractActionAjax extends  ActionSupport {
	public JSONObject jsonReturn;
	private String result;
	public AbstractActionAjax(){
		jsonReturn = new JSONObject();
		jsonReturn.put("success", false);
	}
	public String execute() throws Exception {
		this.result=setResult();
		return "json";
	}
	
	public abstract String  setResult();
	

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
