package BasesTypePackaging.IntergerDemo01;

public class װ��Ͳ��� {
    public static void main(String[] args) {
        //װ�䣺 �ѻ�����������װ��Ϊ��Ӧ�İ�װ������
        //װ��
        Integer i = Integer.valueOf(100);
        //�Զ�װ��
        Integer ii = 100;

        //����
        //i += 200
        //ii.intValue() + = 20
        //�Զ�װ��  �Զ�����
        ii = ii.intValue() + 20;
        //����ii.intValue()
        ii += 20;
        System.out.println(ii);

        //��ָ��
        Integer iii = null;
        if(null == iii){
            iii +=200;
        }


    }
}
