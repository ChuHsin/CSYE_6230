# Assignment 2
* ### Provide two programming examples in which multithreading provides better performance than a single-threaded solution.
1. A parallelized application like matrix multiplication, the multiplication for diffrent rows and columns can be processed at same time by different threads.
2. Web server, the server which uses multithreading can handle different requests from several clients at the same time.
* ### Provide two examples where multithreading does not provide better performance than single threaded. 
1. Calculator Application, which only need to process a single computing at a time, it need to use max ability to process one thread at a time, multithreading cannot provide better performance.
2. A constant time complexity program, the time cost by creating new thread is greater than process the task in a single thread.


* ### Which of the following components of program state are shared across threads in a multithreaded process?

  * Register values

  * Heap memory

  * Global variables

  * Stack memory

#### Ans: 
The Heap Memory and Global Variables are shared across threads.

* ### Write a program to pass parameters to a thread. in C# or Java. Your program should create 4 threads and each thread would be passed an integer value. The Program should loop and print the Thread name and loop number of times the integer is passed and in between your thread code  will sleep for 200 milliseconds. Your main program will wait for all the threads to finish and then exit. 