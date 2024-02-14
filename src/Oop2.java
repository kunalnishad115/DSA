class myphone{
    String devicename;
    int price;



    //    String usemonth;
    public void muse(){
        System.out.println("use for since 1 year ");
    }
    public void info(){
        System.out.println(this.devicename);
        System.out.println(this.price);
    }
    myphone(){

    }
//    myphone(myphone info2){
//
//    }

   myphone(myphone info2){
        this.devicename= info2.devicename;
        this.price= info2.price;
   }
//   myphone(myphone info3){
//        this.devicename= info3.devicename;
//        this.price= info3.price;
//   }
}
public class Oop2 {
    public static void main(String[] args) {
        myphone info1=new myphone();
        info1.devicename="realme";
        info1.price=29000;
//        info1.info();
//        info1.muse();
        myphone info2=new myphone(info1);
        info2.info();
//        myphone info3=new myphone(info1);
//        info3.info();


    }
}
