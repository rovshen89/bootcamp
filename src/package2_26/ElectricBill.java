package package2_26;

public class ElectricBill {
    public static String decideElecBill(int consumption){
        String decision;
        if (consumption >= 500 && consumption <=1000){
            decision = "Good job";
        }else if (consumption > 1000 && consumption <=1500){
            decision = "Not bad";
        }else {
            decision = "Start saving energy";
        }
        return decision;

    }

    public static void main(String[] args) {
        System.out.println(decideElecBill(460));
    }

}
