package com.nri.service;

public class PaymentServiceImpl implements PaymentService{

	public void makePayment() {
		// Proxy payment service
		System.out.println("Amount is getting Debited");
		
		System.out.println("Processing... please don't refresh");
		
		System.out.println("Amount got credited");
	}
}
