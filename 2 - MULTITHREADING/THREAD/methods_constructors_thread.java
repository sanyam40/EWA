// THREAD CONSTRUCTORS , METHODS
// SANYAM 21CSU234 FS-III-A

/* -- CONSTRUCTORS OF THREAD --
         1)Thread()
         2)Thread(Runnable Target) 
         3)Thread(String Name)
         4)Thread(Runnable Targent,String Name)
         5)Thread(ThreadGrp Tg,Runnable Target)
         6)Thread(ThreadGrp Tg,Strign Name)
         7)Thread(ThreadGrp Tg,Runnable Target,String Name)
         8)Thread(ThreadGrp Tg,Runnable Target,String Name,long Stacksize) */
        
/* -- METHODS OF THREAD --
         BASIC -- 1) RUN() , START() , currentthread() , isalive()
         NAMING -- 2) getName() , setName(String Name)
         DAEMON --3) isDaemon() ,setDaemon(boolean b)
                  DAEMON THREADS ARE THOSE WHICH RUN IN BACKGROUND.
                  IT PROVIDE SERVICE TO THE THREAD.EX : GRABAGE COLLECTOR  
         PRIORITY --4) getPriority() , setpriority(int pv)
         PREVENTING EXECUTION --5) sleep(time) , yield() , join()
         INTERUPTING --6) interrpt() , isinterrupted() , interrupted() 
         INTER THREAD COMM -- 7) wait() , notify() , notifyall() ( IN OBJECT CLASS ) */ 

class Mythread extends Thread{
    public void run(){
        //SLEEP METHOD 
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("THREAD TASK");
        System.out.println(Thread.currentThread().getName());
    }
}

public class methods_constructors_thread{
    public static void main(String[] args) {
        // NAMING METHODS OF THREAD
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("SANYAM");
        System.out.println(Thread.currentThread().getName());

        // BASIC METHODS
        Mythread t1=new Mythread();
        t1.start();
        System.out.println(t1.isAlive());

        // DAEMON METHODS
        Mythread t2=new Mythread();
        t2.setDaemon(true);
        t2.start();
        System.out.println(t2.isDaemon());

        // PRIORITY METHODS ( BY DEFAULT MAIN THREAD PRIORITY IS 5 )
        // MIN : 1 , MAX : 10 , NORM : 5
        Mythread t3=new Mythread();
        System.out.println(t3.getPriority());
        t3.setPriority(10);
        System.out.println(t3.getPriority());
        
        // yield() method is a static method of Thread class 
        // and it can stop the currently executing thread and
        // will give a chance to other waiting threads of the same priority.
        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+i);
        }

        // join() method which allows one thread to wait until 
        // another thread completes its execution.
        try {
            t1.join();
        } catch (Exception e) {
           e.printStackTrace();
        }

        /* The interrupt() method of thread class is used 
           to interrupt the thread.If any thread is in sleeping or waiting state 
           (i.e. sleep() or wait() is invoked) then using the interrupt() method, 
           we can interrupt the thread execution by throwing InterruptedException. */
           Mythread t4=new Mythread();
           t4.start();
           t4.interrupt();
           System.out.println(t4.isInterrupted());
        }
    }
