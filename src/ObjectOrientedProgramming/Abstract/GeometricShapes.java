package ObjectOrientedProgramming.Abstract;

public abstract class GeometricShapes {
    private String name;

    public void determineName(String name) {
        this.name = name; //we have determined the name of our geometric shape
    }

    public String bringName() {
        return this.name; // this method will return the name of our shape
    }

    public abstract double calculatingArea(); //we defined our abstract method
}
