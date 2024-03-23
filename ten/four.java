package ten;
public class four {
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception occurred in method1");
        }
    }
    public static void method2() throws Exception {
        throw new Exception("Exception occurred in method2");
    }
    public static void main(String[] args) {
        try{
            try {
             method1();
             System.out.println("Deepak");
            }catch (Exception e) {
               System.out.println("Root cause of exception:");
            }
        } catch (Exception e) {
            System.out.println("Root cause of exception:");
        }
    }
}
