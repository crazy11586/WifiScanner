package com.jsu.action;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.jsu.po.Numbers;
import com.jsu.po.Users1;
import com.opensymphony.xwork2.ActionSupport;

import scala.util.Random;

public class UserTestAction extends ActionSupport {  
    
    private List list;  
      
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
          
    	
    	
        return SUCCESS;  
    }  
    
    @org.junit.Test
	public void testName() throws Exception {
    	System.out.println(Test());
	}
    
    
  
}
