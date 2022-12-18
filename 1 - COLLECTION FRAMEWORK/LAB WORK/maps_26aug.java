import java.util.HashMap;
import java.util.Map;

public class maps_26aug{
    public static void main(String[] args) {
        Map<String,Integer>score=new HashMap<>();
        score.put("SANYAM",234);
        score.put("milit", 248);

        for(String key : score.keySet()){
            Integer value=score.get(key);
            System.out.println(value);
        }
    }
}