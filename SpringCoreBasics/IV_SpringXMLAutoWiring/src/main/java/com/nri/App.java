package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring AutoWiring Using XML Config...byName, byType or byConstructor" );
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        Customer cobj = ioc.getBean("custbean",Customer.class);
        
        System.out.println(cobj);
        
        
    }
}
