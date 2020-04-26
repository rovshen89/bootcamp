package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TwoDString {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        ArrayList<String> row  = new ArrayList<>(Arrays.asList("Java", "is", "fun", "Always", "Java", "is", "Fun"));

        for (int i = 0; i < 5; i++){
            words.add(new ArrayList<>());
            words.get(i).addAll(row);
        }

        for (ArrayList<String> line: words){
            System.out.println(line);
        }

        Iterator<ArrayList<String>> iterator = words.iterator();
        int counter;
        while(iterator.hasNext()){
            counter = 0;
            for (String word: iterator.next()){
                for (int i = 0; i < word.length(); i++){
                    if (Character.isUpperCase(word.charAt(i))){
                        counter++;
                    }
                }
            }
            System.out.println("Total upper for this line : " + counter);
        }
    }


}
