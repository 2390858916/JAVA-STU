package 多态.多态数组;

public class Student extends Person{
    private double score;
    public Student(String name, int age,double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say() {
        return super.say() + score;
    }

    public void student(){
        System.out.println("xueshen" + getName());
    }
}
