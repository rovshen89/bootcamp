package Encapsulation;

public class ExpoPlannerTest {
    public static void main(String[] args) {
        ExpoPlanner expo1 = new ExpoPlanner();
        expo1.listAll();
        expo1.addEvent("April 9", "Uncle birthday");
        expo1.addEvent("April 15", "Sister birthday");
        expo1.listAll();
        expo1.deleteEvent("April 9");
    }
}
