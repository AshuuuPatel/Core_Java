package oops.java;

import java.util.*;

public class Mathods_Functions {
	public static void printJava() {
		System.out.println("Hello Java");
	}
	public static void printName(String name) {
		System.out.println(name);
	}
	public static int IntAdd(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// METHODS
		printJava();
		printName("Ashish");
		System.out.println(IntAdd(5, 9));
	}
}
