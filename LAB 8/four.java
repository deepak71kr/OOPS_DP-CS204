package eight;

import java.util.Scanner;

interface Person {
    String ORG = "Voyager";
    int AGE = 60;
    void introduce();  
}
class Employee implements Person {
    private String name;
    private int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("Hello, I am " + name + ", working at " + Person.ORG);
    }
}
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        System.out.println("Organization: " + Person.ORG);
        System.out.println("Retirement Age: " + Person.AGE);
        
        Employee employee = new Employee(s,a);
        employee.introduce();
    }
}
