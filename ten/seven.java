package ten;
import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException() {
        super("Error: Age cannot be negative");
    }
}

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = scanner.nextInt();
            if (age < 0) {
                throw new NegativeAgeException();
            }
            System.out.println("Your age is: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid age.");
        } finally {
            System.out.println("Finnaly is executed");
        }
    }
}
