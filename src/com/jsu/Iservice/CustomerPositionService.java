package com.jsu.Iservice;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.dao.ICustomerPositionDaoImpl;
import com.jsu.dao.IDeviceDaoImpl;
import com.jsu.dao.IStoreDaoImpl;
import com.jsu.dao.IUserDaoImpl;
import com.jsu.po.Customer_Position;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;
import com.jsu.service.ICustomerPositionService;
import com.jsu.service.IDeviceService;
import com.jsu.service.IStoreService;
import com.jsu.service.IUserService;

public class CustomerPositionService implements ICustomerPositionService{
	
	private ICustomerPositionDaoImpl user_imple;
	
	
	public void setICustomerPositionDaoImpl(ICustomerPositionDaoImpl iUserDaoImpl) {
		this.user_imple = iUserDaoImpl;
	}

	@Override
	public List<Customer_Position> getAllCustomerPosition() {
		// TODO Auto-generated method stub
		return user_imple.getAllPosition();
	}




}
