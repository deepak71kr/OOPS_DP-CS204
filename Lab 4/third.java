package four;
import java.util.*;
public class third {
    public static class Student {
        int stu_roll;
        String stu_name;
        int[] stu_marks = new int[5];

        public Student() {
            this.stu_name = "Unknown";
            this.stu_roll = 0;
            Arrays.fill(this.stu_marks, 0);
        }

        public Student(int roll, String name, int[] marks) {
            this.stu_roll = roll;
            this.stu_name = (name == null) ? "Unknown" : name;
            this.stu_marks = (marks == null) ? new int[5] : marks;
        }

        public void printDetails() {
            System.out.println("Roll: " + stu_roll);
            System.out.println("Name: " + stu_name);
            System.out.println("Marks: " + Arrays.toString(stu_marks));
        }
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.printDetails();

        int[] marks = {50, 62, 89, 57, 96};
        Student student2 = new Student(10003, "Deep", marks);
        student2.printDetails();
    }
}
