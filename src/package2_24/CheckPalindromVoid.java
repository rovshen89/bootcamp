package package2_24;

public class CheckPalindromVoid {
    public static void checkPal(String pal){
    String reversed = "";
    for (int i = pal.length() - 1; i >= 0; i--){
        reversed += pal.charAt(i);
    }
    if (reversed.equals(pal)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }

    }

    public static void main(String[] args) {
        checkPal("madam");
    }
}
