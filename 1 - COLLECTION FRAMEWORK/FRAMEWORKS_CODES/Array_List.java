/*  ArrayList is a part of the collection framework
 and is present in java.util package. It provides us with dynamic arrays in Java.
  Though, it may be slower than standard arrays 
  but can be helpful in programs where lots of manipulation in the array is needed. 
  This class implements the List interface. */

  /* 1. Traverse  
 * 2. Add/Insert
 * 3. Delete/Remove
 * 4. Update
 * 5. Search
 * 6. Size/length
 *  */


import java.util.*;
//SANYAM 21CSU234 FS-III-A
public class Array_List{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        // FOR ADDING ELEMENTS IN ARRAYLIST 
        list.add("SANYAM");
        list.add("SAHIL");
        list.add("NARANG");
        list.add("ARNEJA");
        // FOR ADDING ELEMENTS AT PARTICULAR INDEX IN ARRAYLIST 
        list.add(0,"SN");
        System.out.println(list);
        // FOR REMOVING ELEMENTS FROM ARRAYLIST
        list.remove(0);
        System.out.println(list);
        // TO GET THE ELEMENT AT PARTICULAR INDEX
        System.out.println(list.get(0));
        // TO UPDATE THE UPDATE THE ELEMENT IN LIST
        list.set(0, "SANYAMMM");
        System.out.println(list);

        // FOR LOOP IN ARRAYLIST
        System.out.println("FOR LOOP");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        // FOR EACH LOOP IN ARRAYLIST
        System.out.println("FOR EACH LOOP");
        for(String str:list){
            System.out.println(str);
        }
        System.out.println();

        // TRAVERSAL THROUGH ITERATOR
        System.out.println("ITERATOR");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        System.out.println();

        // TRVERSAL IN REVERSE DIRECTION
        System.out.println("REVERSE ITERATOR");
        ListIterator<String> li=list.listIterator(list.size());
        while(li.hasPrevious()){
            System.out.println(li.previous()+" ");
        }
    }
}