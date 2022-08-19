package com.onlineVegitable.exception;

public class AccountNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create UserNotFoundException object without error message.
	 */
	public AccountNotFoundException() {
		super();
	}
	
	/**
	 * This will create ProjectNotFoundException object with error message.
	 */
	public AccountNotFoundException(String msg) {
		super(msg);
	}
	
}
