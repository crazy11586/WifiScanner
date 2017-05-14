package com.jsu.Iservice;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.dao.ICustomerDaoImpl;
import com.jsu.dao.IDeviceDaoImpl;
import com.jsu.dao.IStoreDaoImpl;
import com.jsu.dao.IUserDaoImpl;
import com.jsu.po.Customer;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;
import com.jsu.service.ICustomerService;
import com.jsu.service.IDeviceService;
import com.jsu.service.IStoreService;
import com.jsu.service.IUserService;

public class CustomerService implements ICustomerService{
	
	private ICustomerDaoImpl user_imple;
	
	
	public void setICustomerDaoImpl(ICustomerDaoImpl iUserDaoImpl) {
		this.user_imple = iUserDaoImpl;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return user_imple.getAllCustomer();
	}


}
