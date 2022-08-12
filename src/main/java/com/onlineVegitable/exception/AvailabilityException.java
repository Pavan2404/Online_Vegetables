package com.onlineVegitable.exception;

public class AvailabilityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create AvailabilityException object without error message.
	 */
	public AvailabilityException() {
		super();
	}
	
	/**
	 * This will create AvailabilityException object with error message.
	 */
	public AvailabilityException(String msg) {
		super(msg);
	}

}
