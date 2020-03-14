package package3_14;

public class CommonArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8};
        int[] num2 = {1,2,3,4,55,77,88,8};
        printCommons(num1, num2);
    }

    public static void printCommons(int arr1[], int arr2[]){
        for (int i=0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
