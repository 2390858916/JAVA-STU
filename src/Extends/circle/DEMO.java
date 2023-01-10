package Extends.circle;

public class DEMO {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(2, 3, 4, 5);
        cylinder.show();
        System.out.println(", Height=" + cylinder.getH());
        System.out.println("面积=" + cylinder.area());
        System.out.println("体积=" + cylinder.volume());
    }
}
