//

package JAVAAssignment;

import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers (numerator denominator): ");
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }
}
