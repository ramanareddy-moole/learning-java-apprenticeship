package com.deloitte.learning.oop.principles;

public abstract class AbstractClass {
	// This is abstract class
	// but to an abstract no object is created
	// you can just define method and also provide implementation
	public abstract void method();
	
	public void method1() {
		System.out.println("inside method1");
	}
	
	private void method2() {
		// private methods are possible to declare if an implementation is provided
	}
	
	// private abstract void method3(); - this is not allowed
	
	public abstract void color();
	
	public abstract void wheels();
	
	public static void main(String[] args) {
		// AbstractClass ab = new AbstractClass();
		// method2();
	}
}
