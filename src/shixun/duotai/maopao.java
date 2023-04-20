package shixun.duotai;

public class maopao {
    public static void main(String[] args) {
        int[] arr = {55,11,22,35,88,5};
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
