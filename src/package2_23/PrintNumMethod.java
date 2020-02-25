package package2_23;

public class PrintNumMethod {
    public static void printNum(){
        int start = 100;
        while(start <= 1000){
            System.out.println(start);
            start++;
        }
    }

    public static void charANdASC(){
        for (int i = 0; i < 256; i++){
            System.out.println("Characters: " + (char)i);
        }
    }

    public static void main(String[] args) {
        printNum();
        charANdASC();
    }
}
