package code_uz._map_010_Lesson;

import java.util.*;

/**
 * MAP
 * _10_LESSON
 */
public class Main {

    public static void main(String[] args) {
        // Hashtable

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "GG");


        Map<Integer, String> map = new Hashtable<>();
//        Map<Integer, String> map = new Hashtable<>(10);
//        Map<Integer, String> map = new Hashtable<>(10, 0.80f);
//        Map<Integer, String> map = new Hashtable<>(hashMap);


        map.put(10, "A");
        map.put(15, "B");
        map.put(20, "C");
        map.put(25, "D");
        map.put(30, "E");
        map.put(35, "F");
        map.put(40, "G");
        map.put(45, "H");

        //   map.putAll(hashMap);
        System.out.println(map.get(10));

        System.out.println(map.remove(10));

        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("D"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.clear();

        Collection<String> collection = map.values();
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();


        System.out.println(map);


    }
}
