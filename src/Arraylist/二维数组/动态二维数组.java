package Arraylist.二维数组;

import java.util.Scanner;

public class 动态二维数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("请输入二维数组的行");
        x = sc.nextInt();
        System.out.println("请输入二维数组的列");
        y = sc.nextInt();
        System.out.println(x);
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int col = 0;
                System.out.println("输入二维数组第"+i+"行，第"+j+"列");
                col = sc.nextInt();
                arr[i][j] = col;
            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j]+"\n");
            }
            System.out.println(" ");
        }
    }
}
