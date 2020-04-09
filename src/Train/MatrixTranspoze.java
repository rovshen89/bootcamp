package Train;

import java.util.Arrays;

public class MatrixTranspoze {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {4,5,6}, {7,8}};

        for (int[] myarr: arr){
            System.out.println(Arrays.toString(myarr)) ;
        }

        for(int i = 0; i <arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
               try{
                   System.out.print(arr[j][i] + "\t");
               }
               catch (ArrayIndexOutOfBoundsException e){
                   System.out.println(" x ");
               }
               finally {
                   System.out.print("Lined printed ");
               }
            }
            System.out.println();
        }
    }
}
