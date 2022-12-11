package com.nri.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.nri.service.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		// Advice 
		System.out.println("Auth done... Payment  Service can get started......");
	}
}
