package this关键字;

public class bookUpPrice {
    public static void main(String[] args) {
        book bo = new book();
        bo.book("niubi",151);
        bo.info();
        bo.updatePrice();
        bo.info();
    }
}
class book{
    String name;
    double price;
    public void book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        if (price>150){
            price = 150;
        }else if (price>100){
            price = 100;
        }
    }
    public void info(){
        System.out.println("书名1" + name + "价格" + price);
    }
}
