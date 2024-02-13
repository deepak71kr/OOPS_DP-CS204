package five;
public class PrintNumber {
    public static void main(String[] args) {
        int i = 3;
        double d = 5.6;
        
        //Autoboxing
        Integer I = new Integer(i);
        Double D = new Double(d);
        
        //Unboxing
        int ii = I;
        double dd = D;
        
        System.out.println("Autoboxing "+I);
        System.out.println("Autoboxing "+D);
        System.out.println("");
        System.out.println("Unboxing "+ii);
        System.out.println("Unboxing "+dd);
        
    }
}
