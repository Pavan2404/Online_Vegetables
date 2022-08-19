package com.onlineVegitable.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vegetables")
public class Vegitable {
	
	@Id
	@GeneratedValue
	@Column(name="vegetable_id")
	private int vegetableId;
	
	@Column(name="vegetable_name")
	private String vegetableName;
	
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private double price;
	
	public Vegitable() {
		
	}
	
	public Vegitable(int vegetableId, String vegetableName, int quantity, double price) {
		super();
		this.vegetableId = vegetableId;
		this.vegetableName = vegetableName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getvegetableId() {
		return vegetableId;
	}
	public void setvegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}
	
	public String getvegetableName() {
		return vegetableName;
	}
	public void setvegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
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
	
	@Override
	public String toString() {
		return "vegetable [vegetableId=" + vegetableId + ", vegetableName=" + vegetableName + ", quantity=" + quantity
				+ ", price=" + price +  "]";
	}
}
	
	
	

