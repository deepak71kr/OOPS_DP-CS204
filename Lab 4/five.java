package four;
import java.util.*;
public class five {
    public static class Shape{
        int length;
        int width;

        public Shape(int... dimns) {
            if (dimns.length == 1) {
                this.length = dimns[0];
                this.width = dimns[0];
            } else if (dimns.length == 2) {
                this.length = dimns[0];
                this.width = dimns[1];
            }
        }

        public int calcArea() {
            return this.length*this.width;
        }
        public void displayShape() {
            System.out.println("Length: " + this.length);
            System.out.println("Width: " + this.width);
            System.out.println("Area: " + calcArea());
        }
    }

    public static void main(String[] args) {
        Shape square = new Shape(5);
        square.displayShape();
        
        System.out.println("\n");
        
        Shape rectangle = new Shape(5, 10);
        rectangle.displayShape();
    }
}
