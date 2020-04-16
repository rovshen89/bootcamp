package ArrayList;

import package2_24.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAccumulator;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>(Arrays.asList("JavA", "is", "fUn"));
        words.add(a);
        words.add(a);
        words.get(0).add("ABCDE");
        words.get(1).add("abcde");
        System.out.println(words);
        findUpperCase(words);
        findLowerCase(words);
        upperInElement(words);


        ArrayList<Integer> myInt = new ArrayList<>(Arrays.asList(89,2,3,4,5,6,88));
        returnLarger(myInt);
    }

    public static void findUpperCase(ArrayList<ArrayList<String>> arr){
        int counterWord;
        int counterRow;
        for (int i = 0; i<arr.size(); i++){ //to fetch 1dim String arrays
            counterRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++){ // to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++){ //to fetch chars
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("there are " + counterRow + " upper cases at row " + (i + 1));
        }
    }

    public static void findLowerCase(ArrayList<ArrayList<String>> arr){
        int countInWord;
        int countInRow;
        for (int i = 0; i < arr.size(); i++){
            countInRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++){
                countInWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++){
                    if (Character.isLowerCase(arr.get(i).get(j).charAt(k))){
                        countInWord++;
                    }
                }
                countInRow += countInWord;
            }
            System.out.println("there are " + countInRow + " lower cases at row " + (i+1));
        }
    }

    public static void upperInElement(ArrayList<ArrayList<String>> arr){
        int counterWord;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).size(); j++){
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++){
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                System.out.println("There are "  + counterWord + " upper cases at in " + arr.get(i).get(j));
            }
        }
    }

    public static void returnLarger(ArrayList<Integer> myArr){
        int max;
        if (myArr.get(0) > myArr.get(myArr.size() - 1)){
            max = myArr.get(0);
        }else{
            max = myArr.get(myArr.size()-1);
        }

        for (int i = 0; i < myArr.size() ; i++) {
            myArr.set(i, max);
        }

        System.out.println(myArr);
    }
}
