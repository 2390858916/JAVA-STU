package ��װ��;

public class Encap {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("jack");
        p.setAge(18);
        p.setSalary(200);
        p.info();

    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //������У��
        if (name.length() >=2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("���ֳ��Ȳ���");
            this.name = "nofont";
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1 && age<=120 ){
            this.age = age;
        }else {
            System.out.println("���䲻��ȷ");
            this.age = 18;
        }
    }

    public double getSalary() {
        //�����Ķ�Ȩ��

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void info(){
        System.out.println("name: " + name + " Salary: " + salary + " age: " + age);
    }
}
