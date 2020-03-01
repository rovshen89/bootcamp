package package2_26;

public class CommonElementsArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,5,6,7};
        int[] array2 = {2,4,6,7,9,0};
        commonElements(array1,array2);
    }


    public static void commonElements(int [] a, int [] b){

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
