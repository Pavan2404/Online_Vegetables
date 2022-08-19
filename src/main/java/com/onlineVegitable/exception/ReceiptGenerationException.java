package com.onlineVegitable.exception;

public class ReceiptGenerationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create ReceiptGenerationException object without error message.
	 */
	public ReceiptGenerationException() {
		super();
	}
	
	/**
	 * This will create ReceiptGenerationException object with error message.
	 */
	public ReceiptGenerationException(String msg) {
		super(msg);
	}

}
