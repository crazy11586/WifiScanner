package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.ICustomerCountDao;
import com.jsu.Idao.ICustomerDao;
import com.jsu.Idao.IStoreDao;
import com.jsu.Idao.IUserDao;
import com.jsu.po.Customer;
import com.jsu.po.CustomerCount;
import com.jsu.po.Store;
import com.jsu.po.Users;

public class ICustomerCountDaoImpl implements ICustomerCountDao {
	
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
	public List<CustomerCount> getAllCustomerCountDao() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from CustomerCount");
	}
	
	@Override
	public List<CustomerCount> getCustomerCountDao(String time1 , String time2) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from CustomerCount where current_time between "+time1+" and "+time2 +" Order by (current_time + 0) ASC");
	}

	
}
