package com.jsu.service;

import java.sql.SQLException;

import com.jsu.po.Users;

public interface IUserService {
	
	public void saveUser(Users user) throws SQLException;  
	  
    public void delUser(Users user) throws SQLException;  
  
    public void editUsre(Users user) throws SQLException;  
  
    public Users getUserById(int id) throws SQLException;
}
