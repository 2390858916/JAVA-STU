package OrtherDemo.test6;

public class demo {
    public static void main(String[] args) {
        cube cube = new cube(12.5);
        System.out.println("�߳�"+cube.getSide()+"�����Ϊ"+cube.superArea(cube.getSide()));
        System.out.println("�߳�"+cube.getSide()+"���Ϊ"+cube.getVolume(cube.getSide()));
    }
}
