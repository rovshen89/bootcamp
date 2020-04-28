package ArrayList;

import java.util.HashMap;
import java.util.Iterator;

public class CheckKey {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "A");
        hm.put("b", "B");
        hm.put("c", "C");
        hm.put("d", "D");
        System.out.println(hm);
        isKeyHas(hm, "c");
    }

    public static boolean isKeyHas(HashMap<String, String> check, String key){
        boolean result= false;
        Iterator<String> it = check.keySet().iterator();
        while (it.hasNext()){
            if (key.equals(it.next())){
                result = true;
            }
        }
        return result;
    }
}
