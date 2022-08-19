package com.onlineVegitable.exception;

public class OfferInvalidException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create OfferInvalidException object without error message.
	 */
	public OfferInvalidException() {
		super();
	}
	
	/**
	 * This will create OfferInvalidException object with error message.
	 */
	public OfferInvalidException(String msg) {
		super(msg);
	}

}
