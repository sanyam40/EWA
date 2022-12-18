/*You are given a list of student information: Id, FirstName, and CGPA. Your task is to 
rearrange them according to their CGPA in decreasing order. If two student have the same 
CGPA, then arrange them according to their first name in alphabetical order. If those two 
students  also  have  the  same  first  name,  then  order  them  according  to  their  Id.  No  two 
students should have the same Id. Use Comparators to sort the list. */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Student implements Comparable<Student>{
    int id;
    String First_Name;
    int cgpa;

    public Student(int id,String First_Name,int cgpa){
        this.id=id;
        this.First_Name=First_Name;
        this.cgpa=cgpa;
    }
    /*public void setid(int id){
        this.id=id;
    }
    public void setFirst_Name(String First_Name){
        this.First_Name=First_Name;
    }
    public void setcgpa(int cgpa){
        this.cgpa=cgpa;
    }
    public int getid(){
        return id;
    }
    public String getFirst_Name(){
        return First_Name;
    }
    public int cgpa(){
        return cgpa;
    }*/

    public String toString(){
        return "Stduent - NAME : "+First_Name+"ID : "+id+"CGPA : "+cgpa;
    }

    public int compareTo(Student obj){
        if(this.cgpa<obj.cgpa)return -1;
        else if(this.cgpa>obj.cgpa)return 1;
        else return 0;
    }
}

class Checker implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        if(o1.First_Name.equals(o2.First_Name)){
            return o1.cgpa-o2.cgpa;
        }
        else return o1.First_Name.compareTo(o2.First_Name);
    }
}

public class Comparable_Comparators_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<Student>();
        for(int i=0;i<2;i++){
            System.out.print("ENTER NAME : ");
            String n=sc.next();
            System.out.print("ENTER ID : ");
            int id=sc.nextInt();
            System.out.print("ENTER CGPA : ");
            int cgpa=sc.nextInt();
            System.out.println();
            list.add(new Student(id,n,cgpa));
        }
        list.forEach(System.out::println);
        System.out.println("AFTER SORTING");
        Collections.sort(list,new Checker());
        list.forEach(System.out::println);
    }
}