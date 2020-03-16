package package3_16;

public class ElectricBillTest {
    public static void main(String[] args) {
        ElectricBill myBill = new ElectricBill(112233, 1, "Member", 100);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.readCounter();
    }
}
