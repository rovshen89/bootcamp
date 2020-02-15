package firstpackage;
import java.util.Scanner;

public class OCATest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start=number.nextInt();
        System.out.println("Enter ending number: ");
        int end=number.nextInt();
        for (int j=start; j<=end; j++){
            System.out.print("\t\t" + j);
        }
        System.out.println('\n');
        for (int x=start; x<=end; x++) {
            System.out.print("--------");
        }
        System.out.println('\n');
        for (int i=start; i<=end; i++) {
            System.out.print(i+"\t|");
            for (int j=start; j<=end; j++){
                System.out.print("\t" + (i * j) + "\t");
            }
            System.out.println('\n');
        }
    }
}
