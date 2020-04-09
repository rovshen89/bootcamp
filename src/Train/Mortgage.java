package Train;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte months_in_year = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 100000)
                break;
            System.out.println("Enter a value between 1000 and 1000000.");
        }

        while(true){
            System.out.print("Annual interest rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / months_in_year;
                break;
            }
            System.out.println("Enter a value between 1 and 30:");
        }

        while (true){
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                numberOfPayments = years * months_in_year;
                break;
        }

//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest))
    }
}
