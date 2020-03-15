package package3_15;

public class Employee {
    int employeeID;
    String name;
    String department;
    double salary;
    String contractType;

    public Employee(){
        this.employeeID = 1;
        this.name = "Worker";
        this.department = "HR";
        this.salary = 120_000;
        this.contractType = "FT";
    }

    public Employee(int employeeID, String name, String department, double salary, String contractType){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.contractType = contractType;
    }

    public double calculateWeeklyPay(){
        double weekly = this.salary/52;
        return weekly;
    }

    public double calculateBiWeeklyPay(){
        double biWeekly = this.salary/26;
        return biWeekly;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", contractType='" + contractType + '\'' +
                '}';
    }

}
