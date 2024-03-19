package nine;
import java.util.Scanner;

public class ten {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean isPalindrome1 = isPalindrome(str1);
        boolean isPalindrome2 = isPalindrome(str2);

        if (isPalindrome1 && isPalindrome2) {
            String str3 = str1.concat(str2);
            System.out.println("Both strings are palindromes.");
            System.out.println("Concatenated string: " + str3);
        } else {
            System.out.println("At least one of the strings is not a palindrome.");
        }
    }
}
