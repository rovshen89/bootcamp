package string_processing;

public class FirstString {
    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder();
        myString.append("Java ");
        myString.append(" is ");
        myString.append(" fun");
        System.out.println(myString);
        myString.insert(8, " much ");
        System.out.println(myString);
        myString.replace(5,6, "is not");
        System.out.println(myString);

    }
}
