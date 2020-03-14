package dataStructures;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] inputArr = {1,2,3,4,5,6,6,7,77,90};
        int findArr = 90;
        int result = linearSearch(inputArr, findArr);
        System.out.println("Your number found at index: " + result);

    }

    public static int linearSearch(int[] input, int find){
        for (int i=0; i < input.length; i++){
            if (input[i] == find){
                return i;
            }
        }
        return -1;
    }
}
