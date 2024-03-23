package ten;
class myC {
    public void m1() {
        System.out.println("Inside m1");
    }
    public void finalize(){
        System.out.println("Garbage collected");
    }
}
public class one {
    public static void main(String[] args) {
        myC obj1 = new myC();
        myC obj2 = new myC();
        obj1 = obj2;
        obj1 = null;
        System.gc();
    }
}
