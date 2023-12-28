/* Write a Java program that reads a positive integer and count the number of digits the number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6 */

package JAVAAssignment;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);

	   	System.out.println("Enter a positive integer less than ten billion:");
	   	long num = sc.nextLong();

	   	System.out.println("Number of digits in the number: " + countDigit(num));
	}

	private static int countDigit(long num) {
	   	if (num <= 0 || num >= 10000000000L) {
	       	System.out.println("Please enter a positive integer less than ten billion.");
	       	System.exit(0);
	   	}

	   	int count = 0;
	   	while (num > 0) {
	       	count++;
	       	num /= 10;
	   	}
	   	return count;
	}
}
