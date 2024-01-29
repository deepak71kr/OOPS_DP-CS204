import java.util.Scanner;

public class lab2_program4 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter element to be searched");
        int element=s.nextInt();
        int flag=0;
        int position=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                flag=1;
                position=i+1;
                break;
            }
        }
        if(flag==1){
            System.out.printf("the element %d is at %d",element,position);
        }
        else
            System.out.println("element not found");
    }
}
