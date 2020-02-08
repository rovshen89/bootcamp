package firstpackage;

public class StringComparison {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";

        if(a.equals(b)){
            System.out.println("Hello");
        }

        String c = new String("x");
        String d = new String("x");

        if(c.equals(d)){
            System.out.println("World");
        }
        // use .equals() method to compare strings....
    }
}
