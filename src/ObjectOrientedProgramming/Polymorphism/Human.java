package ObjectOrientedProgramming.Polymorphism;

public class Human {
    int height;
    int weight;

    public Human() {

    }

    public Human(int height, int weight) {
        if (height > 0 && weight > 0) {
            System.out.println("A new human formed.");
        }
        void eat () {
            weight++;
        }
    }

    public void eat() {

    }
}
