package com.prodapt.springsecurityexample.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public UserNotFoundException() {

	}

	public UserNotFoundException(String message) {
		this.message = message;
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public UserNotFoundException(Throwable cause) {
		super(cause);

	}

}
