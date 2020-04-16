package ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedWord {
    public static void main(String[] args) {
        LinkedList<String> myStr = new LinkedList<>(Arrays.asList("Java", "is", "always", "fun"));
        longestString(myStr);
        shortestString(myStr);
    }

    public static void longestString(LinkedList<String> words){
        int longest = 0;
        int index = 0;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() > longest){
                longest = words.get(i).length();
                index = i;
//                System.out.println(words.get(i));
            }
        }
        System.out.println("The longest word is: " + words.get(index));
    }

    public static void shortestString(LinkedList<String> words){
        int shortest = words.get(0).length();
        String shortestWord = "";
        for (int i = 1; i < words.size(); i++ ){
            if (words.get(i).length() < shortest){
                shortest = words.get(i).length();
                shortestWord = words.get(i);
            }
        }
        System.out.println("The shortest word : " + shortestWord);
    }
}
