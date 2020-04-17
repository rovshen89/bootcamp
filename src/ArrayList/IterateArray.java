package ArrayList;

import java.util.HashMap;

public class IterateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,1,5,4,2,2};
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i: arr){
            numbers.put(i, numbers.getOrDefault(i, i));
        }

        System.out.println(numbers);

    }
}
