package this�ؼ���;

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
        System.out.println("����1" + name + "�۸�" + price);
    }
}
