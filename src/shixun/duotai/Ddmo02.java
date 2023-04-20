package shixun.duotai;

import java.util.Random;
import java.util.Scanner;

public class Ddmo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + i+1 + "位员工的工号");
            int number = sc.nextInt();
            arr[i] = number;
        }
        Random r = new Random();
        int index = r.nextInt(5);
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.println(i + ",");
        }
    }
}
