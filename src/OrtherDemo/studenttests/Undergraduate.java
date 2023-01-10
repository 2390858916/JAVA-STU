package OrtherDemo.studenttests;

public class Undergraduate extends Student {
    public String degree;
    public Undergraduate(String degree) {
        this.degree = degree;
    }
    public Undergraduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void show() {
        System.out.println("姓名：" + name + "年龄：" + age + "学位：" + degree);
    }
}
