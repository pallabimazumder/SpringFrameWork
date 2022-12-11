package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Employee;
import com.nri.model.Manager;

//Stereotype Annotation
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocObj = new ClassPathXmlApplicationContext("appconfig.xml");
    	Employee eobj = iocObj.getBean("eonebean",Employee.class);
    	System.out.println(eobj);
    	Manager bogone = iocObj.getBean("mone",Manager.class);
    	System.out.println(bogone.hashCode());

    	Manager bogtwo = iocObj.getBean("mone",Manager.class);
    	System.out.println(bogtwo.hashCode());
    }
 }
/*
 * Spring Bean Scope:
 * 1. Singleton
 * 2. Prototype
 * 3. Request
 * 4. Session
 * 5. GlobalSessionScope -> Portlet
 */