package firstpackage;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter C, R or T: ");
        //Receiving input from user:
        String shape = myInput.next();
        if(shape.compareToIgnoreCase("c") == 0){
            System.out.println("Please enter the radius:");
            double radius = myInput.nextDouble();
            System.out.println(2 * 3.14 * radius);
        }
        else if(shape.compareToIgnoreCase("r") == 0){
            System.out.print("Enter width: ");
            int width = myInput.nextInt();
            System.out.println("Enter height: ");
            int height = myInput.nextInt();
            System.out.println(2 * (width + height));

        }
        else if(shape.compareToIgnoreCase("t") == 0){
            System.out.println("Enter edge 1:");
            int edge1 = myInput.nextInt();
            System.out.println("Enter edge 2: ");
            int edge2= myInput.nextInt();
            System.out.println("Enter edge 3: ");
            int edge3 = myInput.nextInt();
            System.out.println(edge1 + edge2 + edge3);

        }
        else{
            System.out.println("Please enter value:");
        }
    }
}
