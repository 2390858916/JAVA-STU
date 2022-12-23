package inerfacetest9;

public class Square implements Shape{
    @Override
    public double area(double x) {
        return x*x;
    }
    @Override
    public double volume(double x) {
        return x*x*x;
    }
}
