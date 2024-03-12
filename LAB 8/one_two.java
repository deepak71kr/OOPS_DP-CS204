package eight;
class OuterClass {
    private int var = 10;
    void outerMethod() {
        class InnerClass {
            void display() {
                System.out.println("Value of outer Variable: " + var);
            }
        }
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
public class one_two {
    public static void main(String[] args) {
       OuterClass outer = new OuterClass();
       outer.outerMethod(); 
    }
}
