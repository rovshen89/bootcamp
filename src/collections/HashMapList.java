package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapList {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Java", "medium");
        myMap.put("Sql", "expert");
        myMap.put("Selenium", "master");
        myMap.put("Cucumber", "novice");
        System.out.println(myMap);

        Iterator<String> it = myMap.keySet().iterator();
        String key;
        while(it.hasNext()){
            key = it.next();
            System.out.println(key + ":\t" + myMap.get(key));
        }
    }
}
