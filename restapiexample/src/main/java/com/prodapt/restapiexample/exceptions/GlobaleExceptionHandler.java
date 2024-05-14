package com.prodapt.restapiexample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobaleExceptionHandler {

	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<String> handlePersonNotFoundException() {
		return new ResponseEntity<String>("Person not found ",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AddressNotFoundException.class)
	public ResponseEntity<String> handleAdressNotFoundException() {
		return new ResponseEntity<String>("Address not found ",HttpStatus.NOT_FOUND);
	}
}
