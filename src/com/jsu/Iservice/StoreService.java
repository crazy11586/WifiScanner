package com.jsu.Iservice;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.dao.IDeviceDaoImpl;
import com.jsu.dao.IStoreDaoImpl;
import com.jsu.dao.IUserDaoImpl;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;
import com.jsu.service.IDeviceService;
import com.jsu.service.IStoreService;
import com.jsu.service.IUserService;

public class StoreService implements IStoreService{
	
	private IStoreDaoImpl user_imple;
	
	
	public void setIStoreDaoImpl(IStoreDaoImpl iUserDaoImpl) {
		this.user_imple = iUserDaoImpl;
	}


	@Override
	public List<Store> getAllStore() {
		// TODO Auto-generated method stub
		return user_imple.getAllStore();
	}


}
