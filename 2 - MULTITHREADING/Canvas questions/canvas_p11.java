// SANYAM 21CSU234 FS-III-A

/* P11. Write a program called Hellojava that creates a thread (let's call it Thread 1). Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50.
Each thread should print "Hello from Thread <num>!", but you should structure your program such that the threads print their greetings in reverse order.
--Definition of Done:
-Create thread either by extending Thread class or implementing Runnable interface
-Inside run() perform the desired operations
-Show the desired output */

class MyThread implements Runnable{
    static int threadCount=1;
    public void run() {
        reverseHello();
         try {
             Thread.sleep(200);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
    public static void reverseHello() {
        if (threadCount<= 50) {
            threadCount++;
            Thread thread = new Thread(new MyThread());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }
}
public class canvas_p11{
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread a1=new Thread(t1);
        a1.start();
    }
}