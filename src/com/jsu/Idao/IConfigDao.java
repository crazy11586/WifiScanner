package com.jsu.Idao;

import java.sql.SQLException;
import java.util.List;

import com.jsu.po.Customer;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;

public interface IConfigDao {  
	
	public List queryBySql(String sql);
	public int excuteBySql(String sql);
}  