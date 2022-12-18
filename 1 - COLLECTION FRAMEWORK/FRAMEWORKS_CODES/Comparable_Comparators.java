import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{

    int roll_no;
    String Name;

    public Student(int roll_no,String Name){
        this.roll_no=roll_no;
        this.Name=Name;
    }

    public String toString(){
         return "Student [ Roll No : "+roll_no+",Name : "+Name+"]";
    }

    public int getrollno(){
        return roll_no;
    }

    public void setrollno(int roll_no){
        this.roll_no=roll_no;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

// COMPARE INTERFACE METHODS compareTo
    public int  compareTo(Student obj){
        // -- FOR INCREASING ORDER
        if(this.roll_no>obj.roll_no)return 1;
        else if(this.roll_no<obj.roll_no)return -1;
        else return 0;

        /* -- FOR DECREASING ORDER -- 
        if(this.roll_no>obj.roll_no)return-1;
        else if(this.roll_no<obj.roll_no)return 1;
        else return 0; */

        // FOR SORTING IN TERMS OF ALPA IN CASE OF SAME ROLL NO 
        // return this.Name.compareTo(obj.Name);
    }
}

class SortByNameThenRollNo implements Comparator<Student>{
// COMPARE METHOD TO IMPLEMENT IN COMPARATOR CLASS.
    public int compare(Student o1,Student o2){
        if(o1.Name.equals(o2.Name)){
            return o1.roll_no-o2.roll_no;
        }
        else{
            return o1.Name.compareTo(o2.Name);
        }
    }
}

public class Comparable_Comparators{
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(234, "SANYAM"));
        list.add(new Student(243, "ARPITA"));
        list.add(new Student(248, "MILIT"));
        list.add(new Student(376, "SAHIL"));
        list.add(new Student(206, "TANYA"));

        Collections.sort(list,new SortByNameThenRollNo());

        list.forEach(System.out::println);
    }
}