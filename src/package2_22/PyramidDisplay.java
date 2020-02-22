package package2_22;

public class PyramidDisplay {
    public static void displayPyramid(int numberOfLines){
        for(int i = 1; i < numberOfLines; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPyramid(10);
    }
}
