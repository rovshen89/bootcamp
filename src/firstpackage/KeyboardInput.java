package firstpackage;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        /*Scanner newScanner = new Scanner(System.in);
        float side1, side2, side3;
        System.out.println("Please enter triangle side 1: ");
        side1 = newScanner.nextFloat();
        System.out.println("Please enter triangle side 2: " );
        side2 = newScanner.nextFloat();
        System.out.println("Please enter triangle side 3");
        side3 = newScanner.nextFloat();
        System.out.println("Triangle Perimeter will be:" + (int)(side1 + side2 + side3)); */

        Scanner newScanner = new Scanner(System.in);
        String name;
        int age;
        float weight;
        String hairColor;
        System.out.println("Please enter your name: ");
        name = newScanner.nextLine();
        System.out.println("Please enter your age: ");
        age = newScanner.nextInt();
        System.out.println("Please enter your weight: ");
        weight = newScanner.nextFloat();
        System.out.println("Please enter your hair color: ");
        hairColor = newScanner.next();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.format("Your weight is: %.1f \n",  weight);
        System.out.println("Your hair color is: " + hairColor);


    }
}
