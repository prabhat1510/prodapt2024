package com.prodapt.restapiexample.exceptions;

public class ActorNotFoundException extends Exception {

	private String message;

	public ActorNotFoundException(String message) {
		this.message = message;
	}

	public ActorNotFoundException() {
		
	}

	public ActorNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ActorNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ActorNotFoundException(Throwable cause) {
		super(cause);
		
	}

}
