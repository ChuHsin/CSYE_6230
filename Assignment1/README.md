# Assignment 1
### 1. Describe the differences among short-term, medium-term, and long- term scheduling.
* Short-term: selects a process from processes in memory and ready to execute, and allocates the CPU to it.
* Medium-term: selects processes from the ready or blocked queue and removes them from memory, then reinstates them later to continue running.
* Long-term: determines which jobs are brought into the system for processing. 

### 2. Describe the actions taken by a kernel to context-switch between processes.
1. In response to a clock interrupt, the OS saves the PC and user stack pointer of the currently executing process, and transfers control to the kernel clock interrupt handler,
2. The clock interrupt handler saves the rest of the registers, as well as other machine state,
3. The OS invokes the scheduler to determine the next proces to execute,
4. The OS then retrieves the state of the next process from its process control block, and restores the registers. This restore operation takes the processor back to the state in which this process was previously interrupted, executing in user code with user mode privileges. 

