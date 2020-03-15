package package3_12;

import java.util.Arrays;

public class ZeroArray {
    public static void main(String[] args) {
        int[] myArr = {0,9,4,3,0,2,1,0,9,0,0};
        int[] result = zeroArray(myArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] zeroArray(int[] array){
        int[] index = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                index[count] = array[i];
                count++;
            }
        }
        return index;
    }
}
