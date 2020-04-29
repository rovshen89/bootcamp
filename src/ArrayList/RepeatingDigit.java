package ArrayList;

public class RepeatingDigit {
    public static void main(String[] args) {
        String test = "1234123456234234456123";
        findRepeating(test);
    }

    public static void findRepeating(String numbers){
        for (int i = 0; i < numbers.length()-2; i++){
            System.out.println(numbers.substring(i, i+3));
        }

    }
}
