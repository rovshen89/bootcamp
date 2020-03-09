package package3_08;

public class RemoveSpace {
    public static void main(String[] args) {
            spaceRemove("hello good bye bye");
    }

    public static void spaceRemove(String text){
        char dash = '_';
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                text = text.replace(' ', '-');
            }
        }
        System.out.println(text);
    }
}
