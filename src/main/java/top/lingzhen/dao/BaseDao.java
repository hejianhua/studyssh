package top.lingzhen.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import top.lingzhen.domain.Page;
/**
 * 抽取baseDao完成基本的CRUD操作，分页操作等
 * @author Administrator
 *
 */
public interface BaseDao<T> {
	   	//查询所有，带条件查询
		public  List<T> find(String hql, Class<T> entityClass, Object[] params);
		//获取一条记录
		public  T get(Class<T> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page findPage(String hql, Page page, Class<T> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(T entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<T> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<T> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<T> entityClass, Serializable[] ids);
		//查询总记录数
		public  Integer  getTotalRecord(String hql ,Object[] params);
}
