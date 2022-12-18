// CREATING THREAD BY IMPLEMENTING RUNNABLE INTERFACE
// SANYAM 21CSU234 FS-III-A

class MyThread implements Runnable{
    public void run(){
        System.out.println("IM A THREAD");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("IM A THREAD 2");
    }
}

public class Runnable_interface{
    public static void main(String[] args) {
        MyThread bullet1=new MyThread();
        Thread gun1=new Thread(bullet1);

        MyThread2 bullet2=new MyThread2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}