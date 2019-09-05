package code_uz._map_02_Lesson;

import java.util.HashMap;
import java.util.Map;

/**
 * MAP
 * _02_LESSON
 */
public class Main {

    public static void main(String[] args) {
        // HashMap

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(105, "D");

        Map<Integer, String> map = new HashMap<>(); //  16, 0.75
//        Map<Integer, String> map = new HashMap<>(20);
//        Map<Integer, String> map = new HashMap<>(20, 0.80f);
//        Map<Integer, String> map = new HashMap<>(map1);


        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");

        // System.out.println(map.put(104, "D"));

        // System.out.println(map);

        // System.out.println(map.put(104, "DD"));


        // map.putAll(map1);
//        System.out.println(map.get(107));
//        System.out.println(map.remove(107));
//        System.out.println(map.containsKey(107));
//        System.out.println(map.containsValue("AA"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());
//        map.clear();

//        System.out.println(map.values());
//        Collection<String> collection = map.values();

//        System.out.println(map.entrySet());

        //  Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

//        for (Map.Entry<Integer, String> entry : entrySet) {
//            System.out.println(" Key : " + entry.getKey() + "     Value:  " + entry.getValue());
//        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(" Key : " + entry.getKey() + "     Value:  " + entry.getValue());
        }

        System.out.println(map);


    }
}
