package com.deloitte.learning.oop.principles;

public class InheritanceChild extends Inheritance {
	private int i = 10;

	public void method() {
		System.out.println("in child class ");
		super.method();
		this.method();
		this.i = 20;
		System.out.println(this);
	}
	
//	public void method() {
//		
//	}

	public void method2() {
		int i = 10;
		this.i = 50;
		System.out.println(this);
		System.out.println(i + " | " + this.i);
		//this.method();
	}

	public static void main(String[] args) {
		// method();
		//		Inheritance i = new Inheritance();
		InheritanceChild ic = new InheritanceChild();
		//		i.method();
		ic.method2();
		
		char[] c = {'A', 'B'};
		
		
		int k = 200;
		int m = k + 50;
		
		if(k == m) {
			
		}
		String str = "Company" + "Deloitte";
		
		
	}
}
