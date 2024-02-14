//import java.util.* ;
//import java.io.*;
//
//public class Cd {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];
//        int max=arr[0];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//            if(arr[i]>max){
//                max=arr[i];
//            }
//
//        }
//
//        System.out.println(max);
//
//
//
//    }
//
//
//}
import java.util.*;
public class Cd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for( i=arr[0];i<arr.length;i++){
                if(arr[0]>arr[0+1]){
                    System.out.println("array is sorted");
                }else{
                    System.out.println("not");
                }
            }
        }

    }
}
