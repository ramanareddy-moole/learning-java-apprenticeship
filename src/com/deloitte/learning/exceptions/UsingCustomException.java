package com.deloitte.learning.exceptions;

public class UsingCustomException {
	public static void main(String[] args) {
		try {
			System.out.println("My Custom Exception");
			throw new CustomException();
		} catch(CustomException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
