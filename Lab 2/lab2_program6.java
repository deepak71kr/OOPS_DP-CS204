import java.util.Scanner;

public class lab2_program6 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        int j=0,k=0;
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]%2==0){
                even[j]=arr[i];
                j++;
            }
            else{
                odd[k]=arr[i];
                k++;
            }
        }
        System.out.println("original array is:");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        System.out.println("even elements are:");
        for(int i=0;i<j;i++){
            System.out.printf("%d ",even[i]);
        }
        System.out.println();
        System.out.println("odd elements are:");
        for(int i=0;i<k;i++){
            System.out.printf("%d ",odd[i]);
        }
    }
}
