class Totalearnings extends Thread{
    int total=0;

    public void run(){

        synchronized(this){
            for(int i=0;i<=10;i++){
                total=total+100;
            }
            this.notify();
        }
    }
}

class Methods_Synchronization{
    public static void main(String[] args) throws InterruptedException {
        Totalearnings te=new Totalearnings();
        te.start();

        synchronized(te){
            te.wait(); // WE CAN ADD TIME LIMIT ALSO
            System.out.println(te.total);
        }
    }
}