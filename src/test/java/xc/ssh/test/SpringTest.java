package xc.ssh.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xc.ssh.dao.impl.UserDaoImpl;




public class SpringTest {

	
	
	@Test
	public void fun1(){
		ApplicationContext  ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
/*		Object bean = ac.getBean("car");
		System.out.println(bean);
		
		Object bean2 = ac.getBean("user");
		System.out.println(bean2);*/
/*		SessionFactory bean3 = (SessionFactory) ac.getBean("sessionFactory");
		bean3.openSession();
		System.out.println(bean3);*/
		UserDaoImpl bean = (UserDaoImpl) ac.getBean("userDao");
		System.out.println(bean.getAaa());
	}
	
	
}
