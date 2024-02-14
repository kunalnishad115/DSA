import java.util.*;
public class Goo2 {
    public static int ways(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }if(i==n-1&&j==m-1){
            return 1;

        }
        int downmove=ways(i+1,j,n,m);
        int rightmove=ways(i,j+1,n,m);
        return downmove+rightmove;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
      int result= ways(0,0,n,m);
        System.out.println(result);

    }
}
