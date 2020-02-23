package package2_23;

import java.util.Scanner;

public class NumberGuess {
    public static void guessTheNumber(int nummber){
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        while (userGuess != nummber){
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            if (userGuess == nummber){
                System.out.println("Congrats");
            }else if(userGuess > nummber){
                System.out.println("Try smaller");
            }else{
                System.out.println("Try bigger");
            }
        }
    }
}
