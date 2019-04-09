package ObjectOrientedProgramming.Polymorphism;

public class Engineer extends Human {
    int salary;

    public Engineer() {
        this(7000);
    }

    public Engineer(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 7000;
        }
    }

    public Engineer(int salary, int height, int weight) {
        super(height, weight);
    }

    int raise() {
        salary++;
        return salary;
    }

    //overloading
    int raise(int raiseAmount) {
        salary += raiseAmount;
        return salary;
    }

    int raise(float raiseRate) {
        float increase = raiseRate * salary;
        raise((int) increase);
        return salary;
    }

    //overriding
    public void eat() {
        weight = weight + 2;
    }

    void eat(int weight) {
        this.weight += weight;
    }
}
