package Arraylist.��ά����;

public class Demo1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                      {1,1,1,1,1},
                      {1,1,2,1,1},
                      {4,3,4,5,2}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
