package pset1;

import java.util.HashMap;
import java.util.Map;

public class Pyramid {
	
	private char printChoice;
	private String[] pyramid;
	Map<Character, Printer> printerMap = new HashMap<Character, Printer>();
	
	public Pyramid(int height, char printChoice) {
		this.printChoice = printChoice;
		this.pyramid = new String[height];
		printerMap.put('c', PrinterFactory.consolePrinter(this)); 
		printerMap.put('t', PrinterFactory.filePrinter(this));
	}
	
	public void createPyramid() {
		for(int i = 0; i < this.pyramid.length; i++) {
			String tempLevel = "";
			for(int j = 0; j < this.pyramid.length - i - 1; j++) {
				tempLevel += " ";
			}
			for(int k = 0; k < 2 + i; k++) {
				tempLevel += "#";
			}
			this.pyramid[i] = tempLevel;
		}
	}
	
	public String[] getPyramid() {
		return this.pyramid;
	}
	
	public void print() {
		this.printerMap.get(this.printChoice).print(); // calls print() method in filePrinter or consolePrinter class
	}
	
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < pyramid.length; i++) {
			strBuilder.append(pyramid[i]);
			strBuilder.append(System.getProperty("line.separator"));
		}
		return strBuilder.toString();
	}
	
	
}
