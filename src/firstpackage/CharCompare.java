package firstpackage;

import javax.swing.*;
import java.util.Scanner;

public class CharCompare {
    public static void main(String[] args) {
        /*char a = 'a';
        char b = 'b';
        if (a == b){
            System.out.println("yes it is");
            System.out.println("line 2");
        }*/

        int number;
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter number");
        number = newScanner.nextInt();

        if (number % 2 == 1){
            System.out.println("odd");
        }
        System.out.println("even");

    }
}

