package nine;
import java.util.*;

public class three {
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
        ArrayList<Integer> mix = new ArrayList<>();
        int totalSize = list1.size() + list2.size();
        for (int i = 0; i < list1.size(); i++) {
            mix.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            mix.add(list2.get(i));
        }
        System.out.println("Combined array list \n"+mix);
        
        int min = 1000000;
        for(int i=0; i<mix.size(); ++i){
            if(mix.get(i)<min)
                min = mix.get(i);
        }
        System.out.println("Minimum is: "+min);
        
        int max = -1;
        for(int i=0; i<mix.size(); ++i){
            if(mix.get(i)>max)
                max= mix.get(i);
        }
        System.out.println("Maximum is: "+max);
    }
}
