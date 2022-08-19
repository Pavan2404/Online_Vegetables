package com.onlineVegitable.exception;

public class EmptyCartException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create EmptyCartException object without error message.
	 */
	public EmptyCartException() {
		super();
	}
	
	/**
	 * This will create EmptyCartException object with error message.
	 */
	public EmptyCartException(String msg) {
		super(msg);
	} 

}
