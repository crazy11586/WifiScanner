package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.IStoreDao;
import com.jsu.Idao.IUserDao;
import com.jsu.po.Store;
import com.jsu.po.Users;

public class IStoreDaoImpl implements IStoreDao {
	
	private HibernateTemplate hibernateTemplate;  
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
		this.sessionFactory = sessionFactory;
      //  this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
    }  
	
	public HibernateTemplate getHibernateTemplate(){
		
		if( hibernateTemplate==null)
			
			hibernateTemplate = new HibernateTemplate(sessionFactory);
	
		return hibernateTemplate;
	}

	@Override
	public List<Store> getAllStore() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Store");
	}
	
}
