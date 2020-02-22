package package2_22;

public class ListAscii {
    public static void printASCII(){
        for(int i = 0; i < 256; i++){
            System.out.println((char)i);
        }
    }

    public static void main(String[] args) {
        printASCII();
    }
}
