package five;
import java.util.Scanner;
class Student{
    String name;
    int roll;
    int fee;
    
    Student(String name,int roll, int fee){
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll: "+this.roll);
        System.out.println("Fee: "+this.fee);
        System.out.println("");
    }
}

public class one {
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
        Student s1 = new Student(name,roll,fee);
        
        System.out.println("Enter for Student 02");
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Roll:");
        roll = sc.nextInt();
        System.out.println("Fee:");
        fee = sc.nextInt();
        Student s2 = new Student(name,roll,fee);
        
        s1.display();
        s2.display();
    }
}
