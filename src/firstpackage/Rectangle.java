package firstpackage;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        int length, width;
        length = newScan.nextInt();
        width = newScan.nextInt();
        System.out.println("Area of the rectangle: " + (length * width));

    }
}
