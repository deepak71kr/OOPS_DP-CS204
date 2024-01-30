package four;
import java.util.*;
public class six {
    public static class Shape {
        int length;
        int width;
        private Shape(int length, int width) {
            this.length = length;
            this.width = width;
        }
        public static Shape createSq(int side) {
            return new Shape(side, side);
        }
        public static Shape createRect(int length, int width) {
            return new Shape(length, width);
        }
        public int calArea() {
            return this.length*this.width;
        }
        public void display() {
            System.out.println("Length: " + this.length);
            System.out.println("Width: " + this.width);
            System.out.println("Area: " + calArea());
        }
    }
    public static void main(String[] args) {
        Shape sq = Shape.createSq(5);
        sq.display();

        Shape rect = Shape.createRect(5, 10);
        rect.display();
    }
}
