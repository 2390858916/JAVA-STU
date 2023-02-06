package 类与对象.成员方法;

public class Method2 {
    public static void main(String[] args) {
        int[][] map = {{0,1,2},{3,4,5},{6,7,8}};
        method m1 = new method();
        m1.traverse(map);
    }
}
class method{
    public void traverse(int[][] map){
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }
    }
}
