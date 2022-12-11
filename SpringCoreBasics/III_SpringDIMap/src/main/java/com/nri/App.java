package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "DI of Map - Primitive and Reference Type" );
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        Customer obj = ioc.getBean("custbean",Customer.class);
        
        obj.showGenInfo();
        obj.showOrderPriceDetails();
        obj.showToppingDetails();
    }
}
