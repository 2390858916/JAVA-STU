package InterFaceDemo.inerfacetest9;

public  class Circle implements Shape{
    @Override
    public double area(double x) {
        return Math.PI*x*x;
    }

    @Override
    public double volume(double x) {
        return 4*Math.PI*x*x*x/3;
    }
}
