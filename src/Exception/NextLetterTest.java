package Exception;

public class NextLetterTest {
    public static void main(String[] args) {
        NextLetter myTxt = new NextLetter();
        System.out.println(myTxt.sentence);
        NextLetter myTxt2 = new NextLetter("test");
        myTxt2.printNextLetter();
    }
}
