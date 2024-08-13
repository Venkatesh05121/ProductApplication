package com.example.demo.exeption;

public class NoProductsFoundException extends RuntimeException {

	public NoProductsFoundException(String msg) {
		super(msg);
	}
}
