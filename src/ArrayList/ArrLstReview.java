package ArrayList;

import java.util.ArrayList;

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


    }
}
