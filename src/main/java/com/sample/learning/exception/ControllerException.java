package com.sample.learning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException {
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> controllerException(UserNotFoundException e) {
		return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	}

}
