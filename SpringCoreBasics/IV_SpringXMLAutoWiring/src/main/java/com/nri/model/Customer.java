package com.nri.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int cid;
	private String cname;

	private Address address1;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAddress() {
		System.out.println("Setter Injection in Action");
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Customer(Address address1) {
		super();
		System.out.println("CI in Action...");
		this.address1 = address1;
	}
	public Customer(int cid, String cname, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address1 = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address1 + "]";
	}
	
	
}