package ObjectOrientedProgramming.Encapsulation;

//Encapsulation -> Binding data with methods
public class Student {
    private int rollNumber;
    private String name;

    //Getters and Setters


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 2; //it's error because rollNumber and name are private!
        s1.name = "Zozan";

        System.out.println(s1.getRollNumber());
        System.out.println(s1.getName());


    }
}
