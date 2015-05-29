package pset1.printers;

import pset1.Printer;


public class ConsolePrinter implements Printer {
	
	public String[] pyramid;
	
	public ConsolePrinter(String[] pyramid) {
		this.pyramid = pyramid;
	}
	
	public void print() {
		for(int i = 0; i < this.pyramid.length; i++) {
			System.out.println(pyramid[i]);
		}
	}

}
