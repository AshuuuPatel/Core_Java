// Write a Java program to count the letters, spaces, numbers and other characters of an input string.

package JAVAAssignment;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);

	   	System.out.println("Enter a string:");
	   	String inputString = sc.nextLine();

	   	countCharacters(inputString);


	}

	private static void countCharacters(String str) {
	   	int letters = 0, spaces = 0, numbers = 0, others = 0;

	   	for (char ch : str.toCharArray()) {
	       	if (Character.isLetter(ch)) {
	           	letters++;
	       	} else if (Character.isDigit(ch)) {
	           	numbers++;
	       	} else if (Character.isWhitespace(ch)) {
	           	spaces++;
	       	} else {
	           	others++;
	       	}
	   	}

	   	System.out.println("Letters: " + letters);
	   	System.out.println("Spaces: " + spaces);
	   	System.out.println("Numbers: " + numbers);
	   	System.out.println("Other characters: " + others);
	}
}
