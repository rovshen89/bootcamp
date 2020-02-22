package package2_22;

public class MultiTableMethod {
    public static void multiTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\t\t" + i);
        }
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        for (int j = 1; j < 10; j++) {
            System.out.print(j + ":");
            for (int n = 1; n <= 10; n++) {
                System.out.print("\t\t" + j * n);
            }
            System.out.println("\n");
        }


    }

    public static void main(String[] args) {
        multiTable();
    }
}
