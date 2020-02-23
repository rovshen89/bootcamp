package package2_23;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
//        String
    }
    public static void passCheck(String password){
        if(password.length() < 6){
            System.out.println("Not good");
        }else{
            System.out.println("ok");
        }
    }

    public static String passwordCheck(String password){
        String result;
        if (password.length() >= 6){
            result = "ok";
        }else{
            result = "not good";
        }
        return result;


    }
    public static boolean isPasswordGood(String password){
        boolean result;
        if (password.length() < 6){
            result = true;
        }else{
            result = false;
        }
        return result;

    }
}
