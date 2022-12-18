// LAB WORK - 6 SEP 22
// SANYAM 21CSU234 FS-III-A

import java.lang.*;

class mythread extends Thread{
    mythread(){
        System.out.println("Hello World");
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setPriority(6);
        System.out.println(t);
        System.out.println("Thread Name: "+t.getName());
        t.setName("MyThreadName");
        System.out.println("Thread Name: "+t.getName());
        try {
            t.sleep(0);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t.isAlive());
        System.out.println("After Thread");
        System.out.println("Creating new Thread");
        NewThread t1=new  NewThread("Thread-One");
        System.out.println(t1.isAlive());
        System.out.println(t1.getName());
        t1.start();
        t1.run();
        System.out.println(t1.getName());
        NewThread t2=new  NewThread("Thread-Two");
        t2.start();
        t2.run();
    }
}

class NewThread extends Thread{
    String Tname;
    NewThread(String ThreadName){
        this.Tname=ThreadName;
        this.setName(this.Tname);
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println(this.Tname);
                Thread.sleep(800);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class abc{
    public static void main(String[] args) {
             mythread m1=new mythread();
            }
        }