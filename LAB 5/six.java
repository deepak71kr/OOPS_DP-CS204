package five;
import java.util.Scanner;
class Nword{
    int x;
    Nword(char c){
        this.x = c-'a'+1;
    }
}
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Nword N = new Nword(c);
        System.out.println(N.x);
    }
 
}
