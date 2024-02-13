package five;
import java.util.Scanner;
class Student2{
    String name;
    int roll;
    int fee;
    
    Student2(String name,int roll, int fee){
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
    Student2(){
        this("uknown",00,0000);
    }
    Object objj(){
        return this;
    }
    void show(Object obj){
        System.out.println("This has been shown");
    }
    void display(){
        show(objj());
        System.out.println("Name: "+this.name);
        System.out.println("Roll: "+this.roll);
        System.out.println("Fee: "+this.fee);
        System.out.println("");
    }
}
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name; int roll; int fee;
        System.out.println("Enter for Student 01");
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Roll:");
        roll = sc.nextInt();
        System.out.println("Fee:");
        fee = sc.nextInt();
        Student2 s1 = new Student2(name,roll,fee);
        
        Student2 s2 = new Student2();
        
        s1.display();
    }
}
