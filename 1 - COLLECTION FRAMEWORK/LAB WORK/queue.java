import java.util.*;

public class queue{
    public static void main(String[] args) {
        Queue<String> q= new LinkedList<>();
        q.add("N");
        q.add("C");
        q.add("U");
        System.out.println(q);
        Iterator itr = q.iterator();
        while(itr.hasNext()){
            //String a=itr.next();
            System.out.println(itr.next());
        }
    }
}