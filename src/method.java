import java.util.*;
public class method {
    public  int sum(int x, int y){
        int z;
        if(x>y){
             z=x*y;
        }else{
             z=x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        method sm=new method();
        int c=sm.sum(a,b);
        System.out.println(c);
        int a1= sc.nextInt();
        int b1=sc.nextInt();
        int c1=sm.sum(a1,b1);
        System.out.println(c1);
    }
}
