package this¹Ø¼ü×Ö;

public class demo1 {
    public static void main(String[] args) {
        Test t1 = new Test("niubi",18);
        t1.getTest();

    }
}
class Test{
    private String name;
    private int age;
    public Test(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getTest(){
        System.out.println(name + ":" + age);
    }
}
