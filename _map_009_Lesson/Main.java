package code_uz._map_009_Lesson;

import java.util.*;

/**
 * MAP
 * _09_LESSON
 */
public class Main {

    public static void main(String[] args) {
        // TreeMap

        //   Map<Integer, String> map = new TreeMap<>();

   /*
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Map<Integer, String> map = new TreeMap<>(comparator);
*/


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "GG");

        TreeMap<Integer, String> map = new TreeMap<>(hashMap);

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


        System.out.println(" .firstKey() " + map.firstKey());
        System.out.println(" .lastKey() " + map.lastKey());
        System.out.println(" .headMap() " + map.headMap(20));
        System.out.println(" .tailMap() " + map.tailMap(20));
        System.out.println(" .subMap() " + map.subMap(20, 50));


        System.out.println(".higherKey() " + map.higherKey(80));
        System.out.println(".ceilingKey() " + map.ceilingKey(6));
        System.out.println(".lowerKey() " + map.lowerKey(10));
        System.out.println(".floorKey() " + map.floorKey(15));
        System.out.println(".firstEntry() " + map.firstEntry());
        System.out.println(".lastEntry() " + map.lastEntry());
        System.out.println(".subMap(... , ... , ... , ...) " + map.subMap(15, false, 30, true));


        System.out.println(map);


    }
}
