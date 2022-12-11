package com.nri.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String useremail;
	private String username;
	private String userpwd;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String useremail, String username, String userpwd) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.username = username;
		this.userpwd = userpwd;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", useremail=" + useremail + ", username=" + username + ", userpwd=" + userpwd
				+ "]";
	}

}
