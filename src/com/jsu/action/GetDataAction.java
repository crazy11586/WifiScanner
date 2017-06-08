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

import com.jsu.Iservice.ConfigService;
import com.jsu.Iservice.CustomerCountService;
import com.jsu.Iservice.CustomerPositionService;
import com.jsu.Iservice.CustomerService;
import com.jsu.Iservice.DeviceService;
import com.jsu.Iservice.StoreService;
import com.jsu.Iservice.UserService;
import com.jsu.po.CustomerCount;
import com.jsu.po.Numbers;
import com.jsu.po.Users1;
import com.opensymphony.xwork2.ActionSupport;

import kafka.common.Config;
import scala.util.Random;

public class GetDataAction extends ActionSupport implements ServletResponseAware{  
    
    private List list;
    private List temp;
    private String action;
    private ApplicationContext context;
    private int id;
    

    private String time1;
    private String time2;
    
    

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

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
    	}else if(action.equals("getCustomerCount")){
    		GetCustomerCount();
    	}else if(action.equals("getCustomerCount2time")){
    		GetCustomerCount2Time();
    	}else if(action.equals("getall")){
    		GetAllOrenter();
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
	
	private void GetCustomerCount() {
		// TODO Auto-gengeterated method stub
//		StoreService service = (StoreService) ApplicationContextHelper.getBean("storeService");  
		
		CustomerCountService service = (CustomerCountService) ApplicationContextHelper.getBean("customerCountService");
		list = service.getAllCustomerCountDao();
		
	}
	private void GetCustomerCount2Time() {		
		CustomerCountService service = (CustomerCountService) ApplicationContextHelper.getBean("customerCountService");
		list = service.getCustomerCountDao(time1, time2);		
	}

	private void GetCustomer() {
		
		CustomerService service =(CustomerService)ApplicationContextHelper.getBean("customerService");
    	list = service.getAllCustomer();
	}
	
	
	private void GetAllOrenter(){
		ConfigService service =(ConfigService)ApplicationContextHelper.getBean("configService");
    	list = service.queryBySql("select A.allCustomer , B.sum , A.currentTime from allc A,enter B where (B.currentTime+0)-(A.currentTime+0)>0 "
    			+ "and (B.currentTime+0)-(A.currentTime+0) < 3000 "
    			+ "and (A.currentTime+0) > "+time1+" and (A.currentTime+0) <  "+time2+"");
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
	
	//·¶Î§ÊÇ1496804400000 - 1496807999000
	
	/**
	 
	 	select A.allCustomer , B.sum 
	 			from allc A,enter B 
	 					where 
	 	(B.currentTime+0)-(A.currentTime+0)>0 
	 	and 
	 	(B.currentTime+0)-(A.currentTime+0) < 3000
	 	and (A.currentTime+0) > 1496808000000 
	 	and (A.currentTime+0) <  1496811599000;
	 
	 */
    
}
