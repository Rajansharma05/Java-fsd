package AssistedPractice;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(3, "apple");
        hashMap.put(1, "banana");
        hashMap.put(2, "cherry");

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "apple");
        treeMap.put(1, "banana");
        treeMap.put(2, "cherry");

        // Verifying HashMap implementation
        System.out.println("HashMap entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Verifying TreeMap implementation
        System.out.println("\nTreeMap entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

