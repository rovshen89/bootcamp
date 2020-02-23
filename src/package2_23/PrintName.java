package package2_23;

public class PrintName {
    public static void main(String[] args) {
        System.out.println("My name....");
        printMyName();
        printString("Hello world");
        String something = printMyString();
        System.out.println(something);
    }

    public static void printMyName(){
        System.out.println("is ROvshen.");
    }

    public static void printString(String name){
        System.out.println(name);
    }

    public static String printMyString(){
        return "Some string";
    }

}
