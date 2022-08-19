package com.onlineVegetable.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
@NotBlank(message="vegaetableName is required")
	private String vegetableName;

@NotBlank(message="vegaetableIdetifier is required")
@Size(min=4,max=5,message="Please use 4-7 character only")
@Column(updatable =false,unique =true)
	private String vegetableIdentifier;
@NotBlank(message="vegaetableQuantity is required")
	private String vegetableQuantity;
@NotBlank(message="price is required")
	private String price;
	private Date start_date;
	private Date end_date;

	private Date createdAt;
	private Date updatedAt;
	
	
	
	

public Project() {
		super();
	}
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVegetableName() {
		return vegetableName;
	}
	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}
	public String getVegetableIdentifier() {
		return vegetableIdentifier;
	}
	public void setVegetableIdentifier(String vegetableIdentifier) {
		this.vegetableIdentifier = vegetableIdentifier;
	}
	public String getVegetableQuantity() {
		return vegetableQuantity;
	}
	public void setVegetableQuantity(String vegetableQuantity) {
		this.vegetableQuantity = vegetableQuantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
@PrePersist
	public void onCreate(){
		this.createdAt=new Date();
	}
@PreUpdate
	public void onUpdate() {
		this.updatedAt=new Date();
	}
}
