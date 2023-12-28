//

package JAVAAssignment;

public class task18 {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleaving strings are: ");

        findInterleavingStrings("", str1, str2);
    }

    private static void findInterleavingStrings(String result, String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println(result);
            return;
        }

        if (!str1.isEmpty()) {
            findInterleavingStrings(result + str1.charAt(0), str1.substring(1), str2);
        }

        if (!str2.isEmpty()) {
            findInterleavingStrings(result + str2.charAt(0), str1, str2.substring(1));
        }
    }
}
