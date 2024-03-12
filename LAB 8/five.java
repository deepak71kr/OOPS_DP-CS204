package eight;
abstract class Base1 {
    abstract class Base2 {
        abstract void display();
    }
}
class Derived1 extends Base1 {
    class Derived2 extends Base2 {
        void display() {
            System.out.println("Inside Derived2's display method");
        }
    }
}
public class five {
    public static void main(String[] args) {
        Derived1 derived1 = new Derived1();
        Derived1.Derived2 derived2 = derived1.new Derived2();
        derived2.display();
    }
}
