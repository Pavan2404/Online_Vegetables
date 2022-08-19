package com.onlineVegitable.exception;

public class ItemNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create ItemNotFoundException object without error message.
	 */
	public ItemNotFoundException() {
		super();
	}
	
	/**
	 * This will create ItemNotFoundException object with error message.
	 */
	public ItemNotFoundException(String msg) {
		super(msg);
	}
}
