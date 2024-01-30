package four;
import java.util.Scanner;
/*
// a. Private
private int Emp_id;
private String Emp_name;
private String Emp_dept;

// b. Public
public int Emp_id;
public String Emp_name;
public String Emp_dept;

// c. Protected
protected int Emp_id;
protected String Emp_name;
protected String Emp_dept;

// d. Default (No modifier)
int Emp_id;
String Emp_name;
String Emp_dept;
*/
public class one {
    public static class Employee{
        int Emp_id;
        String Emp_name;
        String Emp_dept;
        
        // Constructor
        public Employee(int id, String name, String dept){
            this.Emp_id = id;
            this.Emp_name = name;
            this.Emp_dept = dept;
        }
       
        public int getEmp_id() {
            return Emp_id;
        }
        public void setEmp_id(int emp_id) {
            Emp_id = emp_id;
        }
        public String getEmp_name() {
            return Emp_name;
        }
        public void setEmp_name(String emp_name) {
            Emp_name = emp_name;
        }
        public String getEmp_dept() {
            return Emp_dept;
        }
        public void setEmp_dept(String emp_dept) {
            Emp_dept = emp_dept;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter Name: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        
        Employee employee = new Employee(id, name, dept);
        
        System.out.println("\nEmployee details:");
        System.out.println("ID: " + employee.getEmp_id());
        System.out.println("Name: " + employee.getEmp_name());
        System.out.println("Department: " + employee.getEmp_dept());
    }
}
