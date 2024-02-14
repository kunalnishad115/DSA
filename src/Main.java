//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int row=sc.nextInt();
//        int colum=sc.nextInt();
//        int [][]matrix=new int[row][colum];
//        for(int i=0;i<row;i++) {
//            int j;
//            for (j = 0; j < colum; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
////            System.out.print("your old matrix" + i + " " + j);
//        }
//        System.out.println("old matrix=");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<colum;j++){
////                System.out.println("old matrix=");
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("transpose matrix=");
//        for(int j=0;j<colum;j++){
//            for(int i=0;i<row;i++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
////        String size=sc.next();
//        String [] array=new String[size];
//        int tl=0;
//        for(int i=0;i<size;i++){
//            array[i]=sc.next();
//            tl=tl+array[i].length();
//        }
//        System.out.println(tl);
//    }
//}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email=");
        String email= sc.nextLine();
        String username=" ";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;

            }else{
                username=username+email.charAt(i);
            }
        }
        System.out.print("your user name=");
        System.out.println(username);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(username.substring(x,y));
    }
}