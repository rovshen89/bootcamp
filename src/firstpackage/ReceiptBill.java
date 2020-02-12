package firstpackage;

import java.util.Scanner;

public class ReceiptBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ID = {123, 124, 125, 126, 127};
        double[] price = {2.49, 4.79, 1.65, 7.88, 0.99};
        double total = 0;

        System.out.println("Please enter item ID: ");
        int itemID = input.nextInt();

        if(itemID == 123 ){
            System.out.println("Please enter quantity: ");
            int quantity = input.nextInt();
            total = price[0] * quantity;
        }
        System.out.print("Item ID       Quantity           Price\n");
        System.out.print("---------------------------------------\n");
        System.out.println(total);
//        System.out.format("TOTAL          %d          %d$", quantity, total);



    }
}
