package firstpackage;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();

        if(score > 0 && score < 50){
            System.out.println("Fail");
        }
        else if(score < 60){
            System.out.println("Grade: D");
        }
        else if(score < 70){
            System.out.println("Grade: C");
        }
        else if(score < 80){
            System.out.println("Grade: B");
        }
        else if(score < 90){
            System.out.println("Grade: A");
        }
        else if(score <= 100){
            System.out.println("Grade: A+");
        }
        else{
            System.out.println("Enter between 0 - 100");
        }
    }
}
