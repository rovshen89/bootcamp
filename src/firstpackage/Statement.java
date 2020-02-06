package firstpackage;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int season;
        System.out.println("Enter value: ");
        season = scan.nextInt();


        if (season <= 20){
            System.out.println("Winter");
        }
        else if(season >= 21 && season < 41){
            System.out.println("Fall");
        }
        else if(season >= 40 && season < 61){
            System.out.println("Spring");
        }
        else if (season >= 60){
            System.out.println("Summer");
        }
    }

}
