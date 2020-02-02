package firstpackage;

public class JavaSecondLesson {
    public static void main(String[] args) {
       String[] name = new String[]{"John", "Kimberley"};
       String grade = "A";
        System.out.println("Name \t\t Grade");
        System.out.println("------- \t  -------");
        System.out.format(name[0] + ": \t\t\t\"%s\"\n", grade);
        System.out.format(name[1] + ": \t\t\"%s\"", grade);

    }
}
