package com.onlineVegitable.exception;

public class OutOfStockException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create OutOfStockException object without error message.
	 */
	public OutOfStockException() {
		super();
	}
	
	/**
	 * This will create OutOfStockException object with error message.
	 */
	public OutOfStockException(String msg) {
		super(msg);
	}
	
}
