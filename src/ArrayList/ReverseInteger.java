package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> numrever = new ArrayList<>();
        for (int i = number.size() -1; i >= 0; i--){
            numrever.add(number.get(i));
        }
        System.out.println(numrever);
    }
}
