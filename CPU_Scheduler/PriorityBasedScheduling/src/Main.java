import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        myThread[] myThreads = {
                new myThread(1,1,5),
                new myThread(2,2,7),
                new myThread(3,3,6),
                new myThread(4,4,8),
                new myThread(5,5,9),
                new myThread(6,4,10),
                new myThread(7, 3,7),
                new myThread(8,2,6),
                new myThread(9,1,5),
                new myThread(10,2,9),
        };
        PBS(myThreads);
    }

    public static void PBS(myThread[] myThreads) throws InterruptedException {
        PriorityQueue<myThread> runPQ = new PriorityQueue((Comparator<myThread>) (o1, o2) -> {
            if(o1.priority == o2.priority) return 0;
            if(o1.priority < o2.priority) return -1;
            return 1;
        });

        for(myThread myT : myThreads) {
            runPQ.offer(myT);
        }

        while(true) {
            if(runPQ.isEmpty()) {
                break;
            } else {
                myThread cur = runPQ.poll();
                int count = cur.length;
                while(count > 0) {
                    count--;
                    System.out.println("This is Thread " + cur.name + " with Priority " + cur.priority);
                    Thread.sleep(1000);
                }
            }
        }
        System.out.println("All Threads Finished.");
    }
}
