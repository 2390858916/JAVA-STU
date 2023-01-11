package BasesTypePackaging;

import java.util.Arrays;

public class 字符数据排序 {
    public static void main(String[] args) {
        String a = "1 45 11 23 45 8 23 15";
        String[] str = a.split(" ");


        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            //    integer.parsenInt 将整型数据Integer转换为基本数据类行
            arr[i] = Integer.parseInt(str[i]);
            System.out.println(arr[i]);
        }

        //排序
        Arrays.sort(arr);
        //把排序后的int数组进行拼接得到一个字符串，拼接采用Stringbulid来实现
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);

    }

}
