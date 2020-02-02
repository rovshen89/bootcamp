package firstpackage;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        float radius;
        radius = newScanner.nextFloat();
        System.out.format("Circle perimeter: %.2f",(radius * (2 * Math.PI)));
    }
}
