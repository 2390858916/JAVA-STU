package this�ؼ���;

public class Demo2 {
    public static void main(String[] args) {
        Person p1 = new Person("tom",15);
        Person p2 = new Person("jerry" ,16);
        System.out.println("p1�Ƚ�p2" + p1.TestPersion(p2));
        // ʹ��p1ʱ tom �� 15 �ȴ�ֵ�� ���������name��age
        // ��p1�����а�p2��ֵ����p1������TestPerson����
        //
    }
}
class Person{
    private String name; //tom
    private int age; //15
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean TestPersion(Person p){ //p.name = jerry age = 16
       return this.name.equals(p.name) && this.age == p.age;
    }
}
