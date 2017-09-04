package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.IDeviceDao;
import com.jsu.Idao.IUserDao;
import com.jsu.po.Device;
import com.jsu.po.PositionInfo;
import com.jsu.po.Users;

public class IDeviceDaoImpl implements IDeviceDao {
	
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
	public List<Device> getAllDevice() {
		// TODO Auto-generated method stub
		
		
		return getHibernateTemplate().find("from Device");
		
	}

	@Override
	public List<Device> getDeviceFromId(int id ) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return getHibernateTemplate().find("from Device where Store_id = "+id);
	}

	public List<PositionInfo> getAllPositionInfo(String mac) {
		// TODO Auto-generated method stub
		String sql = "select Customer_mac,Position_x,Position_y,sum(staytime)/1000+'' from customer_position,customer_info where  Customer_mac =mac group by mac";
		List list = getHibernateTemplate().getSessionFactory().openSession().createSQLQuery(sql).list();
		return list;
	}
	
}
