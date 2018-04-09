package top.lingzhen.service.impl;

import top.lingzhen.dao.BaseDao;
import top.lingzhen.service.BaseService;

public class BaseServiceImpl<T>  implements BaseService<T>{
	//获得baseDao
	private BaseDao<T> baseDaoImpl;
	
	@Override
	public void save(T t) {
		baseDaoImpl.saveOrUpdate(t);
	}

	
	
	
	public void setBaseDaoImpl(BaseDao<T> baseDaoImpl) {
		this.baseDaoImpl = baseDaoImpl;
		System.out.println("注入一下呀------"+baseDaoImpl);
	}
}
