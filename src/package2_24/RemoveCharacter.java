package package2_24;

public class RemoveCharacter {
    public static void removeChar(String word, char c){
        String result = "";

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) != c){
                result += word.charAt(i);
            }
            System.out.print(result);
        }

    }

    public static void main(String[] args) {
    removeChar("hello", 'e');
    }
}
