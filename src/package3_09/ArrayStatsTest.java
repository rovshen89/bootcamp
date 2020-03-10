package package3_09;

import package2_24.Array;

public class ArrayStatsTest {
    public static void main(String[] args) {
        int[][] myArrayNumbers = {{4,235,32,6347,56,78,67},{123,53,64,57,6789,8909},
                {33454,57,679,5654},{2234,6,57768}};

        ArrayStats.printRowsMax(myArrayNumbers);
        ArrayStats.printRowMin(myArrayNumbers);
        ArrayStats.printMaxDiff(myArrayNumbers);

    }
}
