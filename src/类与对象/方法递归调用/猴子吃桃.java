package �������.�����ݹ����;

public class ���ӳ��� {
    public static void main(String[] args) {
        //��10�� 1
        //��9�� (day10 +1) * 2 = 4
        //��8�� (day9 +1) * 2 = 10
        //��һ�� ��ѭ��
        t t1 = new t();
        int num = 9;
        System.out.println(t1.peach(num));
    }

}
class t {
    public int peach(int day){
        if (day==10){
            return 1;
        } else if (day >=1 && day <=9) {
            return (peach(day +1)+1)*2;
        }else {
            return -1;
        }
    }
}
