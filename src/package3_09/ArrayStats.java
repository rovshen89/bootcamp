package package3_09;

public class ArrayStats {
    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[] maxNumbers = returnMaxRows(myArray);
        //        printRowsMax(myArray);
//        for (int numbers : maxNumbers) {
//            System.out.print(" " + numbers);
//        }

//        printRowMin(myArray);
        int[] minNumbers = returnRowsMin(myArray);
        for (int numbers: minNumbers){
            System.out.println(numbers);
        }

        printMaxDiff(myArray);
    }

    public static int returnMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void printRowsMax(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(returnMax(row));
        }
    }

    public static int[] returnMaxRows(int[][] array) {
        int maxes[] = new int[array.length];
        int index = 0;
        for (int row[] : array) {
            maxes[index] = returnMax(row);
            index++;
        }
        return maxes;
    }

    public static int returnMin(int[] array){
        int min = array[0];
        for (int number: array){
            if (number < min){
                min = number;
            }
        }
        return min;
    }

    public static void printRowMin(int[][] array){
        for (int[] row: array){
            System.out.println(returnMin(row));
        }
    }

    public static int[] returnRowsMin(int[][] arr){
        int[] mins = new int[arr.length];
        int index = 0;
        for (int[] row: arr){
            mins[index] = returnMin(row);
            index++;
        }
        return mins;
    }

    public static void printMaxDiff(int[][] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(returnMax(array[i]) - returnMin(array[i]));
        }
    }
}