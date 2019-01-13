package com.deloitte.learning;

public class Conditionals {
	public static void main(String[] args) {
		// if statement or if-else statement
		// for loop two varities
		// while loop
		// switch statement
		// ternary operator
		//int i = 9;
		// the paranthesis accepts true or false
		
		// & - bitwise operators
		// && - logical operator
		/*if(i > 10 && i < 15) {
			System.out.println("if statement");
		} else {
			System.out.println("else statement");
		}
		
		// || - this is logical or operator
		if(i > 10 || i < 15) {
			System.out.println("if statement with logical or");
		} else {
			System.out.println("else statement");
		}*/
		
		// definite iterations
		// initialization; condition; increment
//		for(int j = 0; j < 10; j++) {
//			System.out.println("iteration : " + j);
//		}
		
//		int j = 0;// indefinite iterations
//		while(j < 10) {
//			System.out.println("While loop iteration: " + j);
//			j++;
//		}
		
//		String value = "Wednesday";
//		
//		switch(value) {
//		case "Monday":
//			System.out.println("Monday Blues");
//			break;
//		case "Wednesday":
//			System.out.println("Nothing much. . . just work");
//			break;
//		case "Friday":
//			System.out.println("Yahooooooo!!");
//			break;
//		default:
//			System.out.println("Nothing");
//		}
		
//		int i = 12;
		
//		String str = i > 10 ? "greater than ten" : "Ten";
//		
//		System.out.println(i > 10 ? "greater than ten" : "Ten");
//		System.out.println(str);
		
		String[] companies = {"Deloitte", "Accenture", "EY", "PWC"};
		
		int[][] coordinates = {{1, 4, 6}, {2, 5}, {5, 6}};
		
		int[] primeNumbers = {2, 3, 5, 7, 11};
		
//		for(String company: companies) {
//			
//			System.out.println("Company Name is:" + company);
//		}
		
//		for(int prime: primeNumbers) {
//			System.out.println(prime);
//		}
		
		for(int i = 0; i < coordinates.length; i++) {
			for(int j = 0; j < coordinates[i].length; j++) {
				
			}
		}
		
		for(int[] arr: coordinates) {// Row
			for(int i: arr) { // Column
				System.out.println("Value: "+ i);
			}
		}
	}
}
