package ObjectOrientedProgramming.Abstract;

public class Triangle extends GeometricShapes {
    private double height;
    private double base;

    public void info(double height, double base) {
        determineName("Triangle Object");
        this.height = height;
        this.base = base; //we have identified the details of our triangle object
    }

    @Override
    public double calculatingArea() {
        return (base * height) / 2; //calculated the area of our triangle and turned it back
    }
}
