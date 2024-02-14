import java.util.Scanner;

  class number{
//    static String="kunal";
    int n;
    public void num(int n){
        System.out.println("YOUR NUMBER="+n);
    }
    public void easy(){
        System.out.println("easy pissy");
    }
}
class square extends number{
    public void squ(int n){
        System.out.println("THE SQUARE OF GIVEN NUMBER="+n*n);
    }
}
class quibe extends square{
    public void qui(int n){
        System.out.println("THE QUIBE OF GIVEN NUMBER="+n*n*n);
    }
}
public class Oop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        number n1=new number();
        int obj=n1.n=sc.nextInt();
        n1.easy();
//        n1.number();
        n1.num(n1.n);
        square s1=new square();
        s1.n= obj;
        s1.squ(s1.n);
        quibe q1=new quibe();
        q1.n= obj;
        q1.qui(q1.n);


    }
}
