// EWA LAB WORK 16 SEP 22
// SANYAM 21CSU234

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
public class main_class{
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread a1=new Thread(t1);
        a1.start();
    }
}