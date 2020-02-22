package package2_22;

public class IntMethod {
    public static void printHelloWorld(int a){
        int i=0;
        while (i < a) {
            System.out.println("Hello World");
            i++;
        }
    }

    public static void main(String[] args) {
        printHelloWorld(15);
    }

}
