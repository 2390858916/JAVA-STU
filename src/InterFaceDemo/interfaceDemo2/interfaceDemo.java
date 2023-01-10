package InterFaceDemo.interfaceDemo2;

public class interfaceDemo {
    public static void main(String[] args) {
        Inter i = new Interlmpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(i.num3);
        i.method();
        i.show();
    }
}
