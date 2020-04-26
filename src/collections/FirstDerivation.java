package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstDerivation {
    public static void main(String[] args) {
        int[] arr = {5,8,1,13,6,4,8,9};
        int[] result = applyFirstDeriv(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] applyFirstDeriv(int[] arr){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++){
            result.add(arr[i] - arr[i+1]);
        }

        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            resultArr[i] = result.get(i);
        }

        return resultArr;

    }
}
