package ten;
public class six {    
    public static void calDiv() throws Exception {
        try {
            int result = divide(10, 0);
            System.out.println("Result of division: ");
        } catch (ArithmeticException e) {
            throw new Exception("Error processing division");
        }
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend/divisor;
    }
    public static void main(String[] args) throws Exception {
        try {
            calDiv();
        } catch (ArithmeticException e) {
            System.out.println("Printing stack trace using printStackTrace() method:");  
        }
    }
}
