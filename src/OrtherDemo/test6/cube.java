package OrtherDemo.test6;

public class cube {
    private double side;
    public cube(){

    }
    public cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    //表面积
    public double superArea(double side){
        return 6*side*side;
    }
    //计算体积
    public double getVolume(double side){
        return side*side*side;
    }

}
