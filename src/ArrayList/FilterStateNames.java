package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilterStateNames {
    public static void main(String[] args) {
        String[] names = {"Arizona", "CA", "NV", "Nevada"};
        filterNames(names, "full");
        System.out.println(filterStates(names, "abb"));

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

    public static List<String> filterStates(String[] states, String param){
        List<String> st = new ArrayList<>();
        if (param.equals("abb")){
            for (String state: states){
                if (state.length() == 2){
                    st.add(state);
                }
            }
        }else if (param.equals("full")){
            for (String state: states){
                if (state.length() > 2){
                    st.add(state);
                }
            }
        }else {
            System.out.println("Invalid Parameter");
        }
        return st;
    }
}
