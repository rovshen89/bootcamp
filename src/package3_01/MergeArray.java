package package3_01;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,4};
        int [] array2 = {3,5,6};
        mergeArray(array1, array2);

    }

    public static void mergeArray(int[] a, int[] b){
        int lenMergedArray = a.length + b.length;
        int[] mergedArray = new int[lenMergedArray];
        for (int i = 0; i < a.length; i++){
            mergedArray[i] = a[i];
            }

        int index=0;
        for (int i = a.length; i<mergedArray.length; i++){
            mergedArray[i] = b[index];
            index++;
        }

        for (int i = 0; i<mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }
}
