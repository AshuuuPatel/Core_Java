// Write a Java program that takes a year from user and print whether that year is a leap year or not. B19.

package JAVAAssignment;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);

	   	System.out.println("Enter a year:");
	   	int year = sc.nextInt();

	   	if (year % 4 == 0) {
	       	System.out.println(year + " is a leap year.");
	   	} else {
	       	System.out.println(year + " is not a leap year.");
	   	}
	        
// Write a program in Java to display the first 10 natural numbers using while loop.
	        
	   	int i = 1;
		System.out.println("First 10 Natural Numbers:");

		while (i <= 10) {
			System.out.print(i + " ");
		    i++;
	   	}
	}
}
