package com.jsu.Iservice;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.dao.ICoinfigDaoImpl;
import com.jsu.dao.ICustomerPositionDaoImpl;
import com.jsu.dao.IDeviceDaoImpl;
import com.jsu.dao.IStoreDaoImpl;
import com.jsu.dao.IUserDaoImpl;
import com.jsu.po.Customer_Position;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;
import com.jsu.service.IConfigService;
import com.jsu.service.ICustomerPositionService;
import com.jsu.service.IDeviceService;
import com.jsu.service.IStoreService;
import com.jsu.service.IUserService;

public class ConfigService implements IConfigService{
	
	private ICoinfigDaoImpl user_imple;
	
	
	public void setICoinfigDaoImpl(ICoinfigDaoImpl iUserDaoImpl) {
		this.user_imple = iUserDaoImpl;
	}


	@Override
	public List queryBySql(String sql) {
		// TODO Auto-generated method stub
		System.out.println(sql);
		return user_imple.queryBySql(sql);
	}


	@Override
	public int excuteBySql(String sql) {
		// TODO Auto-generated method stub
		return user_imple.excuteBySql(sql);
	}


}
