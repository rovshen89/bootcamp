package ArrayList;

import package2_24.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrLstReview {
    public static void main(String[] args) {
        ArrayList<String> myArr = new ArrayList<>();
        System.out.println(myArr);
        myArr.add("Test");
        myArr.add("Test1");
        myArr.add("AAAA");
        System.out.println(myArr);
        myArr.clear();
        System.out.println(myArr);
        String sentence = "Java is fun";

        for (int i = 0; i < sentence.length(); i++){
            String s = "";
            if (sentence.charAt(i) != ' '){
                s= s + sentence.charAt(i);
                myArr.add(s);
                System.out.print(myArr);
            }
        }


        ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        ArrayList<Integer> swapNum = new ArrayList<>();
        int temp;
        int index = myNumbers.size()-1;
        for (int i=0; i < myNumbers.size()/2; i++){
            temp = myNumbers.get(i);

        }
    }
}
