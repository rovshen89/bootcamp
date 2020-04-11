package ArrayList;

import package2_24.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class HalfStringArray {
    public static void main(String[] args) {
        ArrayList<String> myStr = new ArrayList<>(Arrays.asList("Amazon", "Google", "Microsoft", "Apple", "NAU"));
        System.out.println(halfString(myStr));
    }

    public static ArrayList<String> halfString(ArrayList<String> inString ){
        int halfString = inString.size()/2;
        ArrayList<String> half = new ArrayList<>();

        for (int i = 0; i < halfString; i++){
            half.add(inString.get(i));
        }
        return half;
    }
}
