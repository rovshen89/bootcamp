package package3_01;

import java.util.Arrays;

public class RandomNumberArray {
    public static void main(String[] args) {
        createRandomIntegerArray(10);

    }

    public static void createRandomIntegerArray(int a){

        int [] arrayInt = new int[a];

        for (int i = 0; i < arrayInt.length; i++ ){
            int randomInt = (int)(1000+(Math.random()*4000));
            arrayInt[i] = randomInt;

        }
        System.out.print(Arrays.toString(arrayInt));
    }
}
