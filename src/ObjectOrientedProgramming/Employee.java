package ObjectOrientedProgramming;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String department, int salary) {

        super();
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    public void showInfos() {
        System.out.println("Info...");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}