package ������;

public class Demo {
    public static void main(String[] args) {
        constr c = new constr(18,"30");
        c.dispay();
    }
}
class constr{
    int id;
    String name;
    public constr(int Cid,String Cname){
        System.out.println("���ù�����");
        id = Cid;
        name = Cname;
    }
    public void dispay(){
        System.out.println("id = "+id);
        System.out.println("name = "+name);
    }
}
