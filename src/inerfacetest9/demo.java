package inerfacetest9;

public class demo {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println("------正方形面积");
        System.out.println(s.area(2));
        System.out.println("------立方体面积");
        System.out.println(s.volume(2));
        System.out.println("--------------------------------------");

        Circle c = new Circle();
        System.out.println("------圆形面积");
        System.out.println(c.area(3));
        System.out.println("------球体体积");
        System.out.println(c.volume(3));
    }
}
