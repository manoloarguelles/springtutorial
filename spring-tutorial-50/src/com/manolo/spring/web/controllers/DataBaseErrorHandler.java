package com.manolo.spring.web.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DataBaseErrorHandler {
	
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabbaseException(DataAccessException ex){
		
		return "error";
	}

}
