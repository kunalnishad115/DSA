import java.util.*;
public class Recuimp2 {
    public static void reverse(String name,int index){
        if(index==0){
            System.out.println(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));
        reverse(name,index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        reverse(name,name.length()-1);
    }
}
