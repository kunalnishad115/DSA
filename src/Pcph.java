
import java.util.*;
public class Pcph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) {
            System.out.println(a);
        }else{
            System.out.println(a+a);
        }
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if((i+j)%2==0){
                    System.out.print("C");
                }else{
                    System.out.print(".");
                }
//              arr[i][i]=sc.nextInt();
            }
            System.out.println();
        }
    }
}