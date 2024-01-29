class circle{
    int r;
    void areaofcicle(int r){
        System.out.println("area of cicle is:"+Math.PI*r*r);
    }
    void circumference(int r){
        System.out.println("circumference of circle is:"+Math.PI*2*r);
    }
}
class rectangle{
    int a,b;
    void area(int a,int b){
        System.out.println("area of rectangle is:"+a*b);
    }
    void perimeter(int a,int b){
        System.out.println("perimeter of rectangle is:"+2*(a+b));
    }
    void area(int a){
        System.out.println("area of square is:"+a*a);
    }
    void perimeter(int a){
        System.out.println("perimeter of square is:"+2*(a+a));
    }
}
public class lab3_program1 {
    public static void main(String []args){
        circle c=new circle();
        c.areaofcicle(4);
    }
}
