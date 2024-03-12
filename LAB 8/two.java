package eight;
abstract class bike{
   public abstract void run();
}
class Honda extends bike{
    public void run(){
        System.out.println("Vroom Vroom");
    }
}
public class two {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}
