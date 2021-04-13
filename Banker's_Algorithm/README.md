Consider the following snapshot of a system:                                

Allocation	Max	Available
        ABCD	ABCD	ABCD
P0	    0012	0012	1520
P1	    1000	1750	 
P2	    1354	2356	 
P3	    0632	0652	 
P4	    0014	0656

Answer the following questions using the banker’s algorithm:
a. What is the content of the matrix Need?
b. Is the system in a safe state?
c. If a request from thread P1 arrives for (0,4,2,0), can the request be
granted immediately?