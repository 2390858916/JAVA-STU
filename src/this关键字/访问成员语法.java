package this�ؼ���;

public class ���ʳ�Ա�﷨ {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
    }
}
class T{
    private String name = "niub";
    private int age;
    public T(){
        //��һ���������з�����һ�������� ������ڵ�һ��
        this("niui",18);
        System.out.println("T ������");
    }
    public T(String name,int age){
        System.out.println("T(canshu) ������");
    }
    public void f1(){
        String name =  "list";
        //�ڷ����в�ʹ��thisĬ��ʹ�������ֵ
        System.out.println("normle"+ name);
        System.out.println("this name"+ this.name);
    }
    public void f2(){
        //��һ�ַ���
        f1();
        //�ڶ��ַ���
        this.f1();
    }
}
