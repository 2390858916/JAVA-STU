package 多态.polyoverr;

public class poly {
    public static void main(String[] args) {

        //animal 编译类型就是animal，运行类型dog
        animal animal = new dog();
        //因为运行时，执行到改行时，animal运行类型是DOG，所以cry就是dog的cry
        animal.cry();

        //animal 编译类型animal 运行类型是cat
        animal = new cat();
        animal.cry();
    }
}
