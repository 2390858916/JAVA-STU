package InnerClass.innerClass;

public class first {
    private int num = 10;
    //�ⲿ��
    public class Inner{
        //�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա ����˽��
        // �ⲿ��Ҫ�����ڲ����Ա ���봴������
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
