package eight;
class OutClass {
    private int outVar = 10;

    class InnClass {
        void display() {
            System.out.println("Value of outerVariable: " + outVar);
        }
    }
}
public class one_one {
    public static void main(String[] args) {
        OutClass outer = new OutClass();
        OutClass.InnClass inner = outer.new InnClass();
        inner.display();   
    }
    
}
