package Extends.circle;

public class Cylinder extends Cicle{
        double h;
        Cylinder(double x, double y, double r, double h) {
            super(x, y, r);
            this.h = h;
        }
        public void setH(double h) {
            this.h = h;
        }
        public double getH() {
            return h;
        }
        public double area() {
            return perimeter() * h + super.area() * 2;
        }
        public double volume() {
            return super.area() * h;
        }
}
