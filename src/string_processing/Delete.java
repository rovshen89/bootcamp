package string_processing;

import java.awt.font.FontRenderContext;

public class Delete {
    public static void main(String[] args) {
        String s = "madam";
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) == s.charAt(i)){
                    System.out.println("palindrome");
                }else{
                    System.out.println("not palindrome");
                }
            }
            System.out.println();
        }


    }
}
