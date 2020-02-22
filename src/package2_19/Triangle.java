package package2_19;

public class Triangle {
    public static void main(String[] args) {
        int i = 0; int j = 0;
        for(i = 0; i <10; i++){
            for (j = 0; j < i; j = j +j){
                System.out.print("* \t");
            }
            System.out.println();
        }
    }
}
