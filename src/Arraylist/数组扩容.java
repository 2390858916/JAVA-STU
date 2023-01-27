package Arraylist;


import java.util.Scanner;

public class 数组扩容 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {
            int[] arr1 =new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            System.out.println("输入的元素数据");
            int num = sc.nextInt();
            arr1[arr1.length-1] = num;
            arr = arr1;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("是否继续 y/n");
            char key = sc.next().charAt(0);
            if (key == 'n'){
                break;
            }
        }while (true);
    }
}
