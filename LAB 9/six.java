package nine;
import java.util.Scanner;

public class six {
    public static String removeLeadingZeros(String s) {
        int index = 0;
        while (index<s.length() && s.charAt(index)=='0') {
            index++;
        }
        String result = s.substring(index);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String ss = scanner.nextLine();
        ss = removeLeadingZeros(ss);
        System.out.println("String after removing leading zeros: " + ss);
    }
}
