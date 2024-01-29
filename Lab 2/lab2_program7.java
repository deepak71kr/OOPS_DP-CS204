import java.util.Scanner;

public class lab2_program7 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter position from which array is splited");
        int pos=s.nextInt();
        int arr1[]=new int[pos];
        int arr2[]=new int[n-pos];
        for(int i=0;i<pos;i++){
            arr1[i]=arr[i];
        }
        for(int i=pos;i<n;i++){
            arr2[i-pos]=arr[i];
        }
        System.out.println("duplicate elements of first array are:");
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j])
                    System.out.println(arr1[i]+" ");
            }
        }
        System.out.println("duplicate elements of second array are:");
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j])
                    System.out.println(arr2[i]+" ");
            }
        }
    }
}
