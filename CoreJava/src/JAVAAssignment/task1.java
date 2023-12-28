// Write a Java program to Take three numbers from the user and print the greatest number.

package JAVAAssignment;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);

	   	System.out.println("Enter three numbers:");
	   	int a = sc.nextInt();
	   	int b = sc.nextInt();
	   	int c = sc.nextInt();
	        
	   	System.out.println("The greatest number is: " + Math.max(Math.max(a, b), c));
	}
}
