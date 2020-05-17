package package2_23;

public class CheckPalindrome {
    public static boolean checkPalindrome(String inputString){
        int i = 0;
        int s = inputString.length() - 1;

        while (i < s){
            if (inputString.charAt(i) != inputString.charAt(s))
                return false;
                i++;
                s--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("madam"));
    }
}
