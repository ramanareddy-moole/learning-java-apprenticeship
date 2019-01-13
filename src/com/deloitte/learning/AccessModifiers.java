package com.deloitte.learning;

import com.deloitte.learning.access.modifiers.AcessModifiers;

public class AccessModifiers extends AcessModifiers {
	public void method() {
		// k = 50; // default
		i = 100;
		// j = 50; // private
		m = 1000;
	}
	
	public static void main(String[] args) {
		//AcessModifiers a = new AcessModifiers();
		AccessModifiers a1 = new AccessModifiers();
		//a.m = 100;
		//a.i = 100;
		a1.i = 200;
	}
}