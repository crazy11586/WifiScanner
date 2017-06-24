package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.ICustomerPositionDao;
import com.jsu.Idao.IStoreDao;
import com.jsu.Idao.IUserDao;
import com.jsu.po.Customer_Position;
import com.jsu.po.Store;
import com.jsu.po.Users;

public class ICustomerPositionDaoImpl implements ICustomerPositionDao {
	
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
	public List<Customer_Position> getAllPosition() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Customer_Position");
	}

	@Override
	public List<Customer_Position> getAllCustomerPositionTime(String time1 , String time2) {
		// TODO Auto-generated method stub
		//select * from customer_position where currentTime between 1497403200597 and 1497411000554;
		String str = "from Customer_Position where CurrentTime between " +time1+" and "+time2;
		return getHibernateTemplate().find(str);
	
	}
	
}
