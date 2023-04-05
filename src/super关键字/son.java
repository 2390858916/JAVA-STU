package super关键字;

public class son extends fu{
    public void he(){
        System.out.println(super.n1);
    }
    public void of(){
        super.test100();
        super.test200();
        super.test300();
    }
    public son(){
        super("jack",10);
//        super("jack");
    }
    public void sum(){
        System.out.println("son类方法");
        //调用父类cal方法
        //调用顺序是，本类，父类，父类的父类知道 object类
        // 如果存在cal类但是是父类的private类就会返回错误，public类能够正常访问
        cal();
    }
}
