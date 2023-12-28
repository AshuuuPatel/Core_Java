//

package JAVAAssignment;

public class task35 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            array[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        }
    }
}
