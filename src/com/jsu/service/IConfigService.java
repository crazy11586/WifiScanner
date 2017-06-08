package com.jsu.service;

import java.sql.SQLException;
import java.util.List;

import com.jsu.po.Customer;
import com.jsu.po.CustomerCount;
import com.jsu.po.Device;
import com.jsu.po.Users;

public interface IConfigService {
	public List queryBySql(String sql);
	public int excuteBySql(String sql);
}
