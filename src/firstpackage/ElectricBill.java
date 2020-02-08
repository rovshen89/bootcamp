package firstpackage;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your consumption: ");
        int myConsumption = scanner.nextInt();
        double electricBill;

        if(myConsumption < 501){
            electricBill = myConsumption * 0.3;
        }
        else if(myConsumption < 1001){
            electricBill = myConsumption * 0.4;
        }
        else if(myConsumption < 2001){
            electricBill = myConsumption * 0.5;
        }
        else{
            electricBill = myConsumption * .6; //without 0 double numbers are ok
        }
        System.out.println(electricBill);
    }
}
