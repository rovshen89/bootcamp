package firstpackage;

public class LoopLetter {
    public static void main(String[] args) {
    char letters = 'a';
    for(int i = 1; i <= 5; i++ ){
        System.out.print(i+"\t");
//        letters++;
        for (letters = 'a'; letters <= 'e'; letters++ ){
            System.out.print(letters + "\t");
            letters++;
        }
        System.out.println();
    }
    }
}
