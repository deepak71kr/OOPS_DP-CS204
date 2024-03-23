package ten;
class Employee {
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show() {
        System.out.println("ID: " + ID + "\nName: " + name + "\nAge: " + age);
    }
    public static void showNextId() {
        System.out.println("Next employee ID will be: " + nextId);
    }
}
public class two {
    public static void main(String[] args) {
        Employee X = new Employee("GFG4", 23);
        Employee Y = new Employee("GFG5", 21);
        X.show();
        
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        
        E.show();
        F.show();
        G.show();
        Y.show();
        
        Employee.showNextId();
        System.gc(); 
        
        E.showNextId();
        F.showNextId();
        G.showNextId();
    }
}
