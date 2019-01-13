package com.deloitte.learning.access.modifiers;

public class AcessModifiers {
	// public, private, protected and default
	// public - everywhere
	// private - with in class only
	// protected - within the class and package and in the sub class of the parent
	// default -
	
	// public -> protected -> default -> private
	public int m = 200;
	protected int i = 10;
	private int j = 20;
	int k = 10; // default variable
}

class SubClass extends AcessModifiers {
	public void method() {
		i = 20;
		// j = 30; // private variables - outside the class not allowed
		k = 50;
		m = 500;
		SubClass s = new SubClass();
		s.i = 200;
		AcessModifiers a = new AcessModifiers();
		a.i = 100;
	}
}

class NonSubClass {
	public void method() {
		AcessModifiers a = new AcessModifiers();
		a.i = 200;
	}
}