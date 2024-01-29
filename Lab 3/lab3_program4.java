class test2{
    void anoarr(String[] s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toLowerCase() );
        }
        System.out.println();
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]+"-"+s[i].length());
        }
    }
}
public class lab3_program4 {
    public static void main(String []args){
        test2 t= new test2();
        t.anoarr(new String[]{"abhinav","NiSha","HARsh","AFFaN","madHU"});
    }
}
