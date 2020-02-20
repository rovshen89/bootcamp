package codingbat;

import java.util.Scanner;

public class StartHi {
    public boolean StartHi(String[] args) {
        //Given a string, return true if the string starts with "hi" and false otherwise.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.next();

        if(str.length() < 2)
            return false;

        String firstTwo = str.substring(0,2);

        if(firstTwo.equalsIgnoreCase("hi")){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

    }

}
