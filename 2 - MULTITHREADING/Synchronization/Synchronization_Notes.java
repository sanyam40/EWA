// SANYAM 21CSU234 FS-III-A

/*
  1.Synchronization is the process by which we control the accessability
  of multiple threads to a particular shared resource.

  2.Problem which can occur without Synchronization.
  A - 1) DATA INCONSISTANCY
    - 2) THREAD INTERFERNCE

  3.ADVANTAGES OF Synchronization.
  A - 1) NO DATA INCONSISTANCY PROBLEM
    - 2) NO THREAD INTERFERNCE
    
  4.DISADVANTAGES OF Synchronization.
  A - 1) INCREASE THE WAITING TIME PERIOD OF THREADS.
    - 2) CREATE PERFORMANCE PROBLMES

  5.THERE ARE TWO TYPE OF Synchronization.
  1) MUTUAL EXCLUSIVE.
   -- IT CAN BE ACHIEVED BY 3 WAYS : 
   A) BY SynchronizED METHOD
   B) BY Synchronized Block.
   C) BY STATIC Synchronization

  2) CO-OPERATION(INTER THREAD COMMUNICATION)  
  -- IT CAN BE ACHIEVED BY FOLLOWING METHODS OF OBJECT CLASS :
  A) WAIT()
  B) NOTIFY()
  C) NOTIFYALL()

  6.STATIC synchronized IS USED IN CASE OF DIFFERENT CLASS.
    IT WILL LOCK ONE CLASS AT A TIME.

  7.wait() -- If any thread call the wait() method,it causes the current thread
    to release the lock and wait unitl another thread invokes the notify() or 
    notifyall() method for this object or a specified amount of time has elapsed.
    
  8.notify() -- This method is  used to wake up a single thread and releases the object lock.
  
  9.notifyall() -- This Method is used to wake up all th threads that are in waiting state.

  NOTE FOR 7,8,9 -- TO CALL THESE METHODS THREAD SHOULD OWN THE LOCK OF THAT OBJECT
  I.E. THE THREAD SHOULD BE INSIDE SYNCHRONIZED AREA.

  • If we do not use synchronization, and let two or more threads (Ryan and Monica) access a shared resource at the same time, it will lead to distorted results.

  • Using Synchronized Keyword
  • In order to synchronize the previous program, we must synchronize access to the shared display() method.
  • It will make it available to only one thread at a time [LOCKED].
  • This is done by using keyword synchronized with display() method


 */