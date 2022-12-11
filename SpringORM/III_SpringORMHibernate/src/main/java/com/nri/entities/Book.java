package com.nri.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblbook")
public class Book {

	@Id
	@Column(name="tblbook")
	private int bid;
	
	@Column(name="bookname")
	private String bname;
	
	@Column(name="bookauthor")
	private String bauthor;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname, String bauthor) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + "]";
	}
	
}
