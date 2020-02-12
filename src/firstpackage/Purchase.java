package firstpackage;

import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Math or Art?: ");
        String select = input.next();

        if(select.equalsIgnoreCase("math")){
            System.out.println("Do you want tutor? Y/N: ");
            String tutor = input.next();
            if(tutor.equalsIgnoreCase("y")){
                System.out.println("With tutor $100.");
            }
            else{
                System.out.println("Study yourself!");
            }

        }
        else if (select.equalsIgnoreCase("art")){
            System.out.println("Nice choice.");
        }
        else{
            System.out.println("Only math or art!");
        }
    }
}
