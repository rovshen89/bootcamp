package package3_09;

public class ArrayReplace {
    public static void main(String[] args) {
    int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] result = replaceArray(myArray);
    for (int[] row: result){
        for (int number: row){
            System.out.print("\t" + number);
        }
        System.out.println();
    }

    }

    public static int[][] replaceArray(int[][] numbers){
        int[][] replaced = new int[numbers.length][numbers[0].length];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                replaced[j][i] = numbers[i][j];
            }
        }
        return replaced;
    }
}

