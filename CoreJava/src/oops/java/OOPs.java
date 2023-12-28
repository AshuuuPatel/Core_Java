package oops.java;

import java.util.*;

class Pen{
	String color;
	String type; // ballpen or gelpen
	
	public void write() {
		System.out.println("Done");
	}
	public void printPen() {
		System.out.println(this.color+" "+this.type);
	}
}

public class OOPs {
	public static void main(String[] args) {
		Pen pen1 =  new Pen();
		pen1.color = "Blue";
		pen1.type = "Gel";
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "Ball";
		
		pen1.printPen();
		pen2.printPen();
	}
}
