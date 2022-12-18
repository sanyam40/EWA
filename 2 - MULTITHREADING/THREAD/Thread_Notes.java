/* THREAD NOTES 
 
-- WHEN WE HAVE TO PERFORM MULTITASKING WITHIN THE SAME PROCESS THEN WE USE THREADS.
   THREAD IS A PART OF A PROCESS.Single-threaded program can handle one task at any time.
   1) THREAD USE SHRED MEMORY LOCATION.
   2) FASTER CONTENT SWITCHING.
   3) A THREAD IS A LIGHTWEIGHT WHEREAS A PROCESS IS HEAVYWEIGHT.

-- Multithreading allows concurrent execution of two or more parts of a program for attaining maximum utilization of CPU.   

-- WITHOUT THREAD ONE FUNCTION WILL RUN AT A TIME.WITH-THREADING ALL THE FUNS.CAN BE EXCUTED AT A SAME TIME.

-- An instance of class Thread is just an object (like other objects in Java) that lives and dies on the heap.

-- A thread under execution is a process (a lightweight sub-process) that executes in its own call stack 
• In Java, there is one call stack per thread.

-- Internally, the JVM creates a thread (called main thread) that starts executing the code present inside the main method.

-- METHODS OF CREATING A THREAD :-
   1) BY EXTENDING THREAD CLASS.
   2)BY IMPLEMENTING RUNNABLE INTERFACE.

-- CONCURRENCY : IT IS A TASK OF RUNNING & MANAGING THE MULTIPLE COMPUTATION AT SAME TIME.
   PARALLELISM : IT IS A TASK OF RUNNING MULTIPLE COMPUTATIONS SIMULTANEOUSLY.
   
-- Life Cycle Of Thread : 
    1)New State
    2)Active State
    3)Waiting/Blocked State
    4)Timed Waiting State
    5)Terminated State

    1) New State : By default, a Thread will be in a new state,  in this state, code has not yet been run and the execution process is not yet initiated. 

    2) Active State : A Thread that is a new state by default gets transferred to Active state when it invokes the start() method, his Active state contains two sub-states namely:
    A -- Runnable State: In This State, The Thread is ready to run at any given time and it’s the job of the Thread Scheduler to provide the thread time for the runnable state preserved threads. A program that has obtained Multithreading shares slices of time intervals which are shared between threads hence, these threads run for some short span of time and wait in the runnable state to get their schedules slice of a time interval.
    B -- Running State: When The Thread Receives CPU allocated by Thread Scheduler, it transfers from the “Runnable” state to the “Running” state. and after the expiry of its given time slice session, it again moves back to the “Runnable” state and waits for its next time slice.
    
    3)Waiting/Blocked State : If a Thread is inactive but on a temporary time, then either it is at waiting or blocked state, for example, if there are two threads, T1 and T2 where T1 need to communicate to the camera and other thread T2 already using a camera to scan then T1 waits until T2 Thread completes its work, at this state T1 is parked in waiting for the state, and in another scenario, the user called two Threads T2 and T3 with the same functionality and both had same time slice given by Thread Scheduler then both Threads T1, T2 is in a blocked state. When there are multiple threads parked in Blocked/Waiting state Thread Scheduler clears Queue by rejecting unwanted Threads and allocating CPU on a priority basis. 
    
    4) Timed Waiting State :Sometimes the longer duration of waiting for threads causes starvation, if we take an example like there are two threads T1, T2 waiting for CPU and T1 is undergoing Critical Coding operation and if it does not exit CPU until its operation gets executed then T2 will be exposed to longer waiting with undetermined certainty, In order to avoid this starvation situation, we had Timed Waiting for the state to avoid that kind of scenario as in Timed Waiting, each thread has a time period for which sleep() method is invoked and after the time expires the Threads starts executing its task. 
    
    5) Terminated State: A thread will be in Terminated State, due to the below reasons: 
    A -- Termination is achieved by a Thread when it finishes its task Normally.
    B -- Sometimes Threads may be terminated due to unusual events like segmentation faults, exceptions…etc. and such kind of Termination can be called Abnormal Termination.
    C -- A terminated Thread means it is dead and no longer available.

-- CONSTRUCTORS OF THREAD --
         1)Thread()  -- EXTENDING THREAD CLASS 
         2)Thread(Runnable Target) -- IMPLEMENTING RUNNABLE INTERFACE
         3)Thread(String Name) -- EXTENDING THREAD CLASS
         4)Thread(Runnable Targent,String Name)
         5)Thread(ThreadGrp Tg,Runnable Target)
         6)Thread(ThreadGrp Tg,Strign Name)
         7)Thread(ThreadGrp Tg,Runnable Target,String Name)
         8)Thread(ThreadGrp Tg,Runnable Target,String Name,long Stacksize) 
        
-- METHODS OF THREAD --
         BASIC -- 1) RUN() , START() , currentthread() , isalive()
         NAMING -- 2) getName() , setName(String Name)
         DAEMON --3) isDaemon() ,setDaemon(boolean b)
                  DAEMON THREADS ARE THOSE WHICH RUN IN BACKGROUND.
                  IT PROVIDE SERVICE TO THE THREAD.EX : GRABAGE COLLECTOR  
         PRIORITY --4) getPriority() , setpriority(int pv)
         PREVENTING EXECUTION --5) sleep(time) , yield() , join()
         INTERUPTING --6) interrpt() , isinterrupted() , interrupted() 
         INTER THREAD COMM -- 7) wait() , notify() , notifyall() ( IN OBJECT CLASS )

-- 
1) setName() Give name to a thread
2 ) getName() Return thread’s name
3) getPriority() Return thread’s priority
4) isAlive() Checks if thread is still running or not
5) join() Wait for a thread to end
6) run()* Entry point for a thread 
7) sleep() Suspend thread for a specified time
8) start() Starts a thread [with new call stack by calling run() method] 

-- Thread Priorities :
   Threads always run with some priority, usually represented as a number between 1 and 10.

    • If a thread enters the Runnable state, and it has a higher priority than of the threads in the thread-pool then the lower priority thread will be taken back to 
    Runnable state and the higher priority thread will be chosen to run.
    •  In most cases, the running thread will of equal or greater priority than the highest priority threads in the pool.

    -- There are 3 constants that defines the priority of a thread, these are
• public static int MIN_PRIORITY
• public static int NORM_PRIORITY
• public static int MAX_PRIORITY

• Default priority of a thread is 5 (NORM_PRIORITY).
• Value of MIN_PRIORITY is 1 & the value of MAX_PRIORITY is 10.

-- Thread Concurrency  

Concurrency Issues : 
• Parallel Execution: Using multiple processing resources (CPUs, cores) at once to solve a problem faster.
• Example: A sorting algorithm that has several threads each sort part of the array
• Concurrent Execution: Multiple execution flows (e.g. threads) accessing a shared resource at the same time.
• Example: Many threads trying to make changes to the same data structure (a global list, map, etc.)
• Unlike parallelism, Concurrency is not always about running faster
• Even a single-CPU, single-core machine may want concurrency

*/