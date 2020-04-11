package ArrayList;

import package2_24.Array;

import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ItemRemoving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java", "SQL", "HTML", "CSS", "Selenium" ));
        System.out.println(myList);
        System.out.print("Enter item to remove: ");
        String item = scanner.next();
        ArrayList<String> newList = new ArrayList<>();
        for (String element: myList){
            if (!element.equals(item)){
                newList.add(element);
            }
        }
        System.out.println(newList);

        System.out.println(removeItem(myList, "Java"));

    }
    public static ArrayList<String> removeItem(ArrayList<String> orgList, String itemRemove){
        ArrayList<String> updateList = new ArrayList<>();
        for (String item: orgList){
            if (!itemRemove.equals(item)){
                updateList.add(item);
            }
        }
        return updateList;
    }

}
