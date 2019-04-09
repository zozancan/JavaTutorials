package ObjectOrientedProgramming.Inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Employee employee = new Employee("Ducan Delins", "Software", 7000);

        employee.showInfos();

        Manager manager = new Manager("Susan Canon", "Product Owner", 15000, 20);
        manager.showInfos();
        manager.raiseSalary(100);

        System.out.println(manager);


    }
}
