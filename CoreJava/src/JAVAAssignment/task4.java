//• Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

package JAVAAssignment;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
           	int num = sc.nextInt();
           	sum += num;
       	}

		double average = sum / 5;

       	System.out.println("Sum: " + sum);
       	System.out.println("Average: " + average);	}
}
