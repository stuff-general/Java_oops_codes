/*Implement program for a geometric shapes application
that utilizes function overloading for calculating properties such as area and perimeter.
Implement overloaded methods for computing area and perimeter for different shapes (e.g.,
rectangles, circles, triangles) with varying sets of parameters.*/
class GeometricShapes {
    public double area(double width, double height) {
        return width * height;
    }
    public double area(double radius) {
        return Math.PI * radius * radius; // Circle area
    }
    public double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter(double width, double height) {
        return 2 * (width + height); // Rectangle perimeter
    }

    public double perimeter(double radius) {
        return 2 * Math.PI * radius; // Circle perimeter
    }

    public double perimeter(double a, double b, double c) {
        return a + b + c; // Triangle perimeter
    }

    public static void main(String[] args) {
        GeometricShapes shapes = new GeometricShapes();

        // Rectangle
        double rectangleWidth = 25;
        double rectangleHeight = 10;
        System.out.println("Rectangle Area: " + shapes.area(rectangleWidth, rectangleHeight));
        System.out.println("Rectangle Perimeter: " + shapes.perimeter(rectangleWidth, rectangleHeight));

        // Circle
        double circleRadius = 70;
        System.out.println("Circle Area: " + shapes.area(circleRadius));
        System.out.println("Circle Perimeter: " + shapes.perimeter(circleRadius));

        // Triangle
        double side1 = 30;
        double side2 = 40;
        double side3 = 50;
        System.out.println("Triangle Area: " + shapes.area(side1, side2, side3));
        System.out.println("Triangle Perimeter: " + shapes.perimeter(side1, side2, side3));
    }
}
