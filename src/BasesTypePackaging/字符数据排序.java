package BasesTypePackaging;

import java.util.Arrays;

public class �ַ��������� {
    public static void main(String[] args) {
        String a = "1 45 11 23 45 8 23 15";
        String[] str = a.split(" ");


        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            //    integer.parsenInt ����������Integerת��Ϊ������������
            arr[i] = Integer.parseInt(str[i]);
            System.out.println(arr[i]);
        }

        //����
        Arrays.sort(arr);
        //��������int�������ƴ�ӵõ�һ���ַ�����ƴ�Ӳ���Stringbulid��ʵ��
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
