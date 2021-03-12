public class Main {
    public static void main(String[] args) {

    }
}

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

// 创造 5 个 线程， sleep for random times (arrival time)
// generate random values between 1 - 10 add them to the priority queue, SJF min heap
// 开启一个新线程，执行 SJF
// 移出 最短的 job get the number 然后睡那么长时间，执行 3 秒，三秒没执行完会把剩余的时间放回 PQ