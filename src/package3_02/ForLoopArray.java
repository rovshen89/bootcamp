package package3_02;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5,6,7,8};
        String[] arrayString = {"String", "Array", "ForLoop"};

        //print elements of array with for loop;
        for (int number: arrayInt){
            System.out.printf("%d ", number);
        }
        System.out.println();

        for (String word: arrayString){
            System.out.print(word + " ");
        }
    }
}
