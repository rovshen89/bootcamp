package package3_02;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] twoArray = {{1,2}, {3,4}};
        for (int [] firstArray: twoArray){
            for (int secondArray: firstArray){
                System.out.print(secondArray + "\t");
            }
            System.out.println();
        }

        int[][] newArray = new int[3][3];
        int counter = 1;
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < newArray[i].length; j++){
                newArray[i][j] = counter;
                counter++;
                }
            }

        for (int i = 0; i < newArray.length; i++){
            for (int numbers: newArray[i]){
                System.out.print(numbers + "\t");
            }
            System.out.println();
        }
        }
}
