package shixun;

public class mains {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setColor("黑色");
        phone.setPrice(9999);
        phone.call();
        phone.sendMessage();
    }
}
