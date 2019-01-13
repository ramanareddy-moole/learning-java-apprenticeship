package com.deloitte.learning.exceptions;

public class ExceptionThrow {
	static int x = 10; 
	public static void main(String[] args) {
		try {
			//ExceptionThrow et = new ExceptionThrow();			
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void method() throws ArithmeticException {
		//try {
			int i = 0;
			int j = 10;
			int k = j / i;
		//} catch(Exception e) {
		//	throw new ArithmeticException("dividing by zero exception occured");
		//}
	}
}
