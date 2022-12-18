// EWA LAB WORK 13 SEP 22
// SANYAM 21CSU234

class ABC{
    int pqty;

    ABC(int i){
        this.pqty=i;
    }
    void set(int i){
        this.pqty=i;
    }
    void get(){
        System.out.println("CURRENT QUANTITY IS : "+pqty);
    } 
}

class W1 extends Thread{
    ABC t;
    W1(ABC a){
        this.t=a;
        start();
    }

    public void run(){
        try{
            Thread.sleep(50);
        }
        catch(InterruptedException e){
            System.out.println("EXCEPTION ");

        }
        t.get();
        t.set(100);
        t.get();
        
    }
}
class W2 extends Thread{
    ABC t;
    W2(ABC b){
        this.t=b;
        start();
    }

    public void run(){
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("EXCEPTION ");

        }
        t.get();
        t.set(200);
        t.get();
    }
}

class MainThread{
    public static void main(String[] args) {
        ABC obj=new ABC(50);
        W1 t1=new W1(obj);
        W2 t2=new W2(obj);
    }
}