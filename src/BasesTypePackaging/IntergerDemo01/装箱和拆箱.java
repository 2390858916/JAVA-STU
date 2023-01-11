package BasesTypePackaging.IntergerDemo01;

public class 装箱和拆箱 {
    public static void main(String[] args) {
        //装箱： 把基本数据类型装换为对应的包装类类型
        //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100;

        //拆箱
        //i += 200
        //ii.intValue() + = 20
        //自动装箱  自动拆箱
        ii = ii.intValue() + 20;
        //隐含ii.intValue()
        ii += 20;
        System.out.println(ii);

        //空指针
        Integer iii = null;
        if(null == iii){
            iii +=200;
        }


    }
}
