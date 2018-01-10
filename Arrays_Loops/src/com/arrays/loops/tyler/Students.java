package com.arrays.loops.tyler;


public class Students {

	public static void main(String[] args) {
		// declaring a new strings to be stored in the array
		String[] students = new String[5];
		students[0] = "Tyler";
		students[1] = "James";
		students[2] = "Fuqua";
		students[3] = "Matt";
		students[4] = "Alex";
		
		for (int index = 0; index < students.length; index++) {
			System.out.println(students[index]);
		}
		
	}

}