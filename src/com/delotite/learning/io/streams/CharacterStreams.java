package com.delotite.learning.io.streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams {
	// FileReader and FileWriter
	public static void main(String[] args) {
		try (FileReader fr = new FileReader(new File("C:/Users/rmoole/workspace-mentorship/java-learning/src/CompareEdge_Validation_Error_Report_12072018.csv"));
				FileWriter fw = new FileWriter(new File("output_character_streams.txt"))) {
			int character;
			while((character = fr.read()) != -1) {
				System.out.print(character + " ");
				fw.write(character);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
