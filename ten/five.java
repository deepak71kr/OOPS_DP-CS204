package ten;
public class five {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts");
            try {            
                int result = 10 / 0;
                System.out.println("This line will not be executed due to the exception");
            } catch (ArithmeticException e) {
                System.out.println("can't divide zero");
            } finally {
                System.out.println("Inner Finally executed");
            }
        } catch (Exception e) {
            System.out.println("Nested Outer catch block executed");
        } finally {
            System.out.println("Outer finally block executed");
        }
        System.out.println("End of the program");
    }
}
