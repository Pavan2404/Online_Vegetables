package com.onlineVegitable.exception;

public class CustomerAccountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create CardRejectedException object without error message.
	 */
	public CustomerAccountException() {
		super();
	}
	
	/**
	 * This will create CardRejectedException object with error message.
	 */
	public CustomerAccountException(String msg) {
		super(msg);
	}

}
