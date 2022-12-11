package com.nri.model;

import java.util.List;
import java.util.Set;

public class Customer {
	private int cid;
	private String cname;
	private String country;
	
	private Order order;
	
	private List<String> hobbies;
	
	private List<Address> address;
	
	private Set<String> pets;
	
	private Set<CreditCard> card;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set<String> getPets() {
		return pets;
	}

	public void setPets(Set<String> pets) {
		this.pets = pets;
	}

	public Set<CreditCard> getCard() {
		return card;
	}

	public void setCard(Set<CreditCard> card) {
		this.card = card;
	}

	public void showGenInfo() {
		System.out.println("#Customer Details "+cid+" "+cname+" "+country);
		System.out.println("#Order Details "+order.getOrdid()+" "+order.getOname());
	}
	public void showHobbies() {
		System.out.println("#Hobbies are : ");
		for(String h:hobbies) {
			System.out.println(h);
		}
	}
	public void showAdress() {
		System.out.println("#Addresses are : ");
		for(Address a:address) {
			System.out.println(a.getAid()+" "+a.getCity());
		}
	}
	public void showPets() {
		System.out.println("#Pets are : ");
		for(String p:pets) {
			System.out.println(p);
		}
	}
	public void showCreditCard() {
		System.out.println("#Credit acrds are : ");
		for(CreditCard c:card) {
			System.out.println(c.getCardid()+" "+c.getCardname());
		}
	}
}
