import java.util.HashMap;
import java.util.Map;

public class HashMapdemo{
    public static void main(String[] args) {
        Map<Integer,String>map1=new HashMap<Integer,String>();
        map1.put(234, "SANYAM");
        map1.put(243, "ARPITA");
        map1.put(248, "milit");
        map1.put(376, "SAHIL");

        System.out.println(map1);
        System.out.println(map1.entrySet());
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}