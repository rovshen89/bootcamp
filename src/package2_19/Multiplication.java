package package2_19;

public class Multiplication {
    public static void main(String[] args) {
        for (int row = 1; row < 11; row++){
            for(int columns = 1; columns < 11; columns++){
                System.out.print(row * columns + "\t");
            }
            System.out.println();
        }
    }
}
