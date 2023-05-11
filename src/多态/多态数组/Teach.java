package 多态.多态数组;

public class Teach extends Person{
    private double selary;

    public Teach(String name, int age,double selary) {
        super(name, age);
        this.selary = selary;
    }

    public double getSelary() {
        return selary;
    }

    public void setSelary(double selary) {
        this.selary = selary;
    }

    @Override
    public String say() {
        return super.say() + selary;
    }


    public void teach(){
        System.out.println("teach" + getName());

    }}
