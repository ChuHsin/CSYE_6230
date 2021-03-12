import java.util.Comparator;
import java.util.PriorityQueue;

// Spawn 5 Threads they will sleep for random times and generate random values
// between 1 and 10 and add them to the Priority queue


// Start a new Thread which will be the SJF thread
// This thread will remove the shortest job and get the number
// Sleep for that many seconds
// If there is time remaining ( 3sec is time slice)
// It will add the remaining time in the PQ

// Bonus if you are able to calculate the
// Turnaround time
// wait time
// response time


public class Main {
    public static void main(String[] args) {
        Process proc[] = {
                new Process(1, 6, 1),
                new Process(2, 8, 1),
                new Process(3, 7, 2),
                new Process(4, 3, 7),
                new Process(5, 9, 3),
        };

        SJF(proc);

        System.out.println("Test Finished~");

        System.out.println("Processes " +
                " Burst time " +
                " Waiting time " +
                " Turn around time" + " Response time");

        for (int i = 0; i < proc.length; i++) {

            System.out.println(" " + proc[i].id + "\t\t"
                    + proc[i].bt + "\t\t " + proc[i].wt
                    + "\t\t" + proc[i].tat + "\t\t" + proc[i].rest);
        }

    }




    public static void SJF(Process[] processes) {
        int time = 0; // init time

        // define runnable priority queue
        PriorityQueue<Process> runPQ = new PriorityQueue((Comparator<Process>) (o1, o2) -> {
            if(o1.rt == o2.rt) return 0;
            if(o1.rt < o2.rt) return -1;
            return 1;
        });

        // define waiting priority queue
        PriorityQueue<Process> waitPQ = new PriorityQueue((Comparator<Process>) (o1, o2) -> {
            if(o1.at == o2.at) return 0;
            if(o1.at < o2.at) return -1;
            return 1;
        });

        // offer processes into waiting poll
        for(Process process : processes) {
            waitPQ.offer(process);
        }

        // start CPU
        while(time == 0 || !runPQ.isEmpty() || !waitPQ.isEmpty()) {

            int timeSlice = 3; // init time slice with 3 second

            // move threads into the running poll
            while(!waitPQ.isEmpty() && waitPQ.peek().at <= time) {
                Process newProcess = waitPQ.poll();
                runPQ.offer(newProcess);
                System.out.println("Time: " + time + ": " + "Process Id:" + newProcess.id + " entered the poll.");
            }

            // when no runnable thread, waiting
            if(runPQ.isEmpty() && !waitPQ.isEmpty()) {
                time++;
                continue;
            }

            Process cur = runPQ.poll();
            System.out.println("Time: " + time + ": " + "Process Id:" + cur.id + " start running.");
            if(cur.rest == -1) {
                cur.rest = time - cur.at;
            }

            if(cur.rt <= timeSlice) {
                timeSlice = cur.rt;
            }

            time += timeSlice;

            if(cur.rt - timeSlice > 0) {
                cur.rt -= timeSlice;
                runPQ.offer(cur);
                System.out.println("Time: " + time + ": " + "Process Id:" + cur.id + " return to pool with " + cur.rt + " second remained.");
            } else {
                System.out.println("Time: " + time + ": " + "Process Id:" + cur.id + " is finished.");

                cur.tat = time - cur.at;
                cur.wt = cur.tat - cur.bt;
                if(cur.wt <= 0) cur.wt = 0;

            }


        }

        System.out.println("Time: " + time + ": " + "All Jobs Finished!");
    }
}


