// SANYAM 21CSU234 FS-III-A

/* P1.Write a program that reads a file and displays the words of that file as a list.
-First, display all words. !
-Then display them in reverse order. !
-Then display them with all plurals (ending with "s"). !
-Then display them with all plural words removed and the size of the updated list. */

import java.util.*;
import java.io.*;

public class canvas_q1{
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String>words=new ArrayList<>();
        File file=new File("dummy.txt");
        Scanner sc=new Scanner(file);

        while(sc.hasNext()){
            String str=sc.next();
            words.add(str);
        }

        System.out.println("----ALL WORDS----");
        System.out.println(words);

        System.out.println("SIZE OF THE LIST : "+words.size());

        System.out.println("----PRINTING IN REVERSE ORDER----");
        ListIterator<String>itr=words.listIterator(words.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();

        System.out.println("----LIST WITH ALL THE PLURALS----");
        while(itr.hasNext()){
            String plural=itr.next();
            if(plural.endsWith("s")){
                System.out.println(plural);
            }
        }
        System.out.println();

        System.out.println("----LIST AFTER REMOVING PLURALS----");
        while(itr.hasPrevious()){
            String plural=itr.previous();
            if(plural.endsWith("s")){
                System.out.println(plural);
                itr.remove();
            }
        }
        sc.close();    
    }
}