package firstpackage;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N % 2 == 1){
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && (N > 2 && N < 6)){
            System.out.println("Not weird");
        }
        else if(N % 2 == 0 && (N > 6 && N < 20)){
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        }

    }
}
