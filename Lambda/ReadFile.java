package com.functional.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) {
 
				String fileName = "C:\\Java_Training\\data\\lines.txt";
		
				
			//read file into stream, try-with-resources
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

				stream.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
}
