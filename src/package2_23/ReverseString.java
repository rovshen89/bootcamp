package package2_23;

public class ReverseString {
    public static void reverseString(String input){
        for (int i = input.length(); i > 0; i--){
            System.out.print(input.charAt(i -1));
        }
    }

    public static void main(String[] args) {
        reverseString("input");
    }
}
