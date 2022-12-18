// LAB WORK 10 SEP 22 -- SATURDAY 

import java.util.Scanner;

class t1 extends Thread{
    int num;

    public void run(){
        int r=1;
        for(int i=1;i<=num;i++){
            r=r*i;
        }
        System.out.println("FACTORIAL IS : "+r);
    }
    t1(int num){
        this.num=num;
    }
}

class t2 extends Thread{
    int num;
    public void run(){
        int f = 2;
        while(num>1) {
            while(true) {
                if(num%f!=0) {
                    f = f+1;
                    break;
                }
                else {                    
                    num=num/f;
                }
                System.out.println("FACTOR IS : "+f);
            }
        }
    }
    t2(int num){
        this.num=num;
    }
}

class mainThred{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NO : ");
        int num=sc.nextInt();
        t1 one=new t1(num);
        t2 two=new t2(num);

        one.start();
        two.start();
        one.join();
        two.join();
    }
}