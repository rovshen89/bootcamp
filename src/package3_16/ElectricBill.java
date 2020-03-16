package package3_16;

public class ElectricBill {
    int memberID;
    int counter;
    String name;
    double billAmount;

    public ElectricBill(int memberID, int counter, String name, double billAmount){
        this.memberID = memberID;
        this.counter  = counter;
        this.name = name;
        this.billAmount = billAmount;
    }

    public void displayBill(){
        this.billAmount = this.counter * 1.9;
        System.out.println(this.billAmount);
    }

    public void readCounter(){
        System.out.println(this.counter);
    }

    public void addConsumption(int cons){
        this.counter += cons;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "memberID = " + memberID +
                ", counter = " + counter +
                ", name = '"   + name + '\'' +
                ", billAmount = " + billAmount +
                '}';
    }
}
