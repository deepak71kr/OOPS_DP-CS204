package nine;
import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Enter integers for the first list (one integer at a time, enter -1 to stop):");
        int num;
        while ((num = sc.nextInt()) != -1) {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println("Enter integers for the second list (one integer at a time, enter -1 to stop):");
        while ((num = sc.nextInt()) != -1) {
            list2.add(num);
        }

        ArrayList<Integer> combinedList = new ArrayList<>();
        int totalSize = list1.size() + list2.size();

        for (int i = 0; i < list1.size(); i++) {
            combinedList.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            combinedList.add(list2.get(i));
        }
        System.out.println("Combined array list \n"+combinedList);

        System.out.println("Enter a number to be checked:");
        int n = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < combinedList.size(); i++) {
            if (combinedList.get(i) == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + n + " is present in the combined ArrayList.");
        } else {
            System.out.println("The number " + n + " is not present in the combined ArrayList.");
        }
    }
}
