package com.delotite.learning.io.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 * @author rmoole
 *
 */
public class BufferedReaderExample {
	public static void main(String[] args) {
		BufferedReader fi = null;
		BufferedWriter fo = null;
		try {
			fi = new BufferedReader(new FileReader(new File("C:/Users/rmoole/workspace-mentorship/java-learning/src/CompareEdge_Validation_Error_Report_12072018.csv")));
			fo = new BufferedWriter(new FileWriter(new File("output.txt")));			
			//byte[] character = new byte[2048];
			String line;
			System.out.println("File Read inside main method :");
			while((line = fi.readLine()) != null) {
				fo.write(line);
				System.out.println(line);
			}
			fi.close();
			fo.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
