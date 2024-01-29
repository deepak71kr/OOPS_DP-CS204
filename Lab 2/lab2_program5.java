import java.util.Scanner;

public class lab2_program5 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.printf("%d occured %d times",arr[i],count);
            System.out.println();
        }
    }
}
