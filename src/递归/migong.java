package �ݹ�;

public class migong {
    public static void main(String[] args) {
        //˼·
        //�����Թ����ö�ά�����ʾ int[][] map = new int[8][7]
        int[][] map = new int[8][7];
        map[3][1] = 1;
        map[3][2] = 1;
        //���ñ߽�
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
    //1��ǽ 2���߹� 3�ǲ�ͨ 0��û�߹�
    public boolean findway(int[][] map,int i,int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0){ //��ǰ��0
                map[i][j] = 2;
                //�� �� �� ��
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
