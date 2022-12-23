package circle;
public class Cicle {
    double x;
    double y;
    double r;
    public Cicle() {
    }
    public  Cicle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getR() {
        return r;
    }
    public double area() {
        return r * r * Math.PI;
    }
    public double perimeter() {
        return 2 * r * Math.PI;
    }
    public void show() {
        System.out.print("x=" + x + ", y=" + y + ", Radius=" + r);
    }
}
