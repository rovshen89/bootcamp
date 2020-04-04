package Encapsulation;

public class RetailStore {
    private String product;
    private int quantity;
    private static int totalQuantity;

    public RetailStore(String product, int quantity){
        this.product = product;
        this.quantity = quantity;
        totalQuantity += this.quantity;
    }

    public void receive(int quan){
        this.quantity += quan;
        totalQuantity += quan;
    }

    public void sell(int quan){
        this.quantity -= quan;
        totalQuantity -= quan;
    }

    public void showQuantity(){
        System.out.println(this.product + " " + this.quantity);
    }

    public static void showTotalQuantity(){
        System.out.println("Total quantity = " + totalQuantity);
    }


}
