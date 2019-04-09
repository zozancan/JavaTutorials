package ObjectOrientedProgramming.Interface;

public class InterfaceExample {
    public static void main(String[] args) {

        //writing information about intern
        Intern intern = new Intern();
        intern.workingPart();
        intern.setFee(765.70);
        System.out.println("Salary : " + intern.fee());


        //writing information about director
        Director director = new Director();
        director.workingPart();
        director.setFee(5519.58);
        System.out.println("Salary : " + director.fee());

        //writing information about sales person
        SalesPerson sales = new SalesPerson();
        sales.workingPart();
        sales.setFee(989.85);
        sales.setSalesCommission(250);
        System.out.println("Commission : " + sales.commission);
        System.out.println("Salary : " + sales.fee());
    }


}
