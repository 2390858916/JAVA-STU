package 类与对象.成员方法;

public class CloneMethod {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "11";
        p.age = 1;
        MyTools  tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        System.out.println(p.name+ "-"+ p.age);
        System.out.println(p2.name+ "-"+ p2.age);

    }
}
class methods{
    String name;
    int age;
}
class  MyTools{
    public Person copyPerson(Person p){
       Person p2 = new Person();
       p2.name = p.name;
       p2.age = p.age;
        return p2;
    }
}
