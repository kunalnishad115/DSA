import java.util.*;
public class Imp3 {
    public static String sortedcheck(int array[],int index){
        if(index==array.length-1){
            return "ARRAY IS SORTED";
        }
        if(array[index]<array[index+1]){
            return sortedcheck(array,index+1);
        }else{
            return "ARRAY IS NOT SORTED";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size= sc.nextInt();
        int array []=new int[size];
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        String result= sortedcheck(array,0);
        System.out.println(result);
    }
}
