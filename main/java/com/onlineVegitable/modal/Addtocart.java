package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Addtocart

{
	@Id
	int quantity;
	
	String vegname;
	
	double price;
	
	int noofitems;
	
	int saveitorproceedtopay;
	
	public Addtocart(){
	}
	public  Addtocart(int quantity,String vegname,double price, int noofitems,int saveitorproceedtopay) {
		super();
		this.quantity = quantity;
		this.vegname = vegname;
		this.price = price;
		this.noofitems = noofitems;
		this.saveitorproceedtopay = saveitorproceedtopay;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getVegname() {
		return vegname;
	}

	public void setVegname(String vegname) {
		this.vegname = vegname;
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

	public int getSaveitorproceedtopay() {
		return saveitorproceedtopay;
	}

	public void setSaveitorproceedtopay(int saveitorproceedtopay) {
		this.saveitorproceedtopay = saveitorproceedtopay;
	}

	@Override
	public String toString() {
		return "addtocart [quantity=" + quantity + ", vegname=" + vegname + ", price=" + price + ", noofitems="
				+ noofitems + ", saveitorproceedtopay=" + saveitorproceedtopay + "]";
	}
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	


}
