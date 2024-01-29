class vararg{
    void vararg(int...v){
        System.out.println("the total number of elements is:"+v.length);
        int max=0,sum=0;
        for(int i=0;i<v.length;i++){
            if(v[i]>max){
                max=v[i];
            }
            sum=sum+v[i];
        }
        System.out.println("the maximum of the numbers is:"+max);
        System.out.println("sum of the numbers is:"+sum);
    }
}
public class lab3_program3 {
    public static void main(String []args){
        vararg v1=new vararg();
        v1.vararg(10,20,30,70,500,3);
    }
}
