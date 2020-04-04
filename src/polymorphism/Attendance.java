package polymorphism;

public class Attendance {
    String students[];
    int studentId[];
    int weekly[][];
    final String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri"};

    public Attendance(String students[], int studentId[]){
        this.students = students;
        this.studentId = studentId;
        int[][] weeklyEmpty = new int[5][students.length];
        this.weekly = weeklyEmpty;
    }
}
