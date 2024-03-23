package ten;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            try {
                double result = array[i] / array[i + 1];
                System.out.println("Division of index " + i + " and index " + (i + 1) + " is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero occurred at index " + i +" "+ e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Accessing index " + (i + 1) + " which is not part of the array."+e.getMessage());
            }catch (Exception e) {
                System.out.println("Unknown exception occured " + e.getMessage());
            }
        }
    }
}
