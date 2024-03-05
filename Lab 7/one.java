package deepak;

import java.util.Scanner;

class Shape{
    int getArea(){
        return 0;
    }
}
class Rectangle extends Shape{
    int length;
    int width;
    @Override
    int getArea(){
        return length*width;
    }
}
class Box extends Rectangle{
    int height;
    @Override
    int getArea(){
        return 2*(length*width + width*height + height*length);
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();
        Rectangle r = new Rectangle();
        Box b = new Box();
        
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Width");
        int width = sc.nextInt();
        System.out.println("Enter Height");
        int height = sc.nextInt();
        
        r.length = length;
        r.width = width;
        
        b.length = length;
        b.width = width;
        b.height = height;
        
        System.out.println("Area of shape "+s.getArea());
        System.out.println("Area of Rectanlge "+r.getArea());
        System.out.println("Surface Area of Box "+b.getArea());
        
    }
}
