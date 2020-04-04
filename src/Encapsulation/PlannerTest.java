package Encapsulation;

public class PlannerTest {
    public static void main(String[] args) {
        Planner plnr = new Planner();
//        plnr.displayPlanner();
        plnr.addEvent("April 10", "Java String");
        plnr.addEvent("April 7", "Python");
        plnr.addEvent("April 8 ", "Software Testing");
        plnr.addEvent("April 9", "DevOps");
        plnr.displayPlanner();
        plnr.deleteEvent("April 7");
        plnr.displayPlanner();
    }
}
