package firstpackage;

public class Align {
    public static void main(String[] args) {
        for(int i = 10; i <= 20; i++){
            System.out.format("%4s \t", i);
        }
        System.out.println();
        for (int i = 100; i <=110; i++){
            System.out.format("%4s\t", i);
        }
    }
}
