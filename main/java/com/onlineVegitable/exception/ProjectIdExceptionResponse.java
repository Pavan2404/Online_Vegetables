package com.onlineVegitable.exception;

public class ProjectIdExceptionResponse {
private String vegetableIdentifier;



public ProjectIdExceptionResponse(String vegetableIdentifier) {
	super();
	this.vegetableIdentifier = vegetableIdentifier;
}

public String getVegetableIdentifier() {
	return vegetableIdentifier;
}

public void setVegetableIdentifier(String vegetableIdentifier) {
	this.vegetableIdentifier = vegetableIdentifier;
}


}
