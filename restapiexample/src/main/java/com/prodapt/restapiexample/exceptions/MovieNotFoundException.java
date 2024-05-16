package com.prodapt.restapiexample.exceptions;

public class MovieNotFoundException extends Exception{
	
	private String message;
	
	public MovieNotFoundException(String message) {
		this.message = message;
	}

	public MovieNotFoundException() {
		
	}

	public MovieNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public MovieNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public MovieNotFoundException(Throwable cause) {
		super(cause);
		
	}
	
}
