package �������.��Ա����;

public class �������ݴ��λ��� {
    public static void main(String[] args) {
        swap sw = new swap();
        int a = 10;
        int b = 20;
        //ֵ����
        sw.swap1(a,b);
        System.out.println("a=" + a + "; b=" + b);

        //��ַ����
        int[] arr = {1,3,4};
        sw.adress(arr);
        System.out.println(arr[0]);

    }
}
class swap{
    public void swap1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public void adress(int[] arr){
        arr[0] = 200;
        System.out.println(arr[0]);

    }
}
