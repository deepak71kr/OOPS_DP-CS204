package five;
import java.util.Scanner;
class Shape{
    int x;
    int getArea(){
        return 0; 
    }
}
class Rectangle extends Shape{
    int l;
    int b;
    @Override
    int getArea(){
        return l*b;
    }
}
class Box extends Rectangle{
    int h;
    @Override
    int getArea(){
        return l*b*h;
    }
}
public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Shape s = new Shape();
        System.out.println("Shape area: "+s.getArea());
        
        Rectangle r = new Rectangle();
        System.out.println("(Rectanlge) Enter length:");
        r.l = sc.nextInt();
        System.out.println("(Rectanlge) Enter Breadth:");
        r.b = sc.nextInt();
        System.out.println("Rectangle area: "+r.getArea());
        
        Box b = new Box();
        System.out.println("(Box) Enter length:");
        b.l = sc.nextInt();
        System.out.println("(Box) Enter Breadth:");
        b.b = sc.nextInt();
        System.out.println("(Box) Enter height:");
        b.h = sc.nextInt();
        System.out.println("Box Surface area: "+b.getArea());
        
    }
}
