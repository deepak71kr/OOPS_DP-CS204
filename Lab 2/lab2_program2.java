import java.util.Scanner;

public class lab2_program2 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int sizeOfArray=s.nextInt();
        System.out.println("enter number of elements");
        int numberOfElement=s.nextInt();
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<numberOfElement;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter position:");
        int position=s.nextInt();
        System.out.println("enter element to be inserted:");
        int element=s.nextInt();
        for(int i=position;i<numberOfElement;i++){
            arr[i+1]=arr[i];
        }
        arr[position]=element;
        numberOfElement++;
        System.out.println("elements of the array is:");
        for(int i=0;i<numberOfElement;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
