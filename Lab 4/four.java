package four;
import java.util.*;
public class four {
    public static class Student {
        String stu_name;
        int[] stu_marks;

        public Student(String name, int[] marks) {
            this.stu_name = name;
            this.stu_marks = marks;
        }

        public double calAvg() {
            int sum = 0;
            for (int mark : stu_marks) {
                sum += mark;
            }
            return (double) sum / stu_marks.length;
        }
    }

    public static void main(String[] args) {
        int[] marks1 = {52,56,25,96,46};
        int[] marks2 = {69,58,98,75,85};
        int[] marks3 = {85,74,98,78,65};

        Student student1 = new Student("Deep", marks1);
        Student student2 = new Student("Panther", marks2);
        Student student3 = new Student("Thor", marks3);
        
        System.out.println("Average mark for Deep: " + student1.calAvg());
        System.out.println("Average mark for Panther: " + student2.calAvg());
        System.out.println("Average mark for Thor: " + student3.calAvg());
    }
}
