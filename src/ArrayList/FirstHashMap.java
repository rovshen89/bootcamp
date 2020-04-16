package ArrayList;

import java.util.HashMap;

public class FirstHashMap {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Java", "medium");
        myHashMap.put("SQL", "entry");
        myHashMap.put("Selenium", "master");
        myHashMap.put("Cucumber", "expert");

        System.out.println(myHashMap);

        HashMap<String, Integer> map2 = new HashMap<>(4);
        map2.put("Los Angeles", 85);
        map2.put("Chicago", 30);
        map2.put("Denver", 55);
        map2.put("Orlando", 90);
        System.out.println(map2);

        for (String key: map2.keySet()){
            System.out.println("Key: " + key + "\tValue: " + map2.get(key));
        }
        int total = 0;
        for (Integer values: map2.values()){
            total += values;
        }
        System.out.println("Average: " + total/map2.size());
    }
}
