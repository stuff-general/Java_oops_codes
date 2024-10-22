//Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes
interface Shape{

    abstract double getArea(double length);
}

class Rectangle implements Shape{
    @Override
    public double getArea(double length) {
        double breadth = 5.0;
        return length*breadth ;
    }
}

class Circle implements Shape{
    @Override
    public double getArea(double length) {
        return 2*3.14*length ;
    }
}

class Triangle implements Shape{
    @Override
    public double getArea(double length) {
        double height = 5.0;
        return 0.5*length*height ;
    }
}

public class Geometry{
    public static void getArea(Shape s,double length){
        double area=s.getArea(length);
        System.out.println("Area of " + s.getClass().getSimpleName() + " with length- " + length + " cm is = "+ area + " square cms");
    }
    public static void main(String[]args){
        double length=2.0;

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        getArea(rectangle,length);
        getArea(circle,length);
        getArea(triangle,length);
    }
}








