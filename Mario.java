package pset1;

import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		int pyramidHeight = -1;
		while(pyramidHeight < 0 || pyramidHeight > 23) { // Verify that pyramid height is within the specified bounds
			System.out.println("Input pyramid height as an integer between 0 and 23.");
			pyramidHeight = console.nextInt(); // Read in integer from user
		}
		
		char printChoice = 'a';
		while(printChoice != 'c' && printChoice != 't') { // Loop until a valid response has been given
			System.out.println("Would you like Mario to be printed to your console or to a text file? Enter c for console or t for text.");
			printChoice = console.next().charAt(0); // Read in char from user
		}
		
		Pyramid marioPyramid = new Pyramid(pyramidHeight, printChoice);
		marioPyramid.createPyramid();
		marioPyramid.print();
	}

}
