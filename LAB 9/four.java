package nine;
import java.util.*;

public class four {
    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine().toLowerCase();

        boolean result = checkAnagram(str1, str2);

        if (result) System.out.println("The two strings are anagrams.");
        else System.out.println("The two strings are not anagrams.");
        
    }
}

    

