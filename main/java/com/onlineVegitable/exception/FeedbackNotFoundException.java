package com.onlineVegitable.exception;

public class FeedbackNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create ReceiptGenerationException object without error message.
	 */
	public FeedbackNotFoundException() {
		super();
	}
	
	/**
	 * This will create ReceiptGenerationException object with error message.
	 */
	public FeedbackNotFoundException(String msg) {
		super(msg);
	}

}
