package �������.��Ա����;

public class Method1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(10);
        int returnsum = p1.getSum(10,20);
        System.out.println(returnsum);
    }
}
class Person{
    String name;
    int age;
    //1. public ��������  void����û�з���ֵ speak������ ��������Ϊ�գ�û�д���Ĳ���
    public void speak(){
        System.out.println("������");
    }
    public void cal01(){
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res +=i;
        }
        System.out.println(res);
    }
    public void cal02(int n){
        int res = 0;
        for (int i = 1; i <= n ; i++) {
            res += i;
        }
        System.out.println(res);
    }
    public int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
