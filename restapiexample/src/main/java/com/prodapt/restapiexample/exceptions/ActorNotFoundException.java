package com.prodapt.restapiexample.exceptions;

public class ActorNotFoundException extends Exception {

	private String message;

	public ActorNotFoundException(String message) {
		this.message = message;
	}

	public ActorNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public ActorNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ActorNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ActorNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
