package ArrayList;

import java.util.HashMap;

public class EncryptKaraca {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "karaca"};
        for (String word: words){
            System.out.println(applyKaraca(word));
        }
    }

    public static String applyKaraca(String word){
        //reverse the string
        StringBuilder result = new StringBuilder(word);
        result.toString();
        result.reverse();

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('a', '0');
        hm.put('e', '1');
        hm.put('o', '2');
        hm.put('u', '3');

        char letter;
        String finalResult = "";
        for (int i = 0; i<result.length(); i++){
            letter = result.charAt(i);
            if (hm.containsKey(letter)){
                finalResult += hm.get(letter);
            }else{
                finalResult += result.charAt(i);
            }
        }

        finalResult += "aca";
        return finalResult;
    }
}
