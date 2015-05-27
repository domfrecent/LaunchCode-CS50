package pset1;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Mario {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		int pyramidHeight = -1;
		char printChoice = 'a';

		Scanner console = new Scanner(System.in);

		while(pyramidHeight < 0 || pyramidHeight > 23) { // Verify that pyramid height is within the specified bounds
			System.out.println("Input pyramid height as an integer between 0 and 23.");
			pyramidHeight = console.nextInt(); // Read in integer from user
		}
		while(printChoice != 'c' && printChoice != 't') { // Loop until a valid response has been given
			System.out.println("Would you like Mario to be printed to your console or to a text file? Enter c for console or t for text.");
			printChoice = console.next().charAt(0); // Read in integer from user
		}

		String[] stairs = new String[pyramidHeight];

		// Create Pyramid
		for(int i = 0; i < pyramidHeight; i++) {
			String tempLevel = "";
			for(int j = 0; j < pyramidHeight - i - 1; j++) {
				tempLevel += " ";
			}
			for(int k = 0; k < 2 + i; k++) {
				tempLevel += "#";
			}
			stairs[i] = tempLevel;
		}

		// Handle output
		if(printChoice == 'c') {
			System.out.println(); // Create space between user input and pyramid
			for(int i = 0; i < stairs.length; i++) {
				System.out.println(stairs[i]);
			}
		} else {
			System.out.println("What would you like to name the text file?");
			String filename = console.next();
			PrintWriter writer = new PrintWriter(filename + ".txt", "UTF-8");
			
			for(int i = 0; i < stairs.length; i++) {
				writer.println(stairs[i]);
			}
			writer.close();
		}
	}

}
