package dataStructures;
import java.util.*;
public class LinkedListSample {
    public static void main(String[] args) {
        //Create new string array and list object;
        String[] things = {"apples", "nooks", "pages", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();
        for (String x: things){
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for (String y: things2 ){
            list2.add(y);
        }

        //Add all elements in list2 to list1;
        list1.addAll(list2);
        //empty list2 to free up some memory;
        list2 = null;

        //create methods to manipulate with lists;
        printMe(list1);                        //print new list1
        removeStuff(list1, 2,5);    ///print list1 with removed item from 2-4 index
        printMe(list1);                       //print list1 with removed items
        reverseMe(list1);                     //print reversed list1
    }

    //printMe method;
    private static void printMe(List<String> l){
        for (String b: l){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }

    //removeStuff method;
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear(); //remove items with built-in methods: subList() & clear()
    }

    //reverseMe method;
    private static void reverseMe(List<String> l){
        ListIterator<String> iterate = l.listIterator(l.size());    //use size() method to auto detect ending start point of the list
        while(iterate.hasPrevious()){       //hasPrevious() method iterates the list until it reaches to the end
            System.out.printf("%s ", iterate.previous());
        }
    }
}
