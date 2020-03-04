package package3_02;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        /*int[] randomArray = new int[5];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (10 + (Math.random() * 20));
        }

        for (int number : randomArray) {
            System.out.println(number);
        }*/

        String[] arrayString = new String[10];
        for (int i = 0; i < arrayString.length; i++){
            arrayString[i] = generateRandWord();
        }

        for (String word: arrayString){
            System.out.print(word + " ");
        }
    }

    public static String generateRandWord(){
        String word = " ";
        int wordLength = (int)(Math.random()*6+1);
        for (int i = 0; i < wordLength;i++){
            word += (char)(Math.random()*26+97);
        }
        return word;
    }
}
