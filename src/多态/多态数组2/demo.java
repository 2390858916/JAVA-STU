package ��̬.��̬����2;

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
        //�ж����� �����Ա����Ա����work����,����Ǿ����þ����manager����
        if (e instanceof Worker){
            ((Worker) e).work();//����ת��
        }else if(e instanceof Manger){
            ((Manger) e).manage();
        }else{
            System.out.println("error");
        }
    }
}
