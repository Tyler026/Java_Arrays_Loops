package com.arrays.loops.tyler;
import java.util.Scanner;

public class StudentHelper {
	@SuppressWarnings("resource")
	public static String ReadInputString() {
		// declare a new Scanner Object
		Scanner scan = new Scanner(System.in);
		
		// read in user input and store in the scanned variable
		String scanned = scan.nextLine();
		
		// return the result to wherever the "StudentHelper.ReadNextLine()" is called
		return scanned;
	}
}
