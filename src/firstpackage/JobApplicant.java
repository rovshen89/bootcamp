package firstpackage;

import java.util.Scanner;

public class JobApplicant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Java Point: ");
        double javaPoint = scanner.nextDouble();
        double score;

        if(age > 20 && age < 30 && javaPoint >= 80){
           score = ((age * 1.5) + (javaPoint * 4.5));
            System.out.println("Your app score: " + score);
        }
        else if(age > 20 && age < 30 && javaPoint <= 80){
            score = ((age * 1.5) + (javaPoint * 3.5));
            System.out.println("Your app score: " + score);
        }
        else if (age > 31 && javaPoint > 80){
            score = ((age * 1.1) + (age * 4.5));
            System.out.println("Your app score: " + score);
        }
        else if (age > 31 && javaPoint <= 80){
            score = ((age * 1.5) + (javaPoint * 3.5));
            System.out.println("Your app score: " + score);
        }
        else{
            System.out.println("Please enter valid age or JavaPoint");
        }
    }
}
