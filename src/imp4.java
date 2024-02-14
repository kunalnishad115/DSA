import java.util.*;
public class imp4 {
    public static void stringsort(String str,int index,int count,String newstr,char element){
        if(index==str.length()){
            for (int i=0;i<count;i++) {
               newstr=newstr+element;
            }
            System.out.println(newstr);
            return;
        }
            char currentc=str.charAt(index);
            if(currentc==element){
                count++;
                stringsort(str,index+1,count,newstr,element);
            }else{
                newstr=newstr+currentc;
                stringsort(str,index+1,count,newstr,element);
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char element=sc.next().charAt(0);
        stringsort(str,0,0," ",element);
    }
}
