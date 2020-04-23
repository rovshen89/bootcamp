package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Add2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> myArr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int number = 1;
        for (int i = 0; i < 5; i++){
            myArr.add(new ArrayList<>());
            number = 1;
            while(number != 0){
                System.out.print("Enter number: ");
                number = scanner.nextInt();
                if (number != 0){
                    temp.add(number);
//                    System.out.println(temp);
                }
            }
            myArr.get(i).addAll(temp);
            temp.clear();
            System.out.println(myArr);
        }
    }
}
