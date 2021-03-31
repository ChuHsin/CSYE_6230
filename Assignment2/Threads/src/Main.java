public class Main {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 6, d = 7;
        MyRunnable thread1 = new MyRunnable(1, a);
        MyRunnable thread2 = new MyRunnable(2, b);
        MyRunnable thread3 = new MyRunnable(3, c);
        MyRunnable thread4 = new MyRunnable(4, d);
        Thread t1 = new Thread(thread1, "T1");
        Thread t2 = new Thread(thread2, "T2");
        Thread t3 = new Thread(thread3, "T3");
        Thread t4 = new Thread(thread4, "T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

