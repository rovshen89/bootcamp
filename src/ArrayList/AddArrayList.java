package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myArr = new ArrayList<>();

        int numbers = 1;
        while(numbers != 0){
            numbers = scanner.nextInt();
            myArr.add(numbers);
            System.out.println(myArr);
        }
    }
}
