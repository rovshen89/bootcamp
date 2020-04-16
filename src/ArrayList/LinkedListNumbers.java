package ArrayList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListNumbers {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("6 Bananas", "5 apples", "4 peach"));
        sumDigits(myList);
    }

    public static void sumDigits(LinkedList<String> words){
        int total = 0;
        int value;
        for (String x: words){
            for (int i = 0; i < x.length(); i++){
                if (Character.isDigit(x.charAt(i))){
                    value = x.charAt(i) - 48;
                    total += value;
                }
            }
        }
        System.out.println(total);
    }
}
