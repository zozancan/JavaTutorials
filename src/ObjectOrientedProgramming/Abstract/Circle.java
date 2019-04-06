package ObjectOrientedProgramming.Abstract;

public class Circle extends GeometricShapes {
    private double radius;
    private double pi = Math.PI;

    public void info(double radius) {
        determineName("Circle Object");
        this.radius = radius; //we have identified the details of our circle object
    }

    @Override
    public double calculatingArea() {
        return pi * Math.sqrt(radius); //calculated the area of our circle and turned it back
    }

}
