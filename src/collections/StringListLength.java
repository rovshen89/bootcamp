package collections;

import java.util.*;

public class StringListLength {
    public static void main(String[] args) {
        LinkedList<String> myStr = new LinkedList<>(Arrays.asList("TheLongest", "word", "is", "asasdasdasasfdasfsadfsd"));
        findLongest(myStr);
        findShortest(myStr);

        List<String> myInt = new LinkedList<>(Arrays.asList("Java 8", "HTML 5", "Oracle 9"));
        findTotal(myInt);

    }

    public static void findLongest(List<String> word){
        List<Integer> wordLength = new LinkedList<>();
        for (String str: word ){
            wordLength.add(str.length());
        }
        int index = wordLength.indexOf(Collections.max(wordLength));
        System.out.println("The longest word is: " + "\"" + word.get(index) + "\"" + " with length of: " + wordLength.get(index));
    }

    public static void findShortest(List<String> word){
        List<Integer> wordLength = new LinkedList<>();
        for (String str: word ){
            wordLength.add(str.length());
        }
        int index = wordLength.indexOf(Collections.min(wordLength));
        System.out.println("The shortest word is: " + "\"" + word.get(index) + "\"" + " with length of: " + wordLength.get(index));
    }

    public static void findTotal(List<String> word){
        int total = 0;
        String num = "";
        for (String str: word){
            for (int i = 0; i < str.length(); i++){
                if (Character.isDigit(str.charAt(i))){
                    num+=str.charAt(i);
                    total += Integer.parseInt(num);
//                    System.out.println(str.charAt(i));
                }
                num = "";
            }
        }
        System.out.println(total);
    }


}
