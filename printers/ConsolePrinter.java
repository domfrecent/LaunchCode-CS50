package pset1.printers;

import pset1.Printer;
import pset1.Pyramid;


public class ConsolePrinter implements Printer {
	
	private Pyramid pyramid;

	public ConsolePrinter(Pyramid pyramid) {
		this.pyramid = pyramid;
	}

	public void print() {
		System.out.print(this.pyramid.toString());
	}

}
