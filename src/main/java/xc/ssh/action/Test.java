package xc.ssh.action;

import xc.ssh.dao.UserDao;
import xc.ssh.dao.impl.UserDaoImpl;
import xc.ssh.domain.User;

import com.opensymphony.xwork2.ActionSupport;

public class Test extends  ActionSupport  {

	private UserDao userDaoImpl;
	
	public String execute() {
		System.out.println(userDaoImpl);
		userDaoImpl.save(new User());
		System.out.println("我是action");
		return SUCCESS;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}


	
	
}
