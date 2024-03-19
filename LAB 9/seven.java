package nine;
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: \n");
        String s = scanner.nextLine().toLowerCase();

        boolean[] present = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }
        boolean allPresent = true;
        String missing = "";
        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                allPresent = false;
                missing += (char)('a' + i); 
            }
        }
        if (allPresent) {
            System.out.println("All characters from 'a' to 'z' are present in the string.");
        } else {
            System.out.println("Missing characters: " + missing);
        }
    }
}
