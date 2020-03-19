package package3_18;

public class InterviewTest {
    public static void main(String[] args) {
        Interview candidate1 = new Interview("Rovshen", 100, 100, 100);
        System.out.println(candidate1.toString());
        System.out.println(candidate1.decideResult());
        candidate1.calculateScore();
        System.out.println(candidate1.calculateScore());
        System.out.println(candidate1.decideResult());
    }
}
