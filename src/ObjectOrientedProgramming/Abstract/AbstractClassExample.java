package ObjectOrientedProgramming.Abstract;

public class AbstractClassExample {

    public static void main(String[] args) {
        Circle circleObject = new Circle();
        Rectangle rectangleObject = new Rectangle();
        Triangle triangleObject = new Triangle();
        //we created our objects

        circleObject.info(5.0);
        System.out.println(circleObject.bringName() + ": ");
        System.out.println(circleObject.calculatingArea());
        //We have calculated the area of the circle

        rectangleObject.info(5.0, 3.0);
        System.out.println(rectangleObject.bringName() + ": ");
        System.out.println(rectangleObject.calculatingArea());
        //We have calculated the area of the rectangle

        triangleObject.info(4.0, 3.0);
        System.out.println(triangleObject.bringName() + ": ");
        System.out.println(triangleObject.calculatingArea());
        //We have calculated the area of the triangle
    }
}
