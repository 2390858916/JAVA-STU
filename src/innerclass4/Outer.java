package innerclass4;

public class Outer {
    private int num = 10;
    public void method(){
        int num2 = 20;
        class inner{
            public void show(){
                System.out.println(num2);
                System.out.println(num);
            }
        }
        inner i = new inner();
        i.show();
    }
}
