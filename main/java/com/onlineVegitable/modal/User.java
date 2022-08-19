package com.onlineVegitable.modal;

public class User {
	String name;
	String emailId;
	int mobileno;
	String password;
	String address;

	public User() {

	}

	public User(String name, String emailId, int mobileno, String password) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobileno = mobileno;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailID(String emailID) {
		this.emailId = emailID;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", mobileno=" + mobileno + ", password=" + password
				+ ", address=" + address + "]";
	}

}
