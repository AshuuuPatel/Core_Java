//

package JAVAAssignment;

public class task15 {
    public static void main(String[] args) {
        String str1 = "topsint.com";
        String str2 = "topsint.com";

        // Compare ignoring case
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + str1.equalsIgnoreCase(str2));

        str1 = "Topsint.com";
        str2 = "topsint.com";

        // Compare with case sensitivity
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + str1.equals(str2));
    }
}
