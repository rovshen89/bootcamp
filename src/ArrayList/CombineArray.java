package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        System.out.println(combineList(list1, list2));
        list1.addAll(list2);
        System.out.println(list1);
    }

    public static ArrayList<Integer> combineList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> combined = new ArrayList<>();
        for (int element: list1){
            combined.add(element);
        }

        for (int element: list2){
            combined.add(element);
        }

        return combined;

    }

}
