package top.lingzhen.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.lingzhen.dao.UserDao;
import top.lingzhen.domain.user.User;

public class UserDaoImpl  extends BaseDaoImpl<User>  implements  UserDao {
	public static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	@Override
	/**
	 * 测试login
	 */
	public int Login(User user) {
		//条件查询我们采用QBC查询，它比较适合
		//Criteria criteria = this.getSession().createCriteria(User.class);

		//criteria.add(Restrictions.and(Restrictions.eq("userName", "test"), Restrictions.eq("userPassword", "test123")));
		 Query query = this.getSession().createQuery("from User where user_name=? and user_password=?");
		 query.setParameter(0, user.getUserName());
		 query.setParameter(1, user.getUserPassword());
		
		List<User> list = query.list();
		if(list.size()>0){
			//证明登录成功！
			logger.info("登录成功"+"用户名:"+list.get(0).getUserName()+"密码"+list.get(0).getUserPassword());
			return 1;
		}
		return 0;
	}
	
	
	

}
