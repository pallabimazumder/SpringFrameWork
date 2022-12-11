package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

//Day 17  : 27th Nov - Spring AOP Module and Bean Life Cycle - DI Col - Auto
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring DI Of Collections - List & Set" );
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        Customer obj = ioc.getBean("custone",Customer.class);
        
        obj.showGenInfo();
        obj.showHobbies();
        obj.showAdress();
        obj.showPets();
        obj.showCreditCard();
    }
}
