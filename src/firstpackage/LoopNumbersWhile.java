package firstpackage;

public class LoopNumbersWhile {
    public static void main(String[] args) {
        int number = 1;
        int count;
        for(int i = 1; i <= 3; i++){
            count = 1;
            while(count < 6){
                System.out.print(number + "\t\t");
                count++;
                number++;
            }
            System.out.println();

        }
    }
}
