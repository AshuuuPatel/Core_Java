//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

package JAVAAssignment;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);

	   	System.out.println("Enter a single character:");
	   	char userInput = sc.next().charAt(0);

	   	if (Character.isLetter(userInput)) {
	       	userInput = Character.toLowerCase(userInput);

	       	if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') 
	       	{
	           	System.out.println("Vowel");
	       	} 
	       	else {
	           	System.out.println("Consonant");
	       	}
	   	} 
	   	else {
	       	System.out.println("Error: Please enter a valid letter.");
	   	}
	}
}
