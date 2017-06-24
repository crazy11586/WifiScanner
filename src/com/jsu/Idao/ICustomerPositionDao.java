package com.jsu.Idao;

import java.sql.SQLException;
import java.util.List;

import com.jsu.po.Customer_Position;
import com.jsu.po.Device;
import com.jsu.po.Store;
import com.jsu.po.Users;

public interface ICustomerPositionDao {  
/*	  
    public void saveUser(Users user) throws SQLException;  
  
    public void delUser(Users user) throws SQLException;  
  
    public void editUsre(Users user) throws SQLException;  
  
    public Users getUserById(int id) throws SQLException;  
  */
	public List<Customer_Position> getAllPosition();
	public List<Customer_Position> getAllCustomerPositionTime(String time1 , String time2);
}  