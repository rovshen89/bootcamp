package codingbat;

import javax.swing.*;
import java.util.Scanner;

public class Return3String {
    public static void main(String[] args) {
        //Return given strings first 3 letters 3 copies;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String front = " ";
        if(str.length() > 3){
            front = str.substring(0,3);
            System.out.println(front+front+front);
        }else if (str.length() <= 3){
//            front = str;
            System.out.println(str);
        }
    }
}
