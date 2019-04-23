package code_uz._map_05_Lesson;

import java.util.*;

/**
 * MAP
 * _05_LESSON
 */
public class Main {

    public static void main(String[] args) {
        // IdentityHashMap

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(105, "D");

        Map<Integer, String> map = new IdentityHashMap<>(); //
//        Map<Integer, String> map = new HashMap<>(20);
//        Map<Integer, String> map = new HashMap<>(20, 0.80f);
//        Map<Integer, String> map = new HashMap<>(map1);

        Integer i1 = new Integer(101);
        Integer i2 = new Integer(101);


//        System.out.println(i1.equals(i2));
//        System.out.println(i1 == i2);

        map.put(i1, "B");
        map.put(i2, "C");

        // System.out.println(map.get(i2));

        //  System.out.println(map.get(101));
//        System.out.println(map.remove(i2));
        System.out.println(map.containsKey(i1));

//        map.putAll(map1);

//        System.out.println(map.get(107));
//        System.out.println(map.remove(107));
//        System.out.println(map.containsKey(107));
//        System.out.println(map.containsValue("AA"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());

//        map.clear();

//        Collection<String> collection = map.values();
//        System.out.println(collection);


//          Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//        System.out.println(map.entrySet());

//        for (Map.Entry<Integer, String> entry : entrySet) {
//            System.out.println(" Key : " + entry.getKey() + "     Value:  " + entry.getValue());
//        }

//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(" Key : " + entry.getKey() + "     Value:  " + entry.getValue());
//        }

        System.out.println(map);


    }
}
