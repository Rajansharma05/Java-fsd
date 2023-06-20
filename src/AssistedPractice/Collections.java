package AssistedPractice;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Adding key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Verifying list implementation
        System.out.println("List elements:");
        for (String element : list) {
            System.out.println(element);
        }

        // Verifying set implementation
        System.out.println("\nSet elements:");
        for (String element : set) {
            System.out.println(element);
        }

        // Verifying map implementation
        System.out.println("\nMap entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
