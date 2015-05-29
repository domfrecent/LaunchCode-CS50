package pset1;

import pset1.printers.ConsolePrinter;
import pset1.printers.FilePrinter;

public class PrinterFactory {
	
	public static Printer consolePrinter(Pyramid pyramid) {
		return new ConsolePrinter(pyramid);
	}
	
	public static Printer filePrinter(Pyramid pyramid) {
		return new FilePrinter(pyramid);
	}

}
