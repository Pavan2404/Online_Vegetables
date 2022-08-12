package com.onlineVegitable.exception;

public class CardRejectedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create CardRejectedException object without error message.
	 */
	public CardRejectedException() {
		super();
	}
	
	/**
	 * This will create CardRejectedException object with error message.
	 */
	public CardRejectedException(String msg) {
		super(msg);
	}

}
