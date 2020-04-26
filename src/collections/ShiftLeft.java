package collections;

import java.util.ArrayList;
import java.util.List;

public class ShiftLeft {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        shift(myList,3);
    }

    public static void shift(ArrayList<Integer> arr, int left){
        for (int i = 0; i < left; i++){
            arr.remove(0);
        }
        System.out.println(arr);
    }
}
