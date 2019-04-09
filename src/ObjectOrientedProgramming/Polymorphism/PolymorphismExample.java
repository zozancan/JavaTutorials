package ObjectOrientedProgramming.Polymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {
        Human okan = new Human();
        Engineer atakan = new Engineer(20000, 180, 80);
        atakan.height = 180;
        System.out.println(atakan.height);
        atakan.weight = 90;
        atakan.eat();
        System.out.println(atakan.weight);
        //atakan.salary = 10000;
        atakan.raise((float) 0.50);

        System.out.println(atakan.salary);
        okan.weight = 80;
        okan.eat();
        System.out.println(okan.weight);

    }
}
