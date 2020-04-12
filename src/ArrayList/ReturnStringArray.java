package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnStringArray {
    public static void main(String[] args) {
        ArrayList<String> myStr = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

    }

    public static String[] listToString(ArrayList<String> arr){
        String[] arrStr = new String[arr.size()];
        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = arr.get(i);
        }
        return arrStr;
    }
}
