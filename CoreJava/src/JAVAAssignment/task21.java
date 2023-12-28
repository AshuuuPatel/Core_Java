//

package JAVAAssignment;

public class task21 {
    public static void main(String[] args) {
        printData(5, 'A');
        printData('B', 10);
    }

    private static void printData(int n, char c) {
        System.out.println("Print method with (int n, char c): " + n + ", " + c);
    }

    private static void printData(char c, int n) {
        System.out.println("Print method with (char c, int n): " + c + ", " + n);
    }
}
