package eight;
interface Interface1{
   public void method1();
    default void defaultMethod(){
        System.out.println("Default method of Interface1");
    }
}
interface Interface2{
   public void method2();
    default void defaultMethod(){
        System.out.println("Default method of Interface2");
    }
}
class ChildClass implements Interface1, Interface2{
    public void method1(){
       System.out.println("..");
    }
    public void method2(){
       System.out.println("...");
    }
    public void defaultMethod(){
       System.out.println("Default method of Interface2");
    }

    void callDefaultMethods() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
public class seven{
    public static void main(String[] args){
        ChildClass child = new ChildClass();

        Interface1 interface1Ref = child;
        Interface2 interface2Ref = child;
        interface1Ref.defaultMethod();
        interface2Ref.defaultMethod(); 

}
}
