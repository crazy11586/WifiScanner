package com.jsu.action;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsu.Iservice.DeviceService;
import com.jsu.Iservice.StoreService;
import com.jsu.Iservice.UserService;
import com.jsu.po.Numbers;
import com.jsu.po.Users1;
import com.opensymphony.xwork2.ActionSupport;

import scala.util.Random;

public class UserTestAction extends ActionSupport {  
    
    private List list;  
    private String action;
      
    public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

	public List getList() {  
        return list;  
    }  
  
    public void setList(List list) {  
        this.list = list;  
    }  
    
    

    public String Test(){  
//        Users1 users=new Users1();  
//        users.setId(11);  
//        users.setName("张三丰");  
//        users.setUsername("张三");  
//        users.setPassword("123456");  
//          
//        list=new ArrayList();  
//        list.add(users);  

    	if(action.equals("getstore")){
    		GetStore();
    	}else if(action.equals("getdevice")){
    		GetDevice();
    	}
    	
    	
    	
        return SUCCESS;  
    }  
    
    private void GetDevice() {
		// TODO Auto-generated method stub
    	ApplicationContext context= new ClassPathXmlApplicationContext("/applicationContext.xml");  
    	DeviceService service =(DeviceService) context.getBean("deviceService");
    	list = service.getAllDevice();
	}

	private void GetStore() {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("/applicationContext.xml");  
    	StoreService service =(StoreService) context.getBean("storeService");
	    
    	list = service.getAllStore();
	}

	@org.junit.Test
	public void testName() throws Exception {
    	System.out.println(Test());
	}
    
    
  
}
