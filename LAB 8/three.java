package eight;
import java.util.*;
abstract class Shape {
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double perimeter() {
        return 2 * 3.14 * radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
    double area() {
        return length * breadth;
    }
}
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rectangle = new Rectangle(a,b);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Circle circle = new Circle(a);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}