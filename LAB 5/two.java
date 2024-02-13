package five;
import java.util.Scanner;
class Student1{
    String name;
    int roll;
    int fee;
    
    Student1(String name,int roll, int fee){
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
    Student1(){
        this("unknown",00,0000);
    }
    void show(Object obj){
        System.out.println("This has been shown");
    }
    void display(){
        show(this);
        System.out.println("Name: "+this.name);
        System.out.println("Roll: "+this.roll);
        System.out.println("Fee: "+this.fee);
        System.out.println("");
    }
}
public class two {
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
        Student1 s1 = new Student1(name,roll,fee);
        
        Student1 s2 = new Student1();
        
        s1.display();
        s2.display();
    }
}
