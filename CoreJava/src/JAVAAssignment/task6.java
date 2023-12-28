// Write a program in Java to make such a pattern like right angle triangle with number increased by 1.

package JAVAAssignment;

public class task6 {
	public static void main(String[] args) {
	   	int size = 5;
	   	int n = 1;

	   	System.out.println("Pattern with Increased Numbers:");

	   	for (int i = 1; i < size; i++) {
	       	for (int j = 1; j <= i; j++) {
	           	System.out.print(n);
	           	n++;
	       	}
	       	System.out.println();
	   	}
	}
}
