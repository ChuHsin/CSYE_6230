public class Process {
    int id;
    int bt; // Burst Time
    int at; // Arrival Time
    int wt; // Waiting Time
    int rt; // Remaining Time
    int tat; // Turnaround Time
    int rest; // Response Time

    public Process(int id, int bt, int at) {
        this.id = id;
        this.bt = bt;
        this.at = at;
        this.rt = bt;
        this.wt = 0;
        this.rest = -1;
        this.tat = 0;
    }
}
