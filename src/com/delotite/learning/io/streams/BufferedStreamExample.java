package com.delotite.learning.io.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamExample {
	public static void main(String[] args) {
		BufferedInputStream fi = null;
		BufferedOutputStream fo = null;
		try {
			fi = new BufferedInputStream(new FileInputStream(new File("C:/Users/rmoole/workspace-mentorship/java-learning/src/CompareEdge_Validation_Error_Report_12072018.csv")));
			fo = new BufferedOutputStream(new FileOutputStream(new File("output.txt")));			
			//byte[] character = new byte[2048];
			int character;
			System.out.println("File Read inside main method :");
			while((character = fi.read()) != -1) {
				fo.write(character);
				System.out.println(character);
			}
			
			fi.close();
			fo.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
