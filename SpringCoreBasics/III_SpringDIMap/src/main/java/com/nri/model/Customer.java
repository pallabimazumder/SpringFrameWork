package com.nri.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Customer {

	private int cid;
	private String cname;
	
	private Map<String,String> toppings;
	private Map<Order,Price> ordprice;
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
	public Map<String, String> getToppings() {
		return toppings;
	}
	public void setToppings(Map<String, String> toppings) {
		this.toppings = toppings;
	}
	public Map<Order, Price> getOrdprice() {
		return ordprice;
	}
	public void setOrdprice(Map<Order, Price> ordprice) {
		this.ordprice = ordprice;
	}
	
	public void showGenInfo() {
		System.out.println("#Customer Details : "+cid+" "+cname);
	}
	public void showToppingDetails() {
		Set<Entry<String,String>> setinfo = toppings.entrySet();
		
		Iterator<Entry<String,String>> itr = setinfo.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
			System.out.println("#Topping Name : "+entry.getKey()+" #Flavour : "+entry.getValue());
		}
	}
	public void showOrderPriceDetails() {
		Set<Entry<Order,Price>> setinfo = ordprice.entrySet();
		
		Iterator<Entry<Order,Price>> itr = setinfo.iterator();
		
		while(itr.hasNext()) {
			Entry<Order,Price> entry = itr.next();
			System.out.println("#Order Details : "+entry.getKey().getOrdid()+" "+entry.getKey().getOrname());
			System.out.println("#Price Details : "+entry.getValue().getPid()+" "+entry.getValue().getPrice());
		}
	}
	
}
