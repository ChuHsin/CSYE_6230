import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {

    private int count;
    private int num;

    public MyRunnable(int no, int var) {
        count = var;
        num = no;
    }

    public void run() {
        while(count > 0) {
            count--;
            System.out.println("This is Thread " + currentThread().getName());
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
