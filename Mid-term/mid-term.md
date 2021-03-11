### 1. Suppose that the following processes arrive for execution at the times indicated. Each process will run for the amount of time listed. In answering the questions, use nonpreemptive scheduling and base all decisions on the information you have at the time the decision must be made.

    Process             Arrival Time          Burst Time

     P1               0.0                          8

     P2               0.4                          4

     P3               1.0                          1

   1. What is the average turnaround time for these processes with the FCFS scheduling algorithm?
   **Answer:**
   First Come First Server;
   ((0.0 + 8) + (7.6 + 4) + (11 + 1)) / 3 = **10.53**


   2. What is the average turnaround time for these processes with the SJF scheduling algorithm?
   **Answer:**
   Shortest Job First:
   ((0 + 8) + (7 + 1) + (8.6 + 4)) / 3 = **9.53** 


   3.  The SJF algorithm is supposed to improve performance, but notice that we chose to run process P1 at time 0 because we did not know that two shorter processes would arrive soon. Compute what the average turnaround time will be if the CPU is left idle for the first 1 unit and then SJF scheduling is used. Remember that processes P1 and P2 are waiting during this idle time, so their waiting time may increase. This algorithm could be known as future-knowledge scheduling.
   **Answer:**
   It is because the CPU is left idle for the first 1 unit, so choose the process with the longest arrival time run first:
   ((0 + 1) + (1.6 + 4) + (6 + 8))/3 = **6.87**




---
### 2. Describe different Types of CPU short term Scheduling 
1. **First Come First Serve (FCFS)**
*  The process which requests the CPU gets the CPU allocation first, can be managed with a FIFO queue.

2. **Shortest Job First (SJF)**
* Process with the shortest execution time should be selected for execution next.
   
3. **Shortest Remaining Time**
* The process will be allocated tot he task that is closest tot its comletion. This method prevents a newer ready state process from holding the completion of an older process.
   
4. **Priority Scheduling**
* Scheduling processes based on priority, the scheduler selects the tasks to work as per the priority.
   
5. **Round Robin Scheduling**
*  Time slices are assigned to each process in equal protions and in circular order, handling all processes without priority.

---

### 3. Describe different Metrics for finding which scheduling is better.
* CPU Utilization: percentage of time CPU is busy.
* Throughput: number of processes that are being completed
* Turnaround time: sum of period spend waiting to get in memory, waiting in ready queue, execution and I/O.
* Waiting Time: Time process spends in ready queue.
* Response Time: First time a response is produced.
* 
