package package3_15;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(999, "Name", "QA", 120000, "FT");
        System.out.println(employee.calculateBiWeeklyPay());
        System.out.println(employee.calculateWeeklyPay());
        System.out.println(employee.toString());

        Employee rovshen = new Employee(777, "Rovshen", "Head", 250_000, "FT");
        System.out.println(rovshen.calculateBiWeeklyPay());
        System.out.println(rovshen.toString());
    }
}
