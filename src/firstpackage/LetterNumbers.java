package firstpackage;

public class LetterNumbers {
    public static void main(String[] args) {
//        String number = "1241D343F";
        char letter = 'a';
        for (int i = 1; i < 6; i++){
            System.out.print(i + "\t");
//            i++;
            for (int j = 0; j < 4; j++ ){
                System.out.print(letter + "\t");
                letter++;
            }
            System.out.println();
        }


    }
}
