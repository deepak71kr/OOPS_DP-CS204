package ten;
import java.util.Scanner;

public class eight {
    public static void method1(int num1, int num2) {
        System.out.println("Result of division: " + (num1 / num2));
        System.out.println("In method 1");
    }
    public static void method2(int num1, int num2) {
        method1(num1, num2);
        System.out.println("In method 2");
    }
    public static void method3(int num1, int num2) {
        method2(num1, num2);
        System.out.println("In method 3");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            method3(num1, num2);
        }  catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        System.out.println("End of the program");
    }
}
