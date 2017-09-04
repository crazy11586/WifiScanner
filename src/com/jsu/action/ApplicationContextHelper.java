package com.jsu.action;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.xml.sax.SAXException;

import com.jsu.tools.LruCache;

public class ApplicationContextHelper  implements ApplicationContextAware
{
    private static ApplicationContext applicationContext;

	public static LruCache<String,String> lrucache;

	public static boolean flag = true;
	
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException
    {
        this.applicationContext = applicationContext;
        lrucache = new LruCache<String, String>(100);
        
        System.out.println("OK");
    	System.out.println("load"+System.currentTimeMillis());

    }
    
 

    public void test()
    {
        // 使用ApplicationContext 的实例做你想做的事情,^_^
        // 如发布事件等:applicationContext.publishEvent(event);
    }
    
    public static Object getBean(String beanName) {  
    	System.out.println("getbean"+System.currentTimeMillis());
        return applicationContext.getBean(beanName);  
    }  
}
