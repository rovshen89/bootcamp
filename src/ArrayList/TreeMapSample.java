package ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>(Collections.reverseOrder());
        phoneBook.put("Customer1", "777777");
        phoneBook.put("Customer2", "888888");
        phoneBook.put("Customer3", "999999");
        System.out.println(phoneBook);

        Iterator<String> iter = phoneBook.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key = iter.next();
            System.out.println(key + " = " + "\t" + phoneBook.get(key));
        }
    }

}
