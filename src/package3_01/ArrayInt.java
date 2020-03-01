package package3_01;

public class ArrayInt {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9,0};
        int arrayLen = myArray.length;
        int half = arrayLen/2 + 1;
        int [] firstHalf = new int[half];

        for (int i = 0; i < half; i++ ){
            firstHalf[i] = myArray[i];
        }

        int secondHalf[] = new int[myArray.length - half];
        int index = 0;

        for (int i = half; i < myArray.length; i++){
            secondHalf[index] = myArray[i];
            index++;
        }

        System.out.println("First Array");
        for (int i = 0; i<firstHalf.length;i++){
            System.out.println(firstHalf[i]);
        }

        System.out.println("Second Array");
        for (int i = 0; i<secondHalf.length; i++){
            System.out.println(secondHalf[i]);
        }

    }

}
