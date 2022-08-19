package com.onlineVegitable.exception;

public class BillGenerationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create BillGenerationException object without error message.
	 */
	public BillGenerationException() {
		super();
	}
	
	/**
	 * This will create BillGenerationException object with error message.
	 */
	public BillGenerationException(String msg) {
		super(msg);
	}

}
