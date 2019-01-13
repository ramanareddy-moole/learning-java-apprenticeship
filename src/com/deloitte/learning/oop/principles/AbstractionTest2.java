package com.deloitte.learning.oop.principles;

public class AbstractionTest2 extends AbstractClass {

	@Override
	public void method() {
		
	}

	@Override
	public void color() {
		
	}

	@Override
	public void wheels() {
		
	}
	
	@Override
	public void method1() {
		System.out.println("Another implementation of my method in abstract");
	}
	
	public static void main(String[] args) {
		AbstractionTest2 ab2 = new AbstractionTest2();
		ab2.method1();
	}

}
