package OrtherDemo.test6;

public class demo {
    public static void main(String[] args) {
        cube cube = new cube(12.5);
        System.out.println("边长"+cube.getSide()+"表面积为"+cube.superArea(cube.getSide()));
        System.out.println("边长"+cube.getSide()+"体积为"+cube.getVolume(cube.getSide()));
    }
}
