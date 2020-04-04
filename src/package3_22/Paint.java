package package3_22;

public class Paint {
    protected String colorName;
    protected double squareFeet;
    protected double totalPrice;

    public Paint(String colorName, double squareFeet, double totalPrice){
        this.colorName = colorName;
        this.squareFeet = squareFeet;
        this.totalPrice = totalPrice;
    }

    double calculatePrice(){
        double totaPirce = this.squareFeet / 100 * 32.99;
        this.totalPrice = totaPirce;
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", squareFeet=" + squareFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
