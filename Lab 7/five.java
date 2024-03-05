package deepak;
class base{
    void display(){
        System.out.println("This is display of base class");
    }
}
class derived extends base{
    void show(){
        System.out.println("This is show of derived class");
    }
}
public class five {
    public static void main(String[] args) {
        base b1 = new base();
        b1.display();
        
        base b2 = new derived();
        b2.display();
//        b2.show();
    }
  
}
