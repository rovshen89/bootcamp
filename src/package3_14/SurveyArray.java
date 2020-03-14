package package3_14;

import java.util.Arrays;
import java.util.Scanner;

public class SurveyArray {
    public static void main(String[] args) {
        evaluateSelfishness();
    }

    public static void evaluateSelfishness(){
        String[] questions = {"Level your selfishness (0-10): ",
        "You are the most important person in this world (0-10): ",
        "Nobody is like you (0-10): ",
        "You never shar(0-10): "};

        int[] answers = new int[questions.length];
        Scanner scanner  = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++){
            System.out.print(questions[i]);
            answers[i] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(answers));

        int total = 0;
        for (int score: answers){
            total+=score;
        }
        if (total <= 10){
            System.out.println("Not Selfish");
        }else if (total <= 30){
            System.out.println("Selfish");
        }else{
            System.out.println("You are not good");
        }
    }
}
