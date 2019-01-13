package com.deloitte.learning.exceptions;

public class CustomException extends Exception {
	@Override
	public String getMessage() {
		return "my custom exception";
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("my custom traceback method");
	}
}
