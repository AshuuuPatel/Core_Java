//

package JAVAAssignment;

public class task37 {
    static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(args[0]);
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
