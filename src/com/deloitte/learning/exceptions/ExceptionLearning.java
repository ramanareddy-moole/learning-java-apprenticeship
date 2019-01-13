package com.deloitte.learning.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionLearning {
	// unexpected behaviour of the program
	// handle in a specific way
	// Object -> Throwable - > Exception / Error
	// Exception - CheckedException and UncheckedExceptions 
	
	public void method() {
		
	}
	
	public static void main(String[] args) {
		//InputStream fie = null;
//		try (InputStream fie = new FileInputStream("/some-text.csv")) {
//			
//			
//		} catch(FileNotFoundException fnte) {
//			
//		} finally {
//			System.out.println("finally");
//			System.gc();
//		}
		//}
		try {
			//
			// 
			//
			//
			//
			int i = 10;
			int j = 20;
			int k = i / j;
			System.out.println(k);
			
			int[] a = {1, 2, 3, 4, 5};
			
			System.out.println(a[-10]);
			
			String str = null;
			//if(str != null) {
				//str.length();
			//}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("divide by zero exception occured / NullPointer Exception occurred");
			System.out.println("Please check your numbers or objects");
			// System.exit(0);
		}
		System.out.println("After the catch clause");
	}
}
