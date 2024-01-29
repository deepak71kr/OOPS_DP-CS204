class bank{
    String name;
    int age;
    void validate(int age){
        if(age>3&&age<15)
            System.out.println("age is valid");
        else
            System.out.println("age is not valid");
    }
    void validate(String name){
        int flag=0;
        for(int i=0;i<name.length();i++){
            if((name.charAt(i)<65)||(name.charAt(i)>90&&name.charAt(i)<97)||(name.charAt(i)>122)){
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("name is valid");
        else
            System.out.println("name is invalid");
    }
}
public class lab3_program2 {
    public static void main(String []args){
        bank b1=new bank();
        b1.name="abhinav";
        b1.age=20;
        b1.validate(b1.age);
        b1.validate(b1.name);
    }
}
