package ArrayList;

import java.util.HashSet;

public class DistinctWords {
    public static void main(String[] args) {
        String sentence = "java is java";
        String[] word = sentence.split(" ");
        HashSet<String> distinct = new HashSet<>();
        for (String words: word){
            distinct.add(words);
        }

        System.out.println(distinct);
    }
}
