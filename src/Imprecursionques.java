import java.util.*;
public class Imprecursionques {

    public static void hanoi(int disk, String source,String helper,String desti ){
        if(disk==1){
            System.out.println(disk+"disk transfer"+"from"+" "+source+"to"+desti);
            return;
        }
        hanoi(disk-1,source,desti,helper);
        System.out.println(disk+"disk transfer "+"from"+" "+source+"to"+desti);
        hanoi(disk-1,helper,source,desti);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter your number of disk=");
       int disk=sc.nextInt();
       hanoi(disk,"SOURCE","HELPER","DESTI");
    }
}
