package package3_01;

public class SymmetricArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1,0,3};
        checkSymmetry(arr);
    }

    public static void checkSymmetry(int[] a) {
        int index = a.length - 1;
        int counter = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] != a[index]){
                counter++;
            }
            index--;

        }
        if (counter==0){
            System.out.println("Symmetric");
        }else{
            System.out.println("Not Symmetric");
        }
    }

}
