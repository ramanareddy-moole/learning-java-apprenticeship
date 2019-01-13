package com.deloitte.learning.oop.principles;

public class EncapsulationTest {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setI(10);
		e.setCompany("Deloitte");
		
		Encapsulation e1 = new Encapsulation();
		e1.setI(20);
		e1.setCompany("Deloitte 2");
		
		System.out.println(e.getI() + "|" + e.getCompany());
		
		System.out.println(e1.getI() + "|" + e1.getCompany());
	}
}
