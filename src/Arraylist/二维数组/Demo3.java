package Arraylist.��ά����;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner sc = new Scanner(System.in);
        int news = 0;
        int temp = 0;
        //����������
        do {
            int[] newarr = new int[arr.length+1];
            System.arraycopy(arr, 0, newarr, 0, arr.length);
            System.out.println("����Ҫ��ӵ���");
            news = sc.nextInt();
            newarr[newarr.length-1] = news;
            arr = newarr;
            //����
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
            System.out.println("��ǰ����");
            for (int j : newarr) {
                System.out.print(j+"\t");
            }
            System.out.println("�Ƿ����y/n");
            char flag = sc.next().charAt(0);
            if (flag == 'n'){
                break;
            }
        }while (true);
    }
}
