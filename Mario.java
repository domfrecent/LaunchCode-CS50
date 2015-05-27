package pset1;

import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {

		int pyramidHeight = -1;

		Scanner console = new Scanner(System.in);

		while( pyramidHeight < 0 || pyramidHeight > 23 ) { // Verify that pyramid height is within the specified bounds
			System.out.println("Input pyramid height as an integer between 0 and 23.");
			pyramidHeight = console.nextInt(); // Read in integer from user
		}

		System.out.println(); 

		// Create Pyramid
		for(int i = 0; i < pyramidHeight; i++) {
			for(int j = 0; j < pyramidHeight - i - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 + i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
