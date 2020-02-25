package package2_24;

public class RemoveSameChar {
    public static String removeCons(String s){
        String original = s.substring(s.length());
        String removed = s.substring(s.length() - 1);

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == original.charAt(i)){
                return original;
            }
        }return s;
    }

    public static void main(String[] args) {
        System.out.println(removeCons("eleellelo"));
    }
}
