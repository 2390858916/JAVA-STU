package Arraylist.��ά����;

import java.util.Scanner;

public class ��̬��ά���� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("�������ά�������");
        x = sc.nextInt();
        System.out.println("�������ά�������");
        y = sc.nextInt();
        System.out.println(x);
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int col = 0;
                System.out.println("�����ά�����"+i+"�У���"+j+"��");
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
