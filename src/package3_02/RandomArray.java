package package3_02;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        int [] randomArray = new int[5];

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)(10+(Math.random()*20));;
            System.out.print(randomArray[i] + " ");

        }
//        for (int number: randomArray){
//            System.out.println(number);
        }


    }

