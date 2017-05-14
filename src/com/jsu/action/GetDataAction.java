package com.jsu.action;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsu.Iservice.CustomerPositionService;
import com.jsu.Iservice.CustomerService;
import com.jsu.Iservice.DeviceService;
import com.jsu.Iservice.StoreService;
import com.jsu.Iservice.UserService;
import com.jsu.po.Numbers;
import com.jsu.po.Users1;
import com.opensymphony.xwork2.ActionSupport;

import scala.util.Random;

public class GetDataAction extends ActionSupport {  
    
    private List list;  
    private String action;
    ApplicationContext context;
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
    	
    	context = new ClassPathXmlApplicationContext("/applicationContext.xml"); 
    	if(action.equals("getStore")){
    		GetStore();
    	}else if(action.equals("getDevice")){
    		GetDevice();
    	}else if(action.equals("getCustomer")){
    		GetCustomer();
    	}else if(action.equals("getCustomerPosition")){
    		GetCustomerPosition();
    	}else{
    		list.add("The args is Error !!! ");
    	}
        return SUCCESS;  
    }  
    
    private void GetDevice() {
		// TODO Auto-generated method stub
    	 
    	DeviceService service =(DeviceService) context.getBean("deviceService");
    	list = service.getAllDevice();
	}

	private void GetStore() {
		// TODO Auto-generated method stub
		
    	StoreService service =(StoreService) context.getBean("storeService");
	    
    	list = service.getAllStore();
    	
	}

	private void GetCustomerPosition() {

		CustomerPositionService service =(CustomerPositionService) context.getBean("customerpositionService");
    	list = service.getAllCustomerPosition();
	}

	private void GetCustomer() {
		
		CustomerService service =(CustomerService) context.getBean("customerService");
    	list = service.getAllCustomer();
	}
    
    
  
}
