package com.onlineVegitable.exception;

public class OverStockException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create OverStockException object without error message.
	 */
	public OverStockException() {
		super();
	}
	
	/**
	 * This will create OverStockException object with error message.
	 */
	public OverStockException(String msg) {
		super(msg);
	}

}
