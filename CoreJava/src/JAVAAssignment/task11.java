//

package JAVAAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task11 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(new Date(currentTimeMillis));

        System.out.println("System time: " + formattedTime);
    }
}
