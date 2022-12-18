import java.util.*;

public class linked{
	public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(0,1);
        System.out.println(l1);
        l1.add(2);
        System.out.println(l1);
        l1.addFirst(3);
        System.out.println(l1);
        l1.addLast(4);
        System.out.println(l1);
        int a=l1.getFirst();
        System.out.println(a);
        int b=l1.getFirst();
        System.out.println(b);
        ListIterator<Integer> it=l1.listIterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        it.add(5);
        System.out.println(l1);
        it.remove();
        System.out.println(l1);
    }

}
