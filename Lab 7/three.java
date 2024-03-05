package deepak;

import java.util.Scanner;

class rectangle{
    int length;
    int breadth;
    rectangle(){
        this.length = 1;
        this.breadth = 1;
    }
    rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboid extends rectangle{
    int height;
    cuboid(){
        this.height = 1;
    }
    cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    int volume(){
        return this.length*this.breadth*this.height;
}
}
public class three {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    cuboid obj1 = new cuboid();
    System.out.println(obj1.volume());
    
    int length = sc.nextInt();
    int breadth = sc.nextInt();
    int height = sc.nextInt();
    cuboid obj2 = new cuboid(length, breadth, height);
    System.out.println(obj2.volume());
    }
}
