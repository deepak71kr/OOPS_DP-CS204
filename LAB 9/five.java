package nine;
import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.next();
        
        ArrayList<Character> c = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++){
            c.add(input.charAt(i));
        }
        
        int start = 0;
        int end = c.size() - 1;
        while (start < end) {
            char temp = c.get(start);
            c.set(start, c.get(end));
            c.set(end, temp);
            start++;
            end--;
        }
        System.out.println("Reverse character is \n" + c);
    }
}
