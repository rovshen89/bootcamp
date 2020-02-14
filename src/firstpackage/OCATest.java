package firstpackage;

public class OCATest {
    public static void main(String[] args) {
        int x = 4;
        long y = x * 4 - x++;
        if(y<10){
            System.out.println("Too low");
        }
        else {
            System.out.println("just right");
        }
        System.out.println("too hugh");
    }
}
