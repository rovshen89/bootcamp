package firstpackage;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter M or F: ");
        String gender = scanner.next();

        if(gender.equals("M")){
            System.out.println("Male");
        }
        else if(gender.equals("F")){
            System.out.println("Female");
        }
        else{
            System.out.println("Please enter value");
        }
    }
}
