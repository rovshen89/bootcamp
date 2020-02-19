package codingbat;

import java.awt.*;
import java.util.Scanner;

public class LastString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.next();

        String last = str.substring(str.length() - 1);
        System.out.println(last + str + last);

    }
}
