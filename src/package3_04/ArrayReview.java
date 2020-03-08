package package3_04;

public class ArrayReview {
    public static void main(String[] args) {
        findNumWord("helo hello");
    }

    public static int findNumWord(String sentence){
        int counter = 1;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                counter++;
            }
        }
        return counter;

    }
}

