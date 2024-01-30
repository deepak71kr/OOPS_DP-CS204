package four;
import java.util.*;

public class six {
    public static class Shape {
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

        public void display() {
            System.out.println("Length: " + this.length);
            System.out.println("Width: " + this.width);
            System.out.println("Area: " + calcArea());
        }
    }
    public static void main(String[] args) {
        Shape sq = new six.Shape(5);
        sq.display();

        Shape rect = new six.Shape(5, 10);
        rect.display();
    }
}
