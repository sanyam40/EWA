class MyThread extends Thread{
    String msg;

    public MyThread(String msg){
        this.msg=msg;
    }
    public void run(){
        String name=Thread.currentThread().getName();
        synchronized(msg){
            try {
                System.out.println(name);
                msg.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
        System.out.println(name+" processed: "+msg);
    }
}

public class main_class{
    public static void main(String[] args) {
        MyThread t2=new MyThread("HELLO");
        t2.start();
    }
}