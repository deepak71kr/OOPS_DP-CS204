package eight;
interface Helper1 {
    void helperMethod1();
    interface NestedHelper1 {
        void nestedHelperMethod1();
    }
}
interface ClassHelper1 extends Helper1.NestedHelper1 {
    void classHelperMethod1();
}
class MyClass1 implements ClassHelper1 {
    public void nestedHelperMethod1() {
        System.out.println("Nested Helper Method in MyClass");
    }
    public void classHelperMethod1() {
        System.out.println("Class Helper Method in MyClass");
    }
}
public class ten {
    public static void main(String[] args) {
        MyClass1 myInstance = new MyClass1();

        myInstance.nestedHelperMethod1();
        ((Helper1.NestedHelper1) myInstance).nestedHelperMethod1();
        myInstance.classHelperMethod1();
        
    }
}
