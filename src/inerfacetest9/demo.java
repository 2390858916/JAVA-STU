package inerfacetest9;

public class demo {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("------���������");
        System.out.println(s.area(2));
        System.out.println("------���������");
        System.out.println(s.volume(2));
        System.out.println("--------------------------------------");

        Circle c = new Circle();
        System.out.println("------Բ�����");
        System.out.println(c.area(3));
        System.out.println("------�������");
        System.out.println(c.volume(3));
    }
}
