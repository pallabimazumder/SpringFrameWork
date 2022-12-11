package com.nri.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	private int pID;
	private String firstName;
	private String lastName;
	private String gender;
	
	private String[] food;
	
	private String cityfrom;
	private String cityto;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(int pID, String firstName, String lastName, String gender, String[] food, String cityfrom,
			String cityto) {
		super();
		this.pID = pID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.food = food;
		this.cityfrom = cityfrom;
		this.cityto = cityto;
	}
	@Override
	public String toString() {
		return "Reservation [pID=" + pID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", food=" + Arrays.toString(food) + ", cityfrom=" + cityfrom + ", cityto=" + cityto + "]";
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getFood() {
		return food;
	}
	public void setFood(String[] food) {
		this.food = food;
	}
	public String getCityfrom() {
		return cityfrom;
	}
	public void setCityfrom(String cityfrom) {
		this.cityfrom = cityfrom;
	}
	public String getCityto() {
		return cityto;
	}
	public void setCityto(String cityto) {
		this.cityto = cityto;
	}
	
}
