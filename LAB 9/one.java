package nine;
import java.util.*;

class test1{
    public void createInteger(){
        ArrayList<Integer> intt = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Integers to be entered");
        int n = sc.nextInt();
        for(int i=0; i<n; ++i){
            intt.add(sc.nextInt());
        }
        System.out.println(intt+"\n");
        
        System.out.println("Insert an element into the array list at first position");
        intt.add(0, sc.nextInt());
        System.out.println(intt+"\n");
        
        System.out.println("Remove any specific elements from the array list");
        intt.remove(sc.nextInt());
        System.out.println(intt+"\n");
        
        System.out.println("Sorted Array list");
        Collections.sort(intt);
        System.out.println(intt+"\n");
    }
    public void createString(){
        ArrayList<String> strr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Strings to be entered");
        int s = sc.nextInt();
        for(int i=0; i<s; ++i)
            strr.add(sc.next());
        System.out.println(strr+"\n");
        
        System.out.println("Insert an string into the array list at first position");
        strr.add(0, sc.next());
        System.out.println(strr+"\n");
        
        System.out.println("Remove any specific elements from the array list");
        strr.remove(sc.nextInt());
        System.out.println(strr+"\n");
        
        System.out.println("Sorted Array list");
        Collections.sort(strr);
        System.out.println(strr+"\n");
    }
}
public class one {
    public static void main(String[] args) {
        test1 obj1 = new test1();
        obj1.createInteger();
        obj1.createString();
        
    }
}
