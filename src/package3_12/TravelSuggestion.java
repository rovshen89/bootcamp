package package3_12;

import java.util.Scanner;

public class TravelSuggestion {
    public static void main(String[] args) {
        suggestDestination();
    }

    public static void suggestDestination(){
        Scanner myScan = new Scanner(System.in);
        String destination = "";
        System.out.println("Sea or Mountain: ");
        String answer = myScan.nextLine();
        if (answer.equalsIgnoreCase("sea")){
            System.out.println("East or West: ");
            answer = myScan.nextLine();
            if (answer.equalsIgnoreCase("east")){
                destination = "Florida";
            }else if (answer.equalsIgnoreCase("west")){
                destination = "California";
            }else{
                System.out.println("Wrong input");
            }

        }
        else if (answer.equalsIgnoreCase("mountain")){
            System.out.println("Midland or North: ");
            answer = myScan.nextLine();
            if (answer.equalsIgnoreCase("midland")){
                destination = "Kansas";
            }else if (answer.equalsIgnoreCase("north")){
                destination = "Vermont";
            }else{
                System.out.println("Wrong input");
            }

        }else{
            System.out.println("Wrong input");
        }
        System.out.println(destination);
    }
}
