package xc.ssh.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xc.ssh.dao.UserDao;
import xc.ssh.dao.impl.UserDaoImpl;
import xc.ssh.domain.User;


public class HibernateTest {
	
	

	
	@Test
	public void saveTest(){
		ApplicationContext  ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = new User();
		user.setName("aaaaaa");
		UserDaoImpl userDaoImpl = (UserDaoImpl) ac.getBean("userDaoImpl");
		userDaoImpl.save(user);
	}
	
	
	

	
	
	
}
