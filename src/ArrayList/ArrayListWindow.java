package ArrayList;

import package2_24.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWindow {
    public static void main(String[] args) {
        for (int i = 100; i <= 0; i--){
            System.out.println(100 - (i-1));
        }

        int[] window = {1,2};
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.get(0).addAll(Arrays.asList(1,2,3,4));
        matrix.add(new ArrayList<>());
        matrix.get(1).addAll(Arrays.asList(5,6,7,8));
        System.out.println(matrix);
        matrix.add(new ArrayList<>());
        matrix.get(2).addAll(Arrays.asList(9,10,11,12));
        System.out.println(matrix);
        applyWindowing(matrix, window);


        ArrayList<ArrayList<String>> myStr = new ArrayList<>();
        myStr.add(new ArrayList<>());
        myStr.get(0).addAll(Arrays.asList("Java", "is", "FuN"));
        myStr.add(new ArrayList<>());
        myStr.get(1).addAll(Arrays.asList("JaVa", "is", "SuPeR"));
        System.out.println(myStr);
        findUpperCase(myStr);
        findLowerCase(myStr);
    }

    public static void applyWindowing(ArrayList<ArrayList<Integer>> arr, int[] window){
        int num;
        for (int i = 0; i < arr.size(); i++){
            for (int j  = 0; j < arr.get(i).size(); j+=2){
                num = arr.get(i).get(j) * window[0];
                arr.get(i).set(j, num);
                num = arr.get(i).get(j+1) * window[1];
                arr.get(i).set(j+1, num);
            }
        }
        for (ArrayList<Integer> a: arr){
            System.out.println(a);
        }
    }

    public static void findUpperCase(ArrayList<ArrayList<String>> str){
        int counterCase;
        int counterRow;
        for (int i = 0; i < str.size(); i++){
            counterRow = 0;
            for (int j = 0; j < str.get(i).size(); j++){
                counterCase = 0;
                for (int k = 0; k < str.get(i).get(j).length(); k++){
                    if (Character.isUpperCase(str.get(i).get(j).charAt(k))){
                        counterCase++;
                    }
                }
                counterRow += counterCase;
            }
            System.out.println("There are " + counterRow + " upper case letter at row " + (i +1));
        }
    }

    public static void findLowerCase(ArrayList<ArrayList<String>> myStr){
        int counterWord;
        int counterRow;
        for (int i = 0; i < myStr.size(); i++){
            counterRow = 0;
            for (int j = 0; j < myStr.get(i).size(); j++){
                counterWord = 0;
                for (int k = 0; k < myStr.get(i).get(j).length(); k++){
                    if (Character.isLowerCase(myStr.get(i).get(j).charAt(k))){
                        counterWord ++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("there are " + counterRow + " lower case letter in row " + (i + 1));
        }
    }
}
