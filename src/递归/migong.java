package 递归;

public class migong {
    public static void main(String[] args) {
        //思路
        //创建迷宫，用二维数组表示 int[][] map = new int[8][7]
        int[][] map = new int[8][7];
        map[3][1] = 1;
        map[3][2] = 1;
        //设置边界
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("  ");
        }
        System.out.println(" ");

        migon  mg = new migon();
        mg.findway(map,1,1);
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("  ");
        }
    }
}
class migon {
    //1是墙 2是走过 3是不通 0是没走过
    public boolean findway(int[][] map,int i,int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0){ //当前是0
                map[i][j] = 2;
                //下 右 上 左
                if (findway(map,i+1,j)){
                    return true;
                }else if (findway(map,i,j+1)){
                    return true;
                } else if (findway(map,i-1,j)) {
                    return true;
                }else if(findway(map, i, j-1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
