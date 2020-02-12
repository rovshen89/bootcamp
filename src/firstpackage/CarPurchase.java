package firstpackage;

import java.util.Scanner;

public class CarPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select Model X - Y: ");
        String model = input.next();
        int MSRP = 0;

        if(model.equalsIgnoreCase("x")){
            MSRP = 30000;
            System.out.println("Body Package Y - N: ");
            String body = input.next();
            if (body.equalsIgnoreCase("y")){
                MSRP += 5000;
            }
            System.out.println("Sound system Y/N: ");
            String sound = input.next();
            if(sound.equalsIgnoreCase("y")){
                MSRP += 3000;
            }
        }
        else if(model.equalsIgnoreCase("y")){
            MSRP = 35000;
            System.out.println("Entertainment package Y/N: ");
            String entertainment = input.next();
            if(entertainment.equalsIgnoreCase("y")){
                MSRP += 8000;

                System.out.println("Safety package Y/N: ");
                String safety = input.next();
                if(safety.equalsIgnoreCase("y")){
                    MSRP += 4000;

                }
            }

        }
        else{
            System.out.println("Only models X - Y.");
        }

        if (MSRP != 0){
            System.out.println("$" + MSRP);
        }
    }
}
