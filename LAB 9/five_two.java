package nine;
import java.util.Scanner;

public class five_two {
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        String reversedString = new String(charArray);
        return reversedString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
