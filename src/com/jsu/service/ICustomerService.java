package com.jsu.service;

import java.sql.SQLException;
import java.util.List;

import com.jsu.po.Customer;
import com.jsu.po.Device;
import com.jsu.po.Users;

public interface ICustomerService {
	/*
	public void saveUser(Users user) throws SQLException;  
	  
    public void delUser(Users user) throws SQLException;  
  
    public void editUsre(Users user) throws SQLException;  
  
    public Users getUserById(int id) throws SQLException;
    */
	
	public List<Customer> getAllCustomer();
}
