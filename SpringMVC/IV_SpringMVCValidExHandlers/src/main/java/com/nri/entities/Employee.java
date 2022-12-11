package com.nri.entities;

public class Employee {

	private String uname;
	
	//@Size(min=4,)
	@Pattern(regexp="[a-zA-Z0-9]{3}",message="Length must be 3 and as per Reg Ex")
	private String upass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "Employee [uname=" + uname + ", upass=" + upass + "]";
	}
	
	
}
