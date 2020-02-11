package firstpackage;

public class NestedIf {
    public static void main(String[] args) {
        int x = 1;
        int y = -4;

        if(x == 1){
            System.out.println("1st message");
            if(y > 0){
                System.out.println("2nd message?");
            }
            System.out.println("3rd message");
        }
    }
}
