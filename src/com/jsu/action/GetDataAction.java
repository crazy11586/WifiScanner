package com.jsu.action;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jsu.Iservice.CustomerPositionService;
import com.jsu.Iservice.CustomerService;
import com.jsu.Iservice.DeviceService;
import com.jsu.Iservice.StoreService;
import com.jsu.Iservice.UserService;
import com.jsu.po.Numbers;
import com.jsu.po.Users1;
import com.opensymphony.xwork2.ActionSupport;

import scala.util.Random;

public class GetDataAction extends ActionSupport implements ServletResponseAware{  
    
    private List list;  
    private String action;
    private ApplicationContext context;
    private int id;
    


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
    	System.out.println(id);
    	if(action.equals("getStore")){
    		GetStore();
    	}else if(action.equals("getDevice")){
    		GetDevice();
    	}else if(action.equals("getDeviceB")){
    		GetDeviceB();
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
    	 
    	DeviceService service = (DeviceService) ApplicationContextHelper.getBean("deviceService");
        //	DeviceService service =(DeviceService) context.getBean("deviceService");
       list = service.getAllDevice();
	}
    
    private void GetDeviceB() {
		// TODO Auto-generated method stub
    	DeviceService service = (DeviceService) ApplicationContextHelper.getBean("deviceService");
    //	DeviceService service =(DeviceService) context.getBean("deviceService");
    	list = service.getDeviceFromId(id);
	}

	private void GetStore() {
		// TODO Auto-gengeterated method stub
//		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");  
		
		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");
		list = service.getAllStore();
	}

	private void GetCustomerPosition() {

		CustomerPositionService service =(CustomerPositionService)ApplicationContextHelper.getBean("customerpositionService");
    	list = service.getAllCustomerPosition();
	}

	private void GetCustomer() {
		
		CustomerService service =(CustomerService)ApplicationContextHelper.getBean("customerService");
    	list = service.getAllCustomer();
	}
    @org.junit.Test
	public void testName() throws Exception {
		GetStore();
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Allow-Origin", "*");
	}
    
}
