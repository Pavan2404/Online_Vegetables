package com.onlineVegitable.exception;

public class OrderNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create OrderNotFoundException object without error message.
	 */
	public OrderNotFoundException() {
		super();
	}
	
	/**
	 * This will create OrderNotFoundException object with error message.
	 */
	public OrderNotFoundException(String msg) {
		super(msg);
	}
	
}

