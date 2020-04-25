package ArrayList;

import java.util.HashSet;

public class FilterStateNames {
    public static void main(String[] args) {
        String[] names = {"Arizona", "CA", "NV", "Nevada"};
        filterNames(names, "full");

    }
    public static void filterNames(String[] name, String param){
        HashSet<String> set = new HashSet<>();

        if (param.equals("abb")){
            for (String states: name){
                if (states.length() == 2){
                    System.out.println(states);
                }
            }
        }else if(param.equals("full")){
            for (String states: name){
                if (states.length() > 2){
                    System.out.println(states);
                }
            }
        }else{
            System.out.println("Invalid Parameter");
        }
    }
}
