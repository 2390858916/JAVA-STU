package innerClass2;

public class InnerDemo {
    public static void main(String[] args) {
        //Inner i = new Inner();
        // �÷� ������ ������翴�� ������
        //Outer.Inner i = new Outer().new Inner();
        //i.show();

        //��������˽����
        Outer o = new Outer();
        o.method();
    }
}
