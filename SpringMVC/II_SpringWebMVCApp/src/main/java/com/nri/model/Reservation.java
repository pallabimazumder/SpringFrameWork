package com.nri.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Reservation {
	private String firstName;
	private String lastName;
	private String gender;
	private String food;
	private List<String> cityfrom;
	private List<String> cityto;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(String firstName, String lastName, String gender, String food, List<String> cityfrom,
			List<String> cityto) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.food = food;
		this.cityfrom = cityfrom;
		this.cityto = cityto;
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public List<String> getCityfrom() {
		return cityfrom;
	}
	public void setCityfrom(List<String> cityfrom) {
		this.cityfrom = cityfrom;
	}
	public List<String> getCityto() {
		return cityto;
	}
	public void setCityto(List<String> cityto) {
		this.cityto = cityto;
	}
	@Override
	public String toString() {
		return "Reservation [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", food="
				+ food + ", cityfrom=" + cityfrom + ", cityto=" + cityto + "]";
	}
}
