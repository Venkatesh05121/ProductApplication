package com.example.demo.exeption;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.entity.Products;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoProductsFoundException.class)
	public ResponseEntity<ApiError> handleNoProductsFoundException(){
		
		ApiError error = new ApiError(400, "No Product Found",  new Date());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
