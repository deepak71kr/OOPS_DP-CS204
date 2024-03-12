package eight;
interface MyInterface {
    int myVariable = 10;
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
    void myMethod();
}
class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementing myMethod in MyClass");
    }
}
public class eight {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();
        MyInterface.staticMethod();
        System.out.println("Member variable of MyInterface: " + MyInterface.myVariable);
        obj.myMethod();
    }
}
