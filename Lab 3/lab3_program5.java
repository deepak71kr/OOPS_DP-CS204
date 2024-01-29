class sum{
    void sum(int[] v){
        int sum=0;
        for(int i=0;i<v.length;i++){
            sum=sum+v[i];
        }
        System.out.println("sum of elements is:"+sum);
        System.out.println("array in reverse order is:");
        for(int i=v.length-1;i>=0;i--){
            System.out.printf("%d ",v[i]);
        }
    }
}
public class lab3_program5 {
    public static void main(String []args){
        sum s=new sum();
        s.sum(new int []{10,15,20,25,30,35,40});
    }
}
