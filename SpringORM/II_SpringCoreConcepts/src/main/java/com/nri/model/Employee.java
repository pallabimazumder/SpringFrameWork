package com.nri.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eonebean")
public class Employee {
	
	@Value("101")
	private int empid;
	
	@Value("Sunny Trivedi")
	private String empname;
	
	@Value("#{citycol}")
	private List<String> city;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", city=" + city + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

}
