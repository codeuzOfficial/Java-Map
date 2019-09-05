package code_uz._map_06_Lesson;

import java.util.*;

/**
 * MAP
 * _06_LESSON
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // WeakHashMap

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(105, "D");

        Map<Student, String> map = new WeakHashMap<>(); //
//        Map<Integer, String> map = new HashMap<>(20);
//        Map<Integer, String> map = new HashMap<>(20, 0.80f);
//        Map<Integer, String> map = new HashMap<>(map1);


        Student s1 = new Student(101);
        Student s2 = new Student(102);

        map.put(s1, "A");
        map.put(s2, "B");

        s1 = null;
        System.gc();

        Thread.sleep(3000);

        map.put(new Student(103), "C");


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
