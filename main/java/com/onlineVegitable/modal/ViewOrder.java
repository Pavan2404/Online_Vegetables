package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ViewOrder {
	
	@Id
	int OrderId;
	
	String vegname;
	
	int quantity;
	
	double price;
	
	int noofitems;

	public ViewOrder() {
		
	}

	public ViewOrder(int orderId, String vegname, int quantity, double price, int noofitems) {
		super();
		OrderId = orderId;
		this.vegname = vegname;
		this.quantity = quantity;
		this.price = price;
		this.noofitems = noofitems;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getVegname() {
		return vegname;
	}

	public void setVegname(String vegname) {
		this.vegname = vegname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofitems() {
		return noofitems;
	}

	public void setNoofitems(int noofitems) {
		this.noofitems = noofitems;
	}

	@Override
	public String toString() {
		return "ViewOrder [OrderId=" + OrderId + ", vegname=" + vegname + ", quantity=" + quantity + ", price=" + price
				+ ", noofitems=" + noofitems + "]";
	}
	
	

}
