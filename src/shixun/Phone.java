package shixun;

public class Phone {
    String brand;
    float price;
    String color;

    public Phone() {
    }


    public Phone(String brand, float price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void call(){
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + brand + "�ֻ���绰");
    }
    public void sendMessage(){
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + brand + "�ֻ�������");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
