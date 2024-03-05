package deepak;
class person {
    String name;
    int age;
    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class student extends person {
    int roll;
    int marks;
    student(String name, int age, int roll, int marks) {
        super(name, age);
        this.roll = roll;
        this.marks = marks;
    }
    void display() {
        super.display();
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}
class employee extends person {
    double salary;
    employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
public class six {
    public static void main(String[] args) {
        student student = new student("deep", 20, 03, 99);
        student.display();
        employee employee = new employee("ajay", 22, 20000.0);
        employee.display();
    }
}
