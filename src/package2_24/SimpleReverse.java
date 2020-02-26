package package2_24;

public class SimpleReverse {
    public static void simpleStringrev(String text){
        String reversed = "";
        for (int i = text.length()-1; i >=0; i--){
            reversed += text.charAt(i);
        }
        if (reversed.equals(text)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
//        System.out.println(reversed);
    }

    public static void main(String[] args) {
        simpleStringrev("racecar");
    }

}
