package pset1.printers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import pset1.Printer;
import pset1.Pyramid;

public class FilePrinter implements Printer {

	private PrintWriter writer;
	private Scanner console;
	private Pyramid pyramid;

	public FilePrinter(Pyramid pyramid) {
		this.pyramid = pyramid;
		this.writer = null;
		this.console = new Scanner(System.in);
	}

	public void print() {
		System.out.println("What would you like to name the text file?");
		String filename = console.next();
		try {
			this.writer = new PrintWriter(filename + ".txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("Error in finding file");
		}
		this.writer.print(this.pyramid.toString());
		writer.close();
	}

}
