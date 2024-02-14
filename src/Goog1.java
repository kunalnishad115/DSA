import java.util.*;
public class Goog1 {
    public static void strpermuta(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char cc=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            strpermuta(newstr,permutation+cc);
//            return;


        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String permutation="";
        strpermuta(str,permutation);
    }
}
