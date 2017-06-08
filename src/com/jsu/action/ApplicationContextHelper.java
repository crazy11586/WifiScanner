package com.jsu.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextHelper  implements ApplicationContextAware
{
    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException
    {
        this.applicationContext = applicationContext;
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
