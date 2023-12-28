//

package JAVAAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class task45to55 {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");

        System.out.println("ArrayList Elements:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        // HashSet Example
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");

        System.out.println("\nHashSet Elements:");
        Iterator<String> iterator = colorsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

