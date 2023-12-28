//• Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5


package JAVAAssignment;

import java.util.Scanner;

public class task10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive integer : ");
	        int n = scanner.nextInt();

	        computeValue(n);

	        scanner.close();
	    }

	    private static void computeValue(int n) {
	        int nn = n * 11;
	        int nnn = n * 111;

	        int result = n + nn + nnn;

	        System.out.println("Result: " + result);
	    }
}
