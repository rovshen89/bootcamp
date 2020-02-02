package firstpackage;

import java.util.Scanner;

public class FinanceCar {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        int mSrp, down, month;
        double discount;

        System.out.println("Please enter MSRP: ");
        mSrp = newScanner.nextInt();
        System.out.println("Please enter your down payment");
        down = newScanner.nextInt();
        System.out.println("Please input total month: ");
        month = newScanner.nextInt();
        System.out.println("Please enter discount: ");
        discount = newScanner.nextDouble();

        System.out.println("Your monthly payment: " + ((mSrp * (100 - discount)/100)-down)/month);
    }
}
