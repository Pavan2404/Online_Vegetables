package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customersupport {
	@GeneratedValue
	@Id
	int userId;
	String complaints;
	public Customersupport() {
	}
	public Customersupport(int userId,String complaints) {
		this.userId=userId;
		this.complaints=complaints;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	@Override
	public String toString() {
		return "Customersupport [userId=" + userId + ", complaints=" + complaints + "]";
	}
	

}
