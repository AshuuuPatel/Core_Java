//

package JAVAAssignment;

public class task44 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread");
        } else {
            System.out.println("User thread");
        }
    }

    public static void main(String[] args) {
        task44 t1 = new task44();
        task44 t2 = new task44();

        t1.setDaemon(true);
        t1.start();

        t2.start();
    }
}
