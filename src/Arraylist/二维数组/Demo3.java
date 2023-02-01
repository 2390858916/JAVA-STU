package Arraylist.二维数组;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner sc = new Scanner(System.in);
        int news = 0;
        int temp = 0;
        //复制新数组
        do {
            int[] newarr = new int[arr.length+1];
            System.arraycopy(arr, 0, newarr, 0, arr.length);
            System.out.println("输入要添加的数");
            news = sc.nextInt();
            newarr[newarr.length-1] = news;
            arr = newarr;
            //排序
            for (int i = 0; i < newarr.length-1; i++) {
                boolean flag1 = false;
                for (int j = 0; j < newarr.length-i-1; j++) {
                    if (newarr[j] > newarr[j+1]){
                        temp = newarr[j];
                        newarr[j] = newarr[j+1];
                        newarr[j+1] = temp;
                    }
                }
            }
            System.out.println("当前数组");
            for (int j : newarr) {
                System.out.print(j+"\t");
            }
            System.out.println("是否继续y/n");
            char flag = sc.next().charAt(0);
            if (flag == 'n'){
                break;
            }
        }while (true);
    }
}
