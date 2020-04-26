package collections;

import package2_24.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Array10x10 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                list.get(i).add((int)(Math.random()*100));
            }
        }

        Iterator<ArrayList<Integer>> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        multiplyWithConst(list, 2);

    }

    public static void multiplyWithConst(ArrayList<ArrayList<Integer>> arr, int constant){
        int result;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size(); j++){
                result = arr.get(i).get(j) * constant;
                arr.get(i).set(j, result);
            }
        }

        Iterator<ArrayList<Integer>> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
