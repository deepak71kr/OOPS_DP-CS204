package nine;
import java.util.Scanner;
public class eight {
    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) System.out.println("Equals");
        else System.out.println("Not Equals");
        
        if (str1.equalsIgnoreCase(str2)) System.out.println("Equal Ignore case");
        else System.out.println("NOT equal Ignore case");
        
        int result = str1.compareTo(str2);
        if (result == 0) System.out.println("Equals CompareTo");
        else if (result < 0) System.out.println("1st string comes first");
        else System.out.println("2nd string comes first");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();
        compareStrings(str1, str2);
    }
}
