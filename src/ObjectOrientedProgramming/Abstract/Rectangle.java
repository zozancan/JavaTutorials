package ObjectOrientedProgramming.Abstract;

public class Rectangle extends GeometricShapes {
    private double longSide;
    private double shortSide;

    public void info(double longSide, double shortSide) {
        determineName("Rectangle Object");
        this.longSide = longSide;
        this.shortSide = shortSide; //we have identified the details of our rectangle object
    }

    @Override
    public double calculatingArea() {
        return longSide * shortSide; //calculated the area of our rectangle and turned it back
    }
}
