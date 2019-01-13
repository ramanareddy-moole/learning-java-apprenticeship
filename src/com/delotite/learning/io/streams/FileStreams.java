package com.delotite.learning.io.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreams {
	// there primarily 
	// byte streams
	// character streams - newly added streams
	// buffer streams
	
	// InputStream and OutputStream classes

	// FileInputStream - this will read 8 bits at a time
	// ObjectInputStream
	// DataInputStream - primary data types - int, float, array
	// BufferedInputStream - This wrapper class
	
	// FileOutputStream
	// ObjectOutputStream
	// DataOutputStream
	// BufferedOutputStream
	
	public static void main(String[] args) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(new File("C:/Users/rmoole/workspace-mentorship/java-learning/src/CompareEdge_Validation_Error_Report_12072018.csv"));
			fo = new FileOutputStream(new File("output.txt"));			
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
