package com.cts;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler() {
		
		return "error";
		
	}
	
	
}
