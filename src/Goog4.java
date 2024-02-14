import java.util.*;
public class Goog4 {
    public static int wayss(int n){
        if(n<=1){
            return 1;
        }
        //single
        int way1=wayss(n-1);
        int way2= (n-1)*wayss(n-2);
        return way1+way2;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=wayss(n);
        System.out.println(result);
    }
}
