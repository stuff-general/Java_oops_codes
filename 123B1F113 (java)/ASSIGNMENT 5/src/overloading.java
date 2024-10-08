import java.util.Scanner;
public class overloading {
    public static void main(String[] args) {
        double radius;
        double length;
        double breadth;
        double height;
        double base;
        double area1;
        Scanner sc = new Scanner(System.in);
        overloading o1 = new overloading();
        calculator c1= new calculator();

        System.out.println("Enter radius:");
        radius = sc.nextInt();
        double result = c1.area(radius);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter breadth:");
        breadth = sc.nextInt();
        double result1 = c1.area(length, breadth);
        System.out.println("Enter base:");
        base = sc.nextInt();
        System.out.println("Enter height:");
        height = sc.nextInt();
        double result2 = c1.area(base, height);
        System.out.println("Area of the circle: " + result);
        System.out.println("Area of the rectangle is: " + result1);
        System.out.println("Area of the triangle is: " + result2);
    }

    public class calculator {

        public double area(double radius) {
            double area1 = 3.14 * radius * radius;
            return area1;
        }

        public double area(double length, double breadth) {

            double area1 = length * breadth;
            return area1;
        }

        public double area(int base, int height) {
            double area1 = 0.5 * base * height;
            return area1;
        }
    }
}

