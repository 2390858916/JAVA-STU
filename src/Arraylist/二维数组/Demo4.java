package Arraylist.��ά����;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int max = 0;
        int maxindex = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int rom = (int) (Math.random()*100) +1;
            arr[i] = rom;
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n�����ǵ���******************\n");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+"\t");
            sum += arr[i];
            if (max < arr[i]){
                max = arr[i];
                maxindex = i;
            }
            if (arr[i] == 8){
                flag = true;
            }
        }
        System.out.println("\nƽ��ֵ��"+ sum/ arr.length);
        System.out.println("\nmax = "+max + "�±�[" + maxindex + "]");
        if (flag){
            System.out.println("��8");
        }else {
            System.out.println("û8");
        }
    }
}
