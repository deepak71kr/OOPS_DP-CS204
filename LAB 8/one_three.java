package eight;
class OuterrClass {
    private static int var = 10;

    static class NestedClass {
        void display() {
            System.out.println("Value of outer Static Variable: " + var);
        }
    }
}
public class one_three {
    public static void main(String[] args) {
      OuterrClass.NestedClass nested = new OuterrClass.NestedClass();
        nested.display();  
    }
}