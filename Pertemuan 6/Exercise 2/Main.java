// Main class to test the classes
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(2.5, "blue", true);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5.0);
        System.out.println(square);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}




