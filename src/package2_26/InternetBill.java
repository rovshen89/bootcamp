package package2_26;

public class InternetBill {
    public static void main(String[] args) {
        System.out.println(intBill(250));
    }

    public static String intBill(int speed){
        String result;
        if (speed >= 100 && speed < 300){
            result = "Good speed";
        }else if (speed > 300){
            result = "Super speed";
        }else{
            result = "Wrong speed";
        }
        return result;
    }
}
