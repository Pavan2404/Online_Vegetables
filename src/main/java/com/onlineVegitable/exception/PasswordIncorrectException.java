package com.onlineVegitable.exception;

public class PasswordIncorrectException extends Exception {
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	/**
	 * This will create PasswordIncorrectException object without error message.
	 */
	public PasswordIncorrectException() {
		super();
	}
	
	/**
	 * This will create PasswordIncorrectException object without error message.
	 */
	public PasswordIncorrectException(String msg) {
		super(msg);
	}
}
