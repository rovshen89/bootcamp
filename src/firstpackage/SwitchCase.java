package firstpackage;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = scanner.nextInt();
        String monthText = null;
        switch (month){
            case 1:
                monthText = "January";
                break;
            case 2:
                monthText = "February";
                break;
            case 3:
                monthText = "March";
                break;
            case 4:
                monthText = "April";
                break;
            case 5:
                monthText = "May";
                break;
            case 6:
                monthText = "June";
                break;
            case 7:
                monthText = "July";
                break;
            case 8:
                monthText = "August";
                break;
            case 9:
                monthText = "September";
                break;
            case 10:
                monthText = "October";
                break;
            case 11:
                monthText = "November";
                break;
            case 12:
                monthText = "December";
                break;
            default:
                System.out.println("Only 1-12");
                break;
        }
        System.out.println(monthText);
    }
}
