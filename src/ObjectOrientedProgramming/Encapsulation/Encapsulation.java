package ObjectOrientedProgramming.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 2; //it's error because rollNumber and name are private!
        s1.name = "Zozan";

        System.out.println(s1.getRollNumber());
        System.out.println(s1.getName());


    }
}
