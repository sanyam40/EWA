// LAB WORK 9 SEP 22
// SANYAM 21CSU234 FS-III-A

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String Name){
        threadName=Name;
        System.out.println("Creating"+threadName);
    }

    public void run(){
        System.out.println("Running"+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread :"+" "+i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread"+threadName+"interrupted");
        }
        System.out.println("Thread"+threadName+"existing");
    }

    public void start(){
        if(t==null){
            t=new Thread (this,threadName);
            t.start();
        }
    }
}

public class TestThread{
    public static void main(String[] args) {
        RunnableDemo r1=new RunnableDemo("Thread-1");
        r1.start();
        RunnableDemo r2=new RunnableDemo("Thread-2");
        r2.start();
    }
}