import java.util.Scanner;

public class lab2_program8 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        System.out.println("enter elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("peak elements are");
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}
