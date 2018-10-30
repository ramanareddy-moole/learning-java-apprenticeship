package com.deloitte.learning;

public class LocalInstanceVariables {
	/*int i; // instance variable or class variables or global variables
	boolean b;
	byte by;
	String str;*/
	
	public static void main(String[] args) {
		LocalInstanceVariables l = new LocalInstanceVariables();
		LocalInstanceVariables l2 = new LocalInstanceVariables();
		//if()
		// arguments and parameters
		//l.compareVariables(10, 9); // arguments
		//l.compareVariables(87, 87);
		
		String s1 = new String("Deloitte");
		String s2 = new String("Deloitte");
		l.compareVariables(s1, s2);
//		l.method2();
	}
	
	
//	public void method() {
//		String s = ""; // local variable
//		i = 10;
//	}
//	
//	public void method2() {
//		String s1 = "Deloitte";
//		System.out.println(i);
//		i = 15;
//		System.out.println(i);
//		System.out.println(b);
//		System.out.println(s1);
//	}
	// primitive types are int, byte, short, double, float, char
	// non-primitive types such as String, class based objects 
	public void compareVariables(int i, int j) { // parameters
		if(i == j) {
			System.out.println("i is equal to j");
		} else {
			System.out.println("i is not equal to j");
		}
	}
	
	public void compareVariables(String s1, String s2) {
		if(s1 == s2) {
			System.out.println("both strings are the same");
		} else {
			System.out.println("both are different");
		}
		
		if(s1.equals(s2)) {
			System.out.println("both strings are identical");
		} else {
			System.out.println("both the strings are different");
		}
	}
}
