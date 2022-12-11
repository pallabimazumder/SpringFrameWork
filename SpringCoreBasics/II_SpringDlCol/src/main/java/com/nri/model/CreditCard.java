package com.nri.model;

public class CreditCard {

	private int cardid;
	private String cardname;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	@Override
	public String toString() {
		return "CreditCard [cardid=" + cardid + ", cardname=" + cardname + "]";
	}
	
	
}
