import java.util.Scanner;

public class lab2_program3 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        System.out.println("enter total number of elements");
        int totalElement=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<totalElement;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the position of deletion");
        int loc=s.nextInt();
        for(int i=loc;i<totalElement-1;i++){
            arr[i]=arr[i+1];
        }
        totalElement--;
        System.out.println("elements of the array is:");
        for(int i=0;i<totalElement;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
