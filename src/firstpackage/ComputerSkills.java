package firstpackage;

import java.util.Scanner;

public class ComputerSkills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your skill(Java/SQL/Cloud): ");
        String skill = input.next();

        if(skill.equalsIgnoreCase("java")){
            System.out.print("Your Java score: ");
            int score = input.nextInt();
            if(score > 50 && score <= 100){
                System.out.println("Good");
            }
            else{
                System.out.println("You are not applicable.");
            }
        }
        else if(skill.equalsIgnoreCase("sql")){
            System.out.println("Your Hackerrank score: ");
            int score = input.nextInt();
            if(score > 80){
                System.out.println("Very good");
            }
            else{
                System.out.println("You are not applicable.");
            }
        }
        else if(skill.equalsIgnoreCase("cloud")){
            System.out.println("Your certificate Y/N: ");
            String cert = input.next();

            if(cert.equalsIgnoreCase("y")){
                System.out.println("You are good");
            }
            else{
                System.out.println("You are not applicable.");
            }
        }
        System.out.println("Please enter your skill!");

    }
}
