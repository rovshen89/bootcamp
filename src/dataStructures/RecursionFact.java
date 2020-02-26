package dataStructures;

public class RecursionFact {
    public static long factor (long n){         //Factorial recursive
        if(n <= 1){
            return 1;
        }else{
            return n * factor(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factor(5));
    }

}
