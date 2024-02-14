import java.util.*;
public class Sequence {
    public static void sequences(String str,int index,String newstr,HashSet<String> uniq){
        if(index==str.length()){
            if(uniq.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                uniq.add(newstr);
                return;

            }

        }
        char currentchar=str.charAt(index);
        sequences(str,index+1,newstr+currentchar,uniq);
        sequences(str,index+1,newstr,uniq);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=0;
        String newstr="";
        HashSet<String> uniq=new HashSet<>( );
        sequences(str,index,newstr,uniq);
    }
}
