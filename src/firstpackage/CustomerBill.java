package firstpackage;

import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have subscription (Y/N)? : ");
        String subscription = scanner.next();

        if(subscription.equals("Y")){
            System.out.println("Average usage GB: ");
            int usage = scanner.nextInt();

            if(usage <= 100){
                System.out.println("Monthly payment will be $10");
            }
            else{
                System.out.println("Monthly payment will be $40");
            }
        }
        else{
            System.out.println("Please visit subscription page");
        }


    }
}
