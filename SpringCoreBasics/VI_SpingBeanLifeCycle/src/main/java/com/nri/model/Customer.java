package com.nri.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg =msg;
	}
	public void init() {
		System.out.println("Bean initialization code is here .......");
	}
	public void destroy() {
		System.out.println("Bean is about to get destroyed");
	}
}