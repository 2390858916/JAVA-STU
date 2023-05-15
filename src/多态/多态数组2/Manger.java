package 多态.多态数组2;

public class Manger extends Employee{
    private double bonus;
    public Manger(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("manger" + getName() + "is manager");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
