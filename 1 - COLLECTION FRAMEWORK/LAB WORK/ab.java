// LAB WORK 30 AUG 22
import java.util.*;
import java.util.Collections;
class student implements Comparable<student>{
    String rn;
    String name;
    float cgpa;

    student(String r,String n,float c){
        this.rn=r;
        this.name=n;
        this.cgpa=c;
    }

    public int compareTo(student s){
        if(this.cgpa<s.cgpa){
            return -1;
        }
        else{
            return 1;
        }
    }
}
class createstudents{
    ArrayList<student>slist=new ArrayList<student>();
    Scanner sc=new Scanner(System.in);
    createstudents(){
        for(int i=0;i<2;i++){
            System.out.print("ENTER ROLL NO :");
            String r=sc.next();
            System.out.print("ENTER NAME NO :");
            String n=sc.next();
            System.out.print("ENTER CGPA ROLL NO :");
            float c=sc.nextFloat();
            slist.add(new student(r,n,c));
        }
        Collections.sort(slist);
    }
    void print(){
        for(student i: slist){
            System.out.println(i.rn);
            System.out.println(i.name);
            System.out.println(i.cgpa);
        }
    }
}
static class ab{
    public static void main(String[] args) {
        createstudents s=new createstudents();
        s.print();
    }
}
@Override
public int compareTo(student o) {
    // TODO Auto-generated method stub
    return 0;
}


