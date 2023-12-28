//

package JAVAAssignment;

public class task36 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner Arithmetic Exception: " + e.getMessage());
            }
            
            int[] array = new int[5];
            array[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Array Index Out Of Bounds Exception: " + e.getMessage());
        }
    }
}
