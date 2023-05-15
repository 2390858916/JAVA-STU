package 多态.多态数组2;

public class demo {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 6000);
        Manger milan = new Manger("milan", 5000, 20000);
        demo demo = new demo();
        demo.shwoEmpannual(tom);
        demo.shwoEmpannual(milan);
        demo.testWork(tom);
        demo.testWork(milan);

    }
    //
    public void shwoEmpannual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        //判断类型 如果是员工用员工的work方法,如果是经理用经理的manager方法
        if (e instanceof Worker){
            ((Worker) e).work();//向下转型
        }else if(e instanceof Manger){
            ((Manger) e).manage();
        }else{
            System.out.println("error");
        }
    }
}
