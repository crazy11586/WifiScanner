package com.jsu.Iservice;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.dao.IDeviceDaoImpl;
import com.jsu.dao.IUserDaoImpl;
import com.jsu.po.Device;
import com.jsu.po.PositionInfo;
import com.jsu.po.Users;
import com.jsu.service.IDeviceService;
import com.jsu.service.IUserService;

public class DeviceService implements IDeviceService{
	
	private IDeviceDaoImpl user_imple;
	
	
	public void setIDeviceDaoImpl(IDeviceDaoImpl iUserDaoImpl) {
		this.user_imple = iUserDaoImpl;
	}


	@Override
	public List<Device> getAllDevice() {
		// TODO Auto-generated method stub
		return user_imple.getAllDevice();
	}
	
	@Override
	public List<PositionInfo> getAllPositionInfo(String mac) {
		// TODO Auto-generated method stub
		return user_imple.getAllPositionInfo(mac);
	}

	@Override
	public List<Device> getDeviceFromId(int id) {
		// TODO Auto-generated method stub
		return user_imple.getDeviceFromId(id);
	}
	
}
