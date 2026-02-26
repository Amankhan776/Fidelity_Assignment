package com.Assignment;

import java.util.*;
 
public class LinkedHashmap {
 
    public static void main(String[] args) {
 
        
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
 
        map.put(1, "India");
        map.put(2, "USA");
        map.put(3, "Japan");
        map.put(4, "Germany");
        map.put(5, "France");
        map.put(6, "China");
        map.put(7, "Brazil");
        map.put(8, "Canada");
        map.put(9, "Italy");
        map.put(10, "Australia");
 
        // fetching all keys
        System.out.println("Keys are: " + map.keySet());
 
        // fetching all values
        System.out.println("Values are: " + map.values());
 
        // checking value India exists or not
        if(map.containsValue("India")) {
            System.out.println("India is present");
        } else {
            System.out.println("India is not present");
        }
 
        // checking key 45 exists or not
        if(map.containsKey(45)) {
            System.out.println("Key 45 is present");
        } else {
            System.out.println("Key 45 is not present");
        }
 
        // removing one country
        map.remove(3);
        System.out.println("After removing key 3: " + map);
 
        // creating second map (states)
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
 
        map2.put(101, "Karnataka");
        map2.put(102, "TamilNadu");
        map2.put(103, "Kerala");
 
        // merging maps
        map.putAll(map2);
        System.out.println("After merging: " + map);
 
        // deleting key 5
        map.remove(5);
        System.out.println("After deleting key 5: " + map);
 
        // checking map empty or not
        if(map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }
 
        // sorting final map
        TreeMap<Integer, String> t = new TreeMap<Integer, String>(map);
        System.out.println("Sorted map: " + t);
 
        // clearing map
        map.clear();
        System.out.println("After clear: " + map);
 
    }
}
