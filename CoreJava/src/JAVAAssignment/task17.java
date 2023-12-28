//

package JAVAAssignment;

public class task17 {
    public static void main(String[] args) {
        String mainString1 = "Red is favorite color.";
        String startString1 = "Red";
        String startString2 = "red";

        System.out.println(mainString1 + " starts with \"" + startString1 + "\"? " + mainString1.startsWith(startString1));
        System.out.println(mainString1 + " starts with \"" + startString2 + "\"? " + mainString1.startsWith(startString2));
    }
}
