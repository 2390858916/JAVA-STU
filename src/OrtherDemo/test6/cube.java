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
    //�����
    public double superArea(double side){
        return 6*side*side;
    }
    //�������
    public double getVolume(double side){
        return side*side*side;
    }

}
