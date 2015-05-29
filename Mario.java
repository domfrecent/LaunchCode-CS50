package pset1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {

		int pyramidHeight = -1;
		char printChoice = 'a';
		Scanner console = new Scanner(System.in);
		Map<Character, Printer> printerMap = new HashMap<Character, Printer>(); // Instantiate map to connect user's choice with correct printer class

		while(pyramidHeight < 0 || pyramidHeight > 23) { // Verify that pyramid height is within the specified bounds
			System.out.println("Input pyramid height as an integer between 0 and 23.");
			pyramidHeight = console.nextInt(); // Read in integer from user
		}
		while(printChoice != 'c' && printChoice != 't') { // Loop until a valid response has been given
			System.out.println("Would you like Mario to be printed to your console or to a text file? Enter c for console or t for text.");
			printChoice = console.next().charAt(0); // Read in integer from user
		}

		String[] pyramid = new String[pyramidHeight];
		
		// Create Pyramid
		for(int i = 0; i < pyramidHeight; i++) {
			String tempLevel = "";
			for(int j = 0; j < pyramidHeight - i - 1; j++) {
				tempLevel += " ";
			}
			for(int k = 0; k < 2 + i; k++) {
				tempLevel += "#";
			}
			pyramid[i] = tempLevel;
		}

		printerMap.put('c',new ConsolePrinter(pyramid)); // Populate map instantiated above
		printerMap.put('t', new FilePrinter(pyramid, console));
		printerMap.get(printChoice).print();
	
	}

}
