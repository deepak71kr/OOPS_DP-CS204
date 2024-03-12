package eight;
interface Helper {
    void helperMethod();
}
interface ClassHelper extends Helper {
    void classHelperMethod();
}
class MyClasss implements ClassHelper {
    public void helperMethod() {
        System.out.println("Implementation of helperMethod in MyClass");
    }
    public void classHelperMethod() {
        System.out.println("Implementation of classHelperMethod in MyClass");
    }
}
public class nine {
    public static void main(String[] args) {
      MyClasss obj = new MyClasss();
        obj.helperMethod();
        obj.classHelperMethod();  
    }
 
}
