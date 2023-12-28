//

package JAVAAssignment;

public class task43 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String args[]) {
        task43 t1 = new task43();
        t1.start();
        t1.start(); 
    }
}
