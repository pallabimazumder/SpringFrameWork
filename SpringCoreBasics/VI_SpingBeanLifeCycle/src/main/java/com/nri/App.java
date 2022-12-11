package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
    	Customer obj = ioc.getBean("custbean",Customer.class);
    	
    	System.out.println(obj.getMsg());
    	ioc.registerShutdownHook();
    }
}
