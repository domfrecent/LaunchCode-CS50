package pset1.printers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import pset1.Printer;

public class FilePrinter implements Printer {

	public String[] pyramid;
	public PrintWriter writer;
	public Scanner console;

	public FilePrinter(String[] pyramid, Scanner console) {
		this.pyramid = pyramid;
		this.writer = null;
		this.console = console;
	}

	public void print() {
		System.out.println("What would you like to name the text file?");
		String filename = console.next();
		try {
			this.writer = new PrintWriter(filename + ".txt");
			for(int i = 0; i < pyramid.length; i++) {
				this.writer.println(pyramid[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error in finding file");
		} finally {
			writer.close();
		}
		
//		System.out.println("Exited Try Catch statement");
//		for(int i = 0; i < this.pyramid.length; i++) {
//			this.writer.println(pyramid[i]);
//		}
//		System.out.println("Exited for loop");
	}

}
