package com.onlineVegitable.exception;

public class LimitedSupplyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * This will create LimitedSupplyException object without error message.
	 */
	public LimitedSupplyException() {
		super();
	}
	
	/**
	 * This will create LimitedSupplyException object with error message.
	 */
	public LimitedSupplyException(String msg) {
		super(msg);
	}

}
