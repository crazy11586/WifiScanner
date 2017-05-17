package com.jsu.action;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsu.Iservice.UserService;
import com.jsu.po.Users;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	public String username;
	public String password;
	


	public String execute(){

		UserService	service = (UserService) ApplicationContextHelper.getBean("userService");
		Users user = new Users();  	   
		user.setUser_name("me"); 
		// Save the object
		try {
			service.saveUser(user);
			System.out.println(user.getUser_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("sorry");
		}	
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		      //浠庡鍣� 鎺ョBean
//		Users user = (Users) ac.getBean("TUser");
//		      //杈撳嚭娆㈣繋淇℃伅
//		
//		System.out.println( "Hello:" + user.getUser_name() + ";u is in " + user.getUser_id() + " ;");
		
		return SUCCESS;
	}

	public void validate() {
		
		if (username == null || username.length() == 0) {
			super.addActionError("鐢ㄦ埛鍚嶄笉鑳戒负绌�");

		}
		
		if (password == null || password.length() == 0) {
			super.addActionError("瀵嗙爜涓嶈兘涓虹┖");

		}
		//sadas

	}
	
	@Test
	public void testName() throws Exception {


		UserService	service = (UserService) ApplicationContextHelper.getBean("userService");
//		
//		ApplicationContext context= new ClassPathXmlApplicationContext("/applicationContext.xml");  
//	    UserService service =(UserService) context.getBean("userService");
//	    
		Users user = new Users();  	   
		user.setUser_name("me"); 
		// Save the object
		service.saveUser(user);	
		
	}

}
