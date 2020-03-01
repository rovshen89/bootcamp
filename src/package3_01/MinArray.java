package package3_01;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,44,5,6,7,8,9,20,};
        System.out.println(minArray(arr));
    }

    public static int minArray(int [] a){
        int min = a[0];
        for (int i = 0; i<a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}
