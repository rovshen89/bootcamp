package package3_12;

public class DecisionString {
    public static void main(String[] args) {
        decideString("It Is Time to Review java");


    }

    public static int countAllCapitals(String sentence){
        int numberOfCapitals = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) > 64 && sentence.charAt(i) < 92){
                numberOfCapitals++;
            }
        }
        return numberOfCapitals;
    }

    public static void decideString(String sentence){
        int numCapitals = countAllCapitals(sentence);
        if (numCapitals > 4){
            System.out.println("Accepted");
        }else{
            System.out.println("Rejected");
        }
    }
}


