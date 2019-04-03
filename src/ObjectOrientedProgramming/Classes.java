package ObjectOrientedProgramming;

public class Classes {

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("Silver");
        car1.setModel("Renault Megane");
        car1.setEngine(1.6);
        car1.setDoors(4);

        System.out.println("Color of car :" + car1.getColor());
        System.out.println("Model of car :" + car1.getModel());
        System.out.println("Engine of car :" + car1.getEngine());
        System.out.println("Doors of car :" + car1.getDoors());
        car1.start();
        car1.stop();


    }

}
