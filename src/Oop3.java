class device{
    String devicename;
    int price;
    String use;
    public void infor(String devicename){
        System.out.println(devicename);
    }
    public void infor(String use,String devicename){
        System.out.println(use+devicename);
    }
    public void infor( int price){
        System.out.println(price);
    }

}
public class Oop3 {
    public static void main(String[] args) {
        device d1=new device();
        d1.devicename="rog asus";
        d1.use="using since 1 year";
        d1.price=90000;
        d1.infor(d1.devicename," "+d1.use);
        d1.infor("PRICE="+d1.price);
        device d2=new device();
        d2.price=78000;
        d2.infor("my new device price="+d2.price);
    }
}
