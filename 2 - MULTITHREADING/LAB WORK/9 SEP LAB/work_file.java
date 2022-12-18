// CANVAS P9,P10 Q1
//SANYAM 21CSU234 FS-III-A
// 9 SEP 22 
/* P9.Write a java program that implements a multi-thread application that has different threads. The first thread generates a random integer every 1 second and if the value is even, the second thread computes the square of the number and prints. If the value is odd, the thread will print the value of the number.
    Definition of Done:
-Create threads either by extending Thread class or by implementing Runnable interface
-Use random() for generating random integer numbers
-Put the thread logic inside run()
-Show the desired output */
 

import java.util.*;

class Square extends Thread{
    int x;
    Square(int n){
        x = n;
    }
    public void run(){
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr );
        
    }
}

class Number extends Thread{
    
    public void run(){
        Random random = new Random();
        for(int i =0; i<5; i++)
        {
            int randomInteger = random.nextInt(100);
            System.out.println("Random Integer generated : " + randomInteger);
            if(randomInteger%2==0){
                Square s = new Square(randomInteger);
                s.start();
            }
            else{
                System.out.println("VALUE OF NO IS ODD : "+randomInteger);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

public class work_file{
    public static void main(String[] args) {
        Number n1=new Number();
        n1.run();
    }
}