//

package JAVAAssignment;

public class task31 {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4: " + factorial(4));
        System.out.println("Factorial of 3: " + factorial(3));
        System.out.println("Factorial of 2: " + factorial(2));
        System.out.println("Factorial of 1: " + factorial(1));
        System.out.println("Factorial of 0: " + factorial(0));
    }
}