package nine;
import java.util.Scanner;

public class eleven {
    public static boolean end(String str, String substring) {
        if (str.length() < substring.length()) {
            return false;
        }
        String endOfStr = str.substring(str.length() - substring.length());
        return endOfStr.equals(substring);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the third string (ending substring): ");
        String es = scanner.nextLine();

        boolean result1 = end(str1, es);
        boolean result2 = end(str2, es);
        System.out.println("Result for the first string: " + result1);
        System.out.println("Result for the second string: " + result2);
    }
}

