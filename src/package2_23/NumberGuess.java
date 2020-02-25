package package2_23;

import java.util.Scanner;

public class NumberGuess {
    public static void guessTheNumber(int number){
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        while (userGuess != number){
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            if (userGuess == number){
                System.out.println("Congrats");
            }else if(userGuess > number){
                System.out.println("Try smaller");
            }else{
                System.out.println("Try bigger");
            }
        }
    }

    public static void main(String[] args) {
        guessTheNumber(10);
    }
}
