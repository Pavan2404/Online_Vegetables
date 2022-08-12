package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Purchase {
	@GeneratedValue @Id
	int purchaseId;
	String billgenerated;
	int offer;
	int payoptions;
	
	String reciept;

	
	public Purchase() {
	}
	public Purchase(int purchaseId,String billgenerated,int offer,int payoptions,String reciept) {
		super();
		this.purchaseId=purchaseId;
		this.billgenerated = billgenerated;
		this.offer = offer;
		this.payoptions = payoptions;
		this.reciept = reciept;
		
		
	}
	
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getBillgenerated() {
		return billgenerated;
	}
	public void setBillgenerated(String billgenerated) {
		this.billgenerated = billgenerated;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	public int getPayoptions() {
		return payoptions;
	}
	public void setPayoptions(int payoptions) {
		this.payoptions = payoptions;
	}
	public String getReciept() {
		return reciept;
	}
	public void setReciept(String reciept) {
		this.reciept = reciept;
	}
	@Override
	public String toString() {
		return "Purchase [billgenerated=" + billgenerated + ", offer=" + offer + ", payoptions=" + payoptions
				+ ", reciept=" + reciept + "]";
	}
}

