package dataStructures;

import java.util.*;

public class  StringList {
    public static void main(String[] args) {
        String [] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list1;
        for (String x: things){
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for (String y: moreThings){
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1, list2);
        System.out.println();

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }

    }
    public static void editlist(Collection<String> ls1, Collection<String> ls2){
        Iterator<String> it = ls1.iterator();
        while (it.hasNext()){
            if (ls2.contains(it.next())){
                it.remove();
            }
        }
    }

}
