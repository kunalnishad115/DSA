class laptop{
    String brand;
    int price;

    public laptop() {

    }

    public void task(){
    System.out.println("coding and much more");
}
public void print(){
    System.out.println(this.brand);
    System.out.println(this.price);
}
laptop(laptop l2){
    this.price=l2.price;
    this.brand=l2.brand;
    System.out.println("zoo");
}

//    public void price() {
//    }
}
public class Oop1 {
    public static void main(String[] args) {
        laptop l1=new laptop();
        l1.brand="asus";
        l1.price= 986272;
        l1.task();



        laptop l2=new laptop(l1);
//        l2.brand="mac";
//        l2.price=77279;
        l1.print();
        l2.print();

    }
}
