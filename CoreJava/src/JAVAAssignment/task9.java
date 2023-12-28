
// Write a Java program to print the ASCII value of a given character.

package JAVAAssignment;

import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);

		int ASCIIValue = ch;

		System.out.println("ASCII value of " + ch + " is: " + ASCIIValue);
	}

}
