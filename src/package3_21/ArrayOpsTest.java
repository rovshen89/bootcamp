package package3_21;

import java.util.Scanner;

public class ArrayOpsTest {
    public static void main(String[] args) {
        ArrayOps myAr = new ArrayOps();
        int[] arr = {1,2,3,4,5,6};
        int index = myAr.findIndex(arr, 3);
        System.out.println(index);
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
    }
}
