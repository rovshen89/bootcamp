package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoDArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myArr = new ArrayList<>();
        int number  = 1;
        for (int i = 0; i < 5; i++){
            myArr.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                myArr.get(i).add(number);
                number++;
            }
        }

        System.out.println(myArr);

        for (ArrayList<Integer> numb: myArr){
            for (int sublist: numb){
                System.out.print(sublist + " ");
            }
        }

        Iterator<ArrayList<Integer>> it = myArr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
