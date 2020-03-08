package package3_07;

public class ReverseString {
    public static String reverse(String text){
        if (text.length() == 1){
            return text;
        }else{
            String result = "";
            result = text.charAt(text.length()-1) + reverse(text.substring(0, text.length()-1));
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse("text"));
    }
}
