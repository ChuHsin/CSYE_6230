Consider the following snapshot of a system:                                

        Allocation	Max	    Available
            ABCD	ABCD	ABCD
    P0	    0012	0012	1520
    P1	    1000	1750	 
    P2	    1354	2356	 
    P3	    0632	0652	 
    P4	    0014	0656

Answer the following questions using the banker’s algorithm:
a. What is the content of the matrix Need?
**Answer:**

        Need
        A B C D
    P0  0 0 0 0
    P1  0 7 5 0
    P2  1 0 0 2
    P3  0 0 2 0
    P4  0 6 4 2

b. Is the system in a safe state? 
**Answer:** 
Yes, it is safe.
P0 Needs are all zero, so put allocations back to available.
=> available = 1 5 2 0 + 0 0 1 2 = 1 5 3 2.
P3 need < available 
=> available = 1 5 3 2 + 0 6 3 2 = 1 11 6 4.
P4 => P2 => P1 => End.


c. If a request from thread P1 arrives for (0,4,2,0), can the request be
granted immediately?
**Answer:** 
Yes, after process request from P1, the available becomes (1,1,0,0);
Process P0, available becomes (1,1,1,2);
Process P2, available becomes (2,4,6,6);
Process P3, available becomes (2,10,9,8);
Process P1, then P4, finish.
P0 => P2 => P3 => P1 => P4