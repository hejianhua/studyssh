package xc.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import xc.ssh.dao.UserDao;
import xc.ssh.domain.User;

public class UserDaoImpl  implements UserDao {
	
	private SessionFactory sessionFactory;
	private String aaa;

	 
	@Override 
	public void save(User user) {
		System.out.println(aaa);
		Session session = sessionFactory.openSession();
		session.save(user);
		
		System.out.println("保存一下user，测试通过没有？");
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

		
	
}
