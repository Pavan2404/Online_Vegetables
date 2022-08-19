package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="username is required")
	
	String username;
	@NotBlank(message="EmailId is required")
	String emailId;
	@NotBlank(message="MobileNumber is required")

	String mobileno;

	int mobileno;
	@NotBlank(message="Password is required")
	@Size(min=4,max=5,message="Please use 6-8 character and Special  character")
	String password;
	@NotBlank(message="Address is required")
	String address;

	public User() {

	}


	public User(Long id,String username, String emailId, String mobileno, String password) {

	public User(Long id,String username, String emailId, int mobileno, String password) {

		super();
		this.id=id;
		this.username = username;
		this.emailId = emailId;
		this.mobileno = mobileno;
		this.password = password;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getuserName() {
		return username;
	}

	public void setuserName(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailID(String emailID) {
		this.emailId = emailID;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
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
		return "User [id=" + id + ", username=" + username + ", emailId=" + emailId + ", mobileno=" + mobileno
				+ ", password=" + password + ", address=" + address + "]";
	}


}
