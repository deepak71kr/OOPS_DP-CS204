package deepak;

import java.util.Scanner;

class Circle{
    double radius;
    double area(){
        return 3.14*radius*radius;
    }
    void set_width(double radius){
       this.radius = radius;
    }
    double perimeter(){
        return 2.0*3.14*radius;
    }
    double circumference(){
        return 2.0*3.14*radius;
    }
}
class Cylinder extends Circle{
    double height;
    double volume(){
        double aa = this.area();
        return aa*height;
    }
}
public class two {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Cylinder c = new Cylinder(); 
       System.out.println("Enter radius");
       c.set_width(sc.nextDouble());
       System.out.println("Enter height");
       c.height = sc.nextDouble();
       System.out.printf("Area of cylinder is : %.2f%n", c.area());
       System.out.printf("Volume of cylinder is : %.2f%n", c.volume());
    }
}
