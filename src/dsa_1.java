//import java.util.*;

//public class dsa_1 {
//    public static void reverse(int n,int f){
////        int end=sc.ne
//        if(n==f){
//            return;
//        }
//        System.out.println(n);
//        reverse(n-1,f);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int f= sc.nextInt();
//        reverse(n,f);
//    }
//}
//import java.util.*;
//public class dsa_1 {
//    public static void sumofn(int st,int fin,int sum){
//        if(st==fin){
//            sum=sum+st;
//            System.out.println(sum);
//            return;
//        }
//        sum=sum+st;
//        sumofn(st+1,fin,sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int st= sc.nextInt();;
//        int fin=sc.nextInt();
//       int sum=0;
//        sumofn(st,fin,sum);
//    }
//}
//import java.util.*;
//public class dsa_1 {
//    public static void fabbinacci(int a, int b,int fin){
//        if(fin==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        fabbinacci(b,c,fin-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=0;
//        int b=1;
//        int fin=sc.nextInt();
//        fabbinacci(a ,b,fin-2);
//    }
//}
//import java.util.*;
//public class dsa_1 {
//    public static int power(int a, int b){
//        if(b==0){
//            return 1;
//        }if(a==0){
//            return 0;
//        }
//        int powercalc=power(a,b-1);
//        int powerc=a*powercalc;
//        return powerc;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt(); //a^b;
//        int b=sc.nextInt();
//        int ans=power(a,b);
//        System.out.println(ans);
//
//
//    }
//}
import java.util.*;
public class dsa_1 {
    public static int logpow(int a, int b){
        if(b==0){
            return 1;
        }if(a==0){
            return 0;
        }
        //even power
        if(b%2==0){                                      //they
            return logpow(a,b/2)*logpow(a , b/2);  //    are
        }else {//odd power                               //       important
            return logpow(a,b/2)*logpow(a,b/2)*a;  //               because it takes less memory and satisfy algoritham.
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=logpow(a,b);
        System.out.println(ans);
    }
}