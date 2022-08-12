package com.onlineVegitable.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	int stars;
	String suggestion;
	public Feedback(){
		
	}
	public Feedback(int stars,String suggestion) {
		this.stars=stars;
		this.suggestion=suggestion;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "Feedandsupport [stars=" + stars + ", suggestion=" + suggestion + "]";
	}
	

}
