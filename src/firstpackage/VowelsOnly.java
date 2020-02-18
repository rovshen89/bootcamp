package firstpackage;

public class VowelsOnly {
    public static void main(String[] args) {
        String myStr = "Java is fun";
        for (int index = 0; index < myStr.length(); index++){
            if (myStr.charAt(index) == 'a' || myStr.charAt(index) == 'u' || myStr.charAt(index) == 'i'){
                System.out.println(myStr.charAt(index));
            }
        }
    }
}
