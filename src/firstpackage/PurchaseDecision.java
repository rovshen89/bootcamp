package firstpackage;

import java.util.Scanner;

public class PurchaseDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select color: Blue or Red: ");
        String color = scanner.nextLine();
        System.out.print("Please enter tag price: ");
        double priceTag = scanner.nextDouble();
        System.out.print("Please enter discount: ");
        float discount = scanner.nextFloat();
        int colorValue = 0;

        if(color.compareToIgnoreCase("red") == 0){
            colorValue = 20;
        }
        else if(color.compareToIgnoreCase("blue") == 0){
            colorValue = 10;
        }
        else {
            System.out.println("red or blue only");
        }

        int productPoint = (int)(priceTag * discount - colorValue);
        System.out.println(productPoint);

        if(productPoint >= 100){
            System.out.println("Do not buy!");
        }
        else if(productPoint >= 50){
            System.out.println("Buy later");
        }
        else{
            System.out.println("Buy now");
        }
    }
}
