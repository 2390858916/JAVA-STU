package innerclassmiming;

public class Outer {
    public void method(){
//        new Inter(){
//            @Override
//            public void show() {
//                System.out.println("method yinchang");
//            }
//        }.show();
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("method neibulei");
            }
        };
        i.show();
        i.show();
    }
}
