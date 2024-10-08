
public class Shape {
    public void draw(){
        System.out.println("Draw shape");
    }

    public static class Circle extends Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
        public void draw(int radius){
            System.out.println("Draw circle with radius: "+radius);
        }
        public void draw(int radius, int diameter){
            System.out.print("Draw circle with radius: " +radius + " and diameter: "  +diameter);
        }
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
        circle.draw(5);
        circle.draw(5, 10);
    }
}
