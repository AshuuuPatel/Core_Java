//

package JAVAAssignment;

public class task14 {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";

        String result = concatenateStrings(str1, str2);

        System.out.println("Result String: " + result);
    }

    private static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}
