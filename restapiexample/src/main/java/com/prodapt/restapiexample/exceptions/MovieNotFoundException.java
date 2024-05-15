package com.prodapt.restapiexample.exceptions;

public class MovieNotFoundException extends Exception{
	
	private String message;
	
	public MovieNotFoundException(String message) {
		this.message = message;
	}

	public MovieNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MovieNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
