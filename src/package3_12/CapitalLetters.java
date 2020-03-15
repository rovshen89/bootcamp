package package3_12;

public class CapitalLetters {
    public static void main(String[] args) {
        countCapitals("It is Time to Review");
    }

    public static void countCapitals(String sentence){
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) > 64 && sentence.charAt(i) < 92){
                counter++;
            }
        }
        System.out.println("Total there are " + counter + " capital letters");
    }
}
