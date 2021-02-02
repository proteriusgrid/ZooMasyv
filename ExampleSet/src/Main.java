import java.util.*;

/**
 * Created by GRID on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map =new HashMap<String, Integer>();
        map.put("key", 2);
        map.put("key1", 7);
        map.put("key2", 8);
        map.put("key3", 10);



//        map.remove("key1");


//         for(Integer k : map.values()){
//            System.out.println(k);
 //       }


        System.out.println(map.containsKey("key2 "));
    }
}