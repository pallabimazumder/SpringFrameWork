package com.nri.model;

public class Order {

	private int ordid;
	private String oname;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	@Override
	public String toString() {
		return "Order [ordid=" + ordid + ", oname=" + oname + "]";
	}
	
	
}
