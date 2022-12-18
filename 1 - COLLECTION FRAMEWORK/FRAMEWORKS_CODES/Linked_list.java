/*1. Insertion
2. Deletion
3. Traversal
4. Updation
5. Search*/

import java.util.*;

public class Linked_list{
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        // TO ADD ELEMENTS IN LL
        list.add("SANYAM");
        list.add("SAHIL");
        list.add("VIDIT");
        System.out.println(list);

        // TO ADD ELEMENT AT PARTICULAR POS IN LL
        list.add(0,"PIYUSH");
        System.out.println(list);

        // TO CHECK IF PARTICULAR ELEMENT IS PRESENT OR NOT
        System.out.println(list.contains("SANYAM"));
        
        // TO REMOVE ELEMENT FROM LL 
        System.out.println(list.remove(0));
        
        // TO GET THE ELEMENT OF PARCTICULAR INDEX
        System.out.println(list.get(1));
        
        //TO UPDATE ELEMENT
        list.set(0, "PIYUSH");
        System.out.println(list);
        
        //TO GET THE INDEX OF THE ELEMENT
        System.out.println(list.indexOf("VIDIT"));
        
        // TO UPDATE THE ELEMENT AT INDEX
        list.set(1, "abc");
        System.out.println(list);

        Iterator<String> itr = list.iterator();
		itr.next();
		itr.remove(); //--> do not call remove directly without calling next()
        System.out.println(list);
        
        ListIterator<String> listItr =  list.listIterator();
		listItr.add("Mongolia");
		listItr.add("Nepal");
        System.out.println(list);

        // OTHER FUNCTIONS ARE ALSO THERE SUCH AS
        // 1.ADDLAST 2.ADDFIRST 3.GETFIRST 4.GETLAST 5.REMOVEFIRST
    }
}