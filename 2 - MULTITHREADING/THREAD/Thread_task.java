// SANYAM 21CSU234 FS-III-A

class Test extends Thread{
    // SINGLE TASK
    public void run(){
        System.out.println("THREAD IS RUNNING ");
    }
}
// CREATING MULTIPLE TASK
class MyThread1 extends Thread{
    public void run(){
        System.out.println("TASK 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("TASK 2");
    }
}

    public class Thread_task{
        public static void main(String[] args) {
            // SINGLE TASK FROM SINGLE THREAD
            Test t1=new Test(); // THREAD 1
            t1.start();

            // SINGLE TASK FROM MULTIPLE THREAD
            Test t2=new Test(); // THREAD 2
            t2.start();

            // MULTIPLE TASK FROM MULTIPLE THRED
            MyThread1 t3=new MyThread1();
            t3.start();
            MyThread2 t4=new MyThread2();
            t4.start();
        }
    }
    
