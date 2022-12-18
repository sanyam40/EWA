// SANYAM 21CSU234 FS-III-A

/*P8. The Player class is provided to you. It has two fields: a name String and a score integer.
Given a list of ‘n’ Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method. 
--Definition of Done:
1)Program should take input from the user, the first line will be the number of records
2)The next n lines will take records as input in the form of name & score
3)The output should display the entries in sorted order (conditions apply) */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Player implements Comparable<Player>{
    String Name;
    int score;

    public Player(String Name,int score){
        this.Name=Name;
        this.score=score;
    }

    public String toString(){
        return "PLAYER - [ NAME : "+Name+" SCORE : "+score+"]";
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public int getscore(){
        return score;
    }

    public void setscore(int score){
        this.score=score;
    }

    public int compareTo(Player obj){
        if(this.score>obj.score)return-1;
        else if(this.score<obj.score)return 1;
        else return 0;
    }
}

class Checker implements Comparator<Player>{
    public int compare(Player a,Player b){
        if(a.Name.equals(a.Name)){
            return a.score-b.score;
        }
        else{
            return a.Name.compareTo(b.Name);
        }
    }
}


public class canvas_p8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NO OF RECORDS : ");
        int no_of_records=sc.nextInt();
        System.out.println();

        ArrayList<Player>list=new ArrayList<>();

        for(int i=1;i<=no_of_records;i++){
            System.out.print("ENTER THE NAME OF "+i+" PERSON : ");
            String N=sc.next();
            System.out.print("ENTER THE SCORE OF "+i+" PERSON : ");
            int s=sc.nextInt();
            System.out.println();
            list.add(new Player(N, s));
        }

        list.forEach(System.out::println);

        System.out.println("LIST AFTER SORTING ");
        Collections.sort(list,new Checker());
        System.out.println();
        list.forEach(System.out::println);

        
    }
}