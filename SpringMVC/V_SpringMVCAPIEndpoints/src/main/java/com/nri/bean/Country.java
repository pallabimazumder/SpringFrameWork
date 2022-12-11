package com.nri.bean;

public class Country {

	private int cid;
	private String cname;
	private double cpopulation;
	public Country(int cid, String cname, double cpopulation) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpopulation = cpopulation;
	}
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
	public double getCpopulation() {
		return cpopulation;
	}
	public void setCpopulation(double cpopulation) {
		this.cpopulation = cpopulation;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", cpopulation=" + cpopulation + "]";
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
