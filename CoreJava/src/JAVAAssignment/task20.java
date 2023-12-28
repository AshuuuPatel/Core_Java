//

package JAVAAssignment;

public class task20 {
    public static void main(String[] args) {
        printNumber(5);
        printNumber(3.14);
        printNumber(1234567890L);
        printNumber('A');
    }

    private static void printNumber(int num) {
        System.out.println("Integer: " + num);
    }

    private static void printNumber(double num) {
        System.out.println("Double: " + num);
    }

    private static void printNumber(long num) {
        System.out.println("Long: " + num);
    }

    private static void printNumber(char ch) {
        System.out.println("Character: " + ch);
    }
}
